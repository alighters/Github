/*
 * Copyright (C) 2016 david.wei (lighters)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.lighters.github.data.net;

import android.text.TextUtils;
import android.util.Log;
import com.lighters.github.data.exception.APIException;
import com.lighters.github.data.exception.ApiErrorModel;
import com.lighters.github.data.net.mingdao.common.AuthEntity;
import com.lighters.github.data.net.mingdao.common.NetConstant;
import com.lighters.github.data.repository.login.TokenRepository;
import com.lighters.github.data.repository.login.UserRepository;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.inject.Inject;
import rx.Observable;
import rx.functions.Action1;
import rx.functions.Func1;

/**
 * Created by david on 16/3/24.
 * Email: huangdiv5@gmail.com
 * GitHub: https://github.com/david-wei
 */
public class ProxyHandler implements InvocationHandler {

    public static final String TAG = "Proxy";

    private Object mObject;

    @Inject
    TokenRepository mTokenRepository;

    private String password;

    @Inject
    public ProxyHandler(TokenRepository tokenRepository) {
        super();
        this.mTokenRepository = tokenRepository;
    }

    public void setObject(Object obj) {
        this.mObject = obj;
    }

    @Override
    public Object invoke(Object proxy, final Method method, final Object[] args) throws Throwable {
        Object result = null;
        Log.d(TAG, method.getName() + ":" + args.toString());
        result = Observable.just(null)
            .flatMap(new Func1<Object, Observable<?>>() {
                @Override
                public Observable<?> call(Object o) {
                    try {
                        if (!TextUtils.isEmpty(password)) {
                            args[args.length - 1] = password;
                        }
                        return (Observable<?>) method.invoke(mObject, args);
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                    }
                    ApiErrorModel apiErrorModel = new ApiErrorModel();
                    apiErrorModel.setError_code("-100");
                    apiErrorModel.setError_msg("method call error");
                    return Observable.just(new APIException(apiErrorModel));
                }
            }).retryWhen(new Func1<Observable<? extends Throwable>, Observable<?>>() {
                @Override
                public Observable<?> call(Observable<? extends Throwable> observable) {
                    return observable.flatMap(new Func1<Throwable, Observable<?>>() {
                        @Override
                        public Observable<?> call(Throwable throwable) {
                            if (throwable instanceof APIException) {
                                if (((APIException) throwable).getApiErrorModel() != null) {
                                    ApiErrorModel errModel = ((APIException) throwable).getApiErrorModel();
                                    switch (errModel.getError_code()) {
                                        case NetConstant.ERROR_CODE_PARAMETER_LACK:
                                        case NetConstant.ERROR_CODE_TOKEN_INVALID:
                                        case NetConstant.ERROR_CODE_WRONG_PASSWORD:
                                            return mTokenRepository.refreshToken().doOnNext(new Action1<AuthEntity>() {
                                                @Override
                                                public void call(AuthEntity authEntity) {
                                                    password = "www123456";
                                                }
                                            });
                                        case NetConstant.ERROR_CODE_TOKEN_NOT_EXIST:
                                            break;
                                    }
                                }
                            }
                            return Observable.just(throwable);
                        }
                    });
                }
            });
        //Log.d(TAG, result.getClass() + ":" + result.toString());
        return result;
    }
}

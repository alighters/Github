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

package com.lighters.github.data.repository.login;

import com.lighters.github.data.net.mingdao.common.AuthEntity;
import com.lighters.github.data.net.mingdao.common.LoginService;
import com.lighters.github.data.net.mingdao.common.NetConstant;
import javax.inject.Inject;
import javax.inject.Singleton;
import retrofit2.Retrofit;
import rx.Observable;
import rx.functions.Action1;

/**
 * Created by david on 16/3/27.
 * Email: huangdiv5@gmail.com
 * GitHub: https://github.com/david-wei
 */
@Singleton
public class TokenRepository {

    LoginCache mLoginCache;
    Retrofit mRetrofit;

    @Inject
    public TokenRepository(LoginCache loginCache, Retrofit retrofit) {
        mLoginCache = loginCache;
        mRetrofit = retrofit;
    }

    /**
     * 刷新token
     */
    public Observable<AuthEntity> refreshToken() {
        return mRetrofit.create(LoginService.class)
            .refreshToken(NetConstant.MD_APP_KEY, NetConstant.MD_APP_SECRET, LoginService.GrantType.REFRESH_TOKEN,
                mLoginCache.mEntity.getRefresh_token())
            .doOnNext(new Action1<AuthEntity>() {
                @Override
                public void call(AuthEntity authEntity) {
                    if (mLoginCache.mEntity == null) {
                        mLoginCache.mEntity = authEntity;
                    } else {
                        mLoginCache.mEntity.setRefresh_token(authEntity.getRefresh_token());
                        mLoginCache.mEntity.setAccess_token(authEntity.getAccess_token());
                    }
                }
            });
    }
}

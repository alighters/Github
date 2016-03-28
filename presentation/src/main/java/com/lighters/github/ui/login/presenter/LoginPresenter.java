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

package com.lighters.github.ui.login.presenter;

import com.lighters.github.data.exception.APIException;
import com.lighters.github.data.net.mingdao.common.AuthEntity;
import com.lighters.github.domain.di.PerActivity;
import com.lighters.github.domain.viewdata.login.LoginViewData;
import com.lighters.github.ui.base.IBasePresenter;
import com.lighters.github.ui.login.view.ILoginView;
import javax.inject.Inject;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by david on 16/3/26.
 * Email: huangdiv5@gmail.com
 * GitHub: https://github.com/david-wei
 */
@PerActivity
public class LoginPresenter implements IBasePresenter<ILoginView> {

    LoginViewData mViewData;

    ILoginView mView;

    @Inject
    public LoginPresenter(LoginViewData viewData) {
        mViewData = viewData;
    }

    @Override
    public void resume() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void destroy() {

    }

    @Override
    public void setView(ILoginView view) {
        mView = view;
    }

    public void login(String userName, String password) {
        mViewData.login(userName, password)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(new Subscriber<AuthEntity>() {
                @Override
                public void onCompleted() {

                }

                @Override
                public void onError(Throwable e) {
                    if (e instanceof APIException) {
                        mView.showError(((APIException) e).getApiErrorModel().getError_msg());
                    }else{
                        mView.showError(e.toString());
                    }
                }

                @Override
                public void onNext(AuthEntity authEntity) {
                    mView.showData(authEntity);
                }
            });
    }
}

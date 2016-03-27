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

import com.lighters.github.domain.viewdata.login.LoginViewData;
import com.lighters.github.domain.viewdata.repo.RepoListViewData;
import com.lighters.github.ui.base.IBasePresenter;
import com.lighters.github.ui.login.view.ILoginView;
import com.lighters.github.ui.repo.view.IRepoListView;
import javax.inject.Inject;

/**
 * Created by david on 16/3/26.
 * Email: huangdiv5@gmail.com
 * GitHub: https://github.com/david-wei
 */
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
}

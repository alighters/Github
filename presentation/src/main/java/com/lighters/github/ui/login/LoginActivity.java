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

package com.lighters.github.ui.login;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.Bind;
import com.lighters.github.R;
import com.lighters.github.data.net.mingdao.common.AuthEntity;
import com.lighters.github.ui.base.BaseActivity;
import com.lighters.github.ui.login.component.DaggerLoginComponent;
import com.lighters.github.ui.login.component.LoginComponent;
import com.lighters.github.ui.login.presenter.LoginPresenter;
import com.lighters.github.ui.login.view.ILoginView;
import javax.inject.Inject;

/**
 * The main mPage about the program.
 */
public class LoginActivity extends BaseActivity implements ILoginView {

    @Bind(R.id.et_login_name)
    EditText mEditTextName;
    @Bind(R.id.et_login_pwd)
    EditText mEditTextPwd;
    @Bind(R.id.bt_login_btn)
    Button mButtonLogin;
    @Bind(R.id.tv_login_result)
    TextView mTvLoginResult;

    @Inject
    LoginPresenter mPresenter;

    @Override
    protected void initView() {
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void initInjector() {
        LoginComponent component = DaggerLoginComponent.builder()
            .applicationComponent(getApplicationComponent())
            .activityModule(getActivityModule())
            .build();
        component.inject(this);
    }

    @Override
    protected void initListener() {
        mButtonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPresenter.login(mEditTextName.getText().toString(), mEditTextPwd.getText().toString());
            }
        });
    }

    @Override
    protected void initData() {
        mPresenter.setView(this);

    }

    @Override
    public void showData(AuthEntity authEntity) {
        mTvLoginResult.setText(authEntity.toString());
    }
}

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

package com.lighters.github.ui.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import butterknife.ButterKnife;
import com.lighters.github.common.di.commopents.ApplicationComponent;
import com.lighters.github.common.di.modules.ActivityModule;
import com.lighters.github.ui.App;

/**
 * Created by david on 16/3/22.
 * Email: huangdiv5@gmail.com
 * GitHub: https://github.com/david-wei
 */
public abstract class BaseActivity extends AppCompatActivity implements IBaseView {



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getApplicationComponent().inject(this);
        initView();
        ButterKnife.bind(this);
        initInjector();
        initListener();
        initData();
    }

    /**
     * Init the views.
     */
    protected abstract void initView();


    /**
     * Init the injectors.
     */
    protected abstract void initInjector();


    /**
     * Init the listener.
     */
    protected abstract void initListener();

    /**
     * Init the data.
     */
    protected abstract void initData();





    /**
     * Get the Main Application component for dependency injection.
     */
    protected ApplicationComponent getApplicationComponent() {
        return ((App) getApplication()).getApplicationComponent();
    }

    /**
     * Get an Activity module for dependency injection.
     */
    protected ActivityModule getActivityModule() {
        return new ActivityModule(this);
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void showRetry() {

    }

    @Override
    public void hideRetry() {

    }

    @Override
    public void showError(String message) {

    }
}
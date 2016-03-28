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

package com.lighters.github.ui.login.component;

import com.lighters.github.common.di.component.ApplicationComponent;
import com.lighters.github.common.di.module.ActivityModule;
import com.lighters.github.domain.di.PerActivity;
import com.lighters.github.ui.login.LoginActivity;
import dagger.Component;

/**
 * Created by david on 16/3/28.
 * Email: huangdiv5@gmail.com
 * GitHub: https://github.com/david-wei
 */
@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = { ActivityModule.class })
public interface LoginComponent {
    void inject(LoginActivity loginActivity);
}

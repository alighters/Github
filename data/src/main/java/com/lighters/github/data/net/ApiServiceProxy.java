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

import java.lang.reflect.Proxy;
import javax.inject.Inject;
import retrofit2.Retrofit;

/**
 * Created by david on 16/3/24.
 * Email: huangdiv5@gmail.com
 * GitHub: https://github.com/david-wei
 */
public class ApiServiceProxy<T> {

    @Inject
    public Retrofit mRetrofit;

    ProxyHandler mProxyHandler;

    @Inject
    public ApiServiceProxy() {

    }

    public T getProxy(Class<T> tClass) {
        T t = mRetrofit.create(tClass);
        mProxyHandler = new ProxyHandler(t);
        return (T) Proxy.newProxyInstance(tClass.getClassLoader(), new Class<?>[] { tClass }, mProxyHandler);
    }
}

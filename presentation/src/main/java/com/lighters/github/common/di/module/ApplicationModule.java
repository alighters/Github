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

package com.lighters.github.common.di.module;

import android.content.Context;
import com.facebook.stetho.okhttp3.StethoInterceptor;
import com.lighters.github.data.net.converter.GsonConverterFactory;
import com.lighters.github.data.net.mingdao.common.NetConstant;
import com.lighters.github.data.repository.login.LoginCache;
import com.lighters.github.data.repository.login.TokenRepository;
import com.lighters.github.domain.BuildConfig;
import com.lighters.github.ui.base.BaseApp;
import dagger.Module;
import dagger.Provides;
import java.io.IOException;
import javax.inject.Singleton;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;

/**
 * Created by david on 16/3/23.
 * Email: huangdiv5@gmail.com
 * GitHub: https://github.com/david-wei
 */
@Module
public class ApplicationModule {
    private final BaseApp mApp;

    public ApplicationModule(BaseApp app) {
        mApp = app;
    }

    @Singleton
    @Provides
    Context provideApplicationContext() {
        return mApp;
    }

    @Singleton
    @Provides
    Retrofit provideRetrofit() {
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient.Builder clientBuilder = new OkHttpClient.Builder()
            .addInterceptor(logging)
            .addInterceptor(new Interceptor() {
                @Override
                public Response intercept(Chain chain) throws IOException {
                    //Request request = chain.request();
                    //HttpUrl url = request.url();
                    //String api = url.scheme() + "://" + url.host();
                    //if (api.equals(NetConstant.API)) {
                    //    Request.Builder builder = request.newBuilder()
                    //        .header("format", "json");
                    //    request = builder.build();
                    //}
                    //Response response =chain.proceed(request);
                    //response.body().string();
                    //return response;

                    //TODO 替换access_token参数(loginAccountEntity !=null && url.startsWith(NetConstant.API))
                    //LoginAccountEntity loginAccountEntity = mApp.getLoginAccountEntity();
                    return chain.proceed(chain.request());
                }
            });
        //stetho网络监控
        if (BuildConfig.DEBUG) {
            clientBuilder.addNetworkInterceptor(new StethoInterceptor());
        }

        return new Retrofit.Builder()
            //.baseUrl("https://api.github.com")
            .baseUrl(NetConstant.API)
            .client(clientBuilder.build())
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
            .build();
    }

    @Singleton
    @Provides
    LoginCache provideLoginCache(){
        return new LoginCache();
    }

    @Singleton
    @Provides
    TokenRepository provideTokenRepository(Retrofit retrofit, LoginCache loginCache) {
        return new TokenRepository(loginCache, retrofit);
    }
}

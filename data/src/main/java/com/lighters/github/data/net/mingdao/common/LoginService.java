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

package com.lighters.github.data.net.mingdao.common;

import retrofit2.http.POST;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by david on 16/3/25.
 * Email: huangdiv5@gmail.com
 * GitHub: https://github.com/david-wei
 */
public interface LoginService {
    /**
     * @param app_key       分配到的App Key
     * @param app_secret    分配到的App Secret
     * @param grant_type    请求的类型，可以为authorization_code、password、refresh_token。
     * @param username      授权用户的用户名。
     * @param password      授权用户的密码。
     * @param p_signature   企业网络ID，首次默认传空（用户多网络返回企业网络列表）
     * @param code          调用authorize获得的code值。
     * @param redirect_uri  回调地址，需要与注册应用里的回调地址一致。
     * @param refresh_token 与授权令牌同时获取的刷新令牌。
     */
    @POST(NetConstant.API_OAUTH2_ACCESS_TOKEN)
    Observable<AuthEntity> access_token(
        @Query("app_ke") String app_key,
        @Query("app_secret") String app_secret,
        @Query("grant_type") String grant_type,
        @Query("username") String username,
        @Query("password") String password,
        @Query("p_signature") String p_signature,
        @Query("code") String code,
        @Query("redirect_uri") String redirect_uri,
        @Query("refresh_token") String refresh_token);

    class GrantType {
        public static final String AUTHORIZATION_CODE = "authorization_code ";
        public static final String PASSWORD = "password";
        public static final String REFRESH_TOKEN = "refresh_token";
    }
}

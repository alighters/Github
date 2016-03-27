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

import android.text.TextUtils;

/**
 * Created by david on 16/3/25.
 * Email: huangdiv5@gmail.com
 * GitHub: https://github.com/david-wei
 */
public class AuthEntity {
    /**
     * access_token : D3KJ89YI4QYNJKA
     * expires_in : 1234
     * refresh_token : C3KJ89YI4QYNJDD
     */
    private String access_token;
    private String expires_in;
    private String refresh_token;
    private String sessionID;

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getExpires_in() {
        return expires_in;
    }

    public void setExpires_in(String expires_in) {
        this.expires_in = expires_in;
    }

    public String getRefresh_token() {
        return refresh_token;
    }

    public void setRefresh_token(String refresh_token) {
        this.refresh_token = refresh_token;
    }

    public String getSessionID() {
        return sessionID;
    }

    public void setSessionID(String sessionID) {
        this.sessionID = sessionID;
    }

    @Override
    public String toString() {
        return "AuthEntity{" +
            "access_token='" + access_token + '\'' +
            ", expires_in='" + expires_in + '\'' +
            ", refresh_token='" + refresh_token + '\'' +
            ", sessionID='" + sessionID + '\'' +
            '}';
    }

    public boolean isNull() {
        return TextUtils.isEmpty(access_token);
    }
}

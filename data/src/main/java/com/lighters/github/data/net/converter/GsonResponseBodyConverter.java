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

package com.lighters.github.data.net.converter;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.lighters.github.data.exception.APIException;
import com.lighters.github.data.exception.ApiErrorModel;
import com.lighters.github.data.model.IsNull;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.Converter;

/**
 * Created by david on 16/3/27.
 * Email: huangdiv5@gmail.com
 * GitHub: https://github.com/david-wei
 */
public class GsonResponseBodyConverter<T> implements Converter<ResponseBody, T> {
    private final Gson gson;
    private final TypeAdapter<T> adapter;

    GsonResponseBodyConverter(Gson gson, TypeAdapter<T> adapter) {
        this.gson = gson;
        this.adapter = adapter;
    }

    @Override
    public T convert(ResponseBody value) throws IOException {
        String response = null;
        try {
            response = value.string();
            T t = adapter.fromJson(response);
            if (t != null && t instanceof IsNull && !((IsNull) t).isNull()) {
                return t;
            }
            throw new APIException();
        } catch (APIException e) {
            ApiErrorModel apiErrorModel = gson.fromJson(response, ApiErrorModel.class);
            if (apiErrorModel != null) {
                throw new APIException(apiErrorModel);
            }
            throw e;
        } finally {
            value.close();
        }
    }
}

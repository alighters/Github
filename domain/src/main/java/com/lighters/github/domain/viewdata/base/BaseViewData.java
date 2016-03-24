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

package com.lighters.github.domain.viewdata.base;

import com.lighters.github.domain.viewdata.base.page.PageIndexPagination;
import javax.inject.Inject;
import retrofit2.Retrofit;
import rx.Observable;

/**
 * Created by david on 16/3/22.
 * Email: huangdiv5@gmail.com
 * GitHub: https://github.com/david-wei
 */
public class BaseViewData<T, F> extends PageIndexPagination implements IViewData<T>, IBuildService<F> {

    @Inject
    public Retrofit mRetrofit;


    @Override
    public F buildService(Class<F> aClass) {
        return mRetrofit.create(aClass);
    }

    @Override
    public Observable<T> fetchData() {
        return null;
    }

    @Override
    public Observable<T> updateData() {
        return null;
    }

    @Override
    public Observable<T> deleteData() {
        return null;
    }

    @Override
    public void loadNextPage() {
        super.loadNextPage();
    }
}

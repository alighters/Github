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

import com.lighters.github.domain.viewdata.base.page.IPagination;
import java.util.List;
import rx.Observable;
import rx.functions.Func1;

/**
 * Created by david on 16/3/25.
 * Email: huangdiv5@gmail.com
 * GitHub: https://github.com/david-wei
 */
public abstract class BasePageIndexViewData<T> implements IPagination<T> {

    public int page = 1;
    public int pageSize = 20;

    private boolean mHasMorePage = true;

    List<T> mList;

    @Override
    public void initPage() {
        page = 1;
        mHasMorePage = true;
    }

    @Override
    public Observable<List<T>> loadNextPage() {
        if (mHasMorePage) {
            return fetchPageData().flatMap(new Func1<List<T>, Observable<List<T>>>() {
                @Override
                public Observable<List<T>> call(List<T> ts) {
                    if (ts != null) {
                        if (mList == null) {
                            mList = ts;
                        } else {
                            mList.addAll(ts);
                        }
                        page++;
                        if (ts.size() < pageSize) {
                            setHasMorePage(false);
                        }
                    } else {
                        setHasMorePage(false);
                    }
                    return Observable.just(mList);
                }
            });
        } else {
            return null;
        }
    }

    /**
     *
     * @return
     */
    protected abstract Observable<List<T>> fetchPageData();

    @Override
    public boolean hasMorePage() {
        return mHasMorePage;
    }

    @Override
    public void setHasMorePage(boolean hasMorePage) {
        mHasMorePage = hasMorePage;
    }

    @Override
    public T getData() {
        return null;
    }

    @Override
    public List<T> getListData() {
        return mList;
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
}

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

package com.lighters.github.domain.viewdata.base.page;

import com.lighters.github.domain.viewdata.base.IViewData;
import java.util.List;
import rx.Observable;

/**
 * Created by david on 16/3/24.
 * Email: huangdiv5@gmail.com
 * GitHub: https://github.com/david-wei
 */
public interface IPagination<T> extends IViewData<T>{

    /**
     * Init the pagination.
     */
    void initPage();

    /**
     * Load the next page data.
     */
    Observable<List<T>> loadNextPage();

    /**
     * Get the page has more
     *
     * @return whether the page has more data.
     */
    boolean hasMorePage();

    /**
     * Set the result has more page.
     *
     * @param hasMorePage whether the page has more data.
     */
    void setHasMorePage(boolean hasMorePage);


}

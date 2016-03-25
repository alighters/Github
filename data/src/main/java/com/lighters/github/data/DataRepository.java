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

package com.lighters.github.data;

import java.util.List;
import rx.Observable;

/**
 * Created by david on 16/3/24.
 * Email: huangdiv5@gmail.com
 * GitHub: https://github.com/david-wei
 */
public interface DataRepository<T> {

    /**
     *
     * @param id
     * @return
     */
    Observable<T> getByID(int id);

    /**
     *
     * @param id
     * @return
     */
    Observable<T> getByID(String id);

    /**
     *
     * @return
     */
    Observable<List<T>> getList();

    /**
     *
     * @param key
     * @return
     */
    Observable<List<T>> getList(String key);

    /**
     *
     * @param key1
     * @param key2
     * @return
     */
    Observable<List<T>> getList(String key1, String key2);

    /**
     *
     * @param key1
     * @param key2
     * @param key3
     * @return
     */
    Observable<List<T>> getList(String key1, String key2, String key3);
}

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

package com.lighters.github.data.net.post;

import com.lighters.github.data.model.post.PostEntity;
import com.lighters.github.data.net.mingdao.common.NetConstant;
import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by david on 16/3/27.
 * Email: huangdiv5@gmail.com
 * GitHub: https://github.com/david-wei
 */
public interface ApiPostService {
    @GET(NetConstant.API_POST_MY)
    Observable<PostEntity> getMyPost(
        @Query("post_type") int postType,
        @Query("page") int page,
        @Query("pagesize") int pageSize,
        @Query("keywords") String keywords,
        @Query("refreshToken") String access_token
    );

    /**
     * 筛选动态更新类型,默认-1：表示全部动态；0：普通消息；1：链接；2：图片；3：文档；4：提问；7：投票.
     */
    class PostType {
        public static final int ALL = -1;
        public static final int NORMAL = 1;
        public static final int LINK = 2;
        public static final int DOC = 3;
        public static final int QUSTION = 4;
        public static final int VOTE = 7;
    }
}

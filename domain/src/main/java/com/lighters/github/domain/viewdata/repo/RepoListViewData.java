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

package com.lighters.github.domain.viewdata.repo;

import com.lighters.github.data.model.net.RepoEntity;
import com.lighters.github.data.net.ApiServiceProxy;
import com.lighters.github.data.net.repo.ApiRepoService;
import com.lighters.github.domain.viewdata.base.BasePageIndexViewData;
import java.util.List;
import javax.inject.Inject;
import rx.Observable;

/**
 * Created by david on 16/3/12.
 * Email: huangdiv5@gmail.com
 * GitHub: https://github.com/david-wei
 */
public class RepoListViewData extends BasePageIndexViewData<RepoEntity> {

    public String mUserName;

    private ApiRepoService mApiRepoService;

    @Inject
    public RepoListViewData(ApiServiceProxy<ApiRepoService> serviceProxy) {
        mApiRepoService = serviceProxy.getProxy(ApiRepoService.class);
    }

    @Override
    protected Observable<List<RepoEntity>> fetchListData() {
        return mApiRepoService.getUsersRepos(mUserName, page, pageSize);
    }
}

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
import com.lighters.github.data.net.ApiRepoService;
import com.lighters.github.domain.viewdata.base.BaseViewData;
import java.util.List;
import javax.inject.Inject;
import rx.Observable;
import rx.functions.Action1;

/**
 * Created by david on 16/3/12.
 * Email: huangdiv5@gmail.com
 * GitHub: https://github.com/david-wei
 */
public class RepoListViewData extends BaseViewData<List<RepoEntity>, ApiRepoService> {

    public String mUserName;
    public int mPage;
    public List<RepoEntity> mlist;


    @Inject
    public RepoListViewData() {
    }

    @Override
    public Observable<List<RepoEntity>> fetch() {
        return buildService(ApiRepoService.class).getUsersRepos(mUserName, mPage).doOnNext(new Action1<List<RepoEntity>>() {
            @Override
            public void call(List<RepoEntity> entities) {
                mlist = entities;
            }
        });
    }
}

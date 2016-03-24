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

package com.lighters.github.ui.repo;

import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import butterknife.Bind;
import com.lighters.github.R;
import com.lighters.github.data.model.net.RepoEntity;
import com.lighters.github.ui.base.BaseActivity;
import com.lighters.github.ui.repo.RepoListPresenter.RepoListPresenter;
import com.lighters.github.ui.repo.adapter.RepoListAdapter;
import com.lighters.github.ui.repo.component.DaggerRepoComponent;
import com.lighters.github.ui.repo.component.RepoComponent;
import com.lighters.github.ui.repo.module.RepoModule;
import com.lighters.github.ui.repo.view.IRepoListView;
import java.util.List;
import javax.inject.Inject;

/**
 * Created by david on 16/3/22.
 * Email: huangdiv5@gmail.com
 * GitHub: https://github.com/david-wei
 */
public class RepoListActivity extends BaseActivity implements IRepoListView {

    @Bind(R.id.rv_repo_list)
    RecyclerView rvView;
    @Bind(R.id.sw_repo_List)
    SwipeRefreshLayout swView;

    @Inject
    RepoListPresenter mPresenter;
    @Inject
    RepoListAdapter mRepoListAdapter;

    LinearLayoutManager mLayoutManager;

    @Override
    protected void initView() {
        setContentView(R.layout.activity_repo_list_layout);
    }

    @Override
    protected void initInjector() {
        RepoComponent component = DaggerRepoComponent.builder()
            .applicationComponent(getApplicationComponent())
            .activityModule(getActivityModule())
            .repoModule(new RepoModule())
            .build();
        component.inject(this);
    }

    @Override
    protected void initListener() {

    }

    @Override
    protected void initData() {
        mLayoutManager = new LinearLayoutManager(this);
        rvView.setLayoutManager(mLayoutManager);
        rvView.setAdapter(mRepoListAdapter);
        rvView.addOnScrollListener(mOnScrollListener);
        mPresenter.setView(this);
        mPresenter.loadData();
    }

    @Override
    public void renderRepoList(List<RepoEntity> list) {
        mRepoListAdapter.setData(list);
        mRepoListAdapter.notifyDataSetChanged();
    }

    private RecyclerView.OnScrollListener mOnScrollListener = new RecyclerView.OnScrollListener() {
        @Override
        public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
            super.onScrolled(recyclerView, dx, dy);
            int visibleItemCount = mLayoutManager.getChildCount();
            int totalItemCount = mLayoutManager.getItemCount();
            int firstVisibleItemPosition = mLayoutManager.findFirstVisibleItemPosition();

            if ((visibleItemCount + firstVisibleItemPosition) >= totalItemCount
                && firstVisibleItemPosition >= 0) {
                mPresenter.loadMoreData();
            }
        }
    };
}

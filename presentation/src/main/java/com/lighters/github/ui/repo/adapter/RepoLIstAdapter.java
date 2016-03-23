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

package com.lighters.github.ui.repo.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Bind;
import butterknife.ButterKnife;
import com.bumptech.glide.Glide;
import com.lighters.github.R;
import com.lighters.github.data.model.net.RepoEntity;
import java.util.List;
import javax.inject.Inject;

/**
 * Created by david on 16/3/23.
 * Email: huangdiv5@gmail.com
 * GitHub: https://github.com/david-wei
 */
public class RepoListAdapter extends RecyclerView.Adapter<RepoListAdapter.RepoViewHolder> {

    private Context mContext;

    private List<RepoEntity> mEntityList;

    public void setData(List<RepoEntity> list) {
        this.mEntityList = list;
    }

    @Inject
    public RepoListAdapter(Context context) {
        this.mContext = context;
    }

    @Override
    public RepoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        final View view = LayoutInflater.from(mContext).inflate(R.layout.activity_repo_list_item_layout, parent, false);
        return new RepoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RepoViewHolder holder, int position) {
        if (position >= 0 && position < mEntityList.size()) {
            Glide.with(mContext).load(mEntityList.get(position).owner.avatar_url).into(holder.ivAvatar);
            holder.tvTitle.setText(mEntityList.get(position).name);
        }
    }

    @Override
    public int getItemCount() {
        if (mEntityList == null) {
            return 0;
        }
        return mEntityList.size();
    }

    static class RepoViewHolder extends RecyclerView.ViewHolder {
        @Bind(R.id.tv_repo_list_item_title) TextView tvTitle;
        @Bind(R.id.iv_repo_List_item_avatar) ImageView ivAvatar;

        public RepoViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}

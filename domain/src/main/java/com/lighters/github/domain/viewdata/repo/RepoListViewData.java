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

import android.os.Parcel;
import android.os.Parcelable;
import com.lighters.github.data.model.net.RepoEntity;
import com.lighters.github.data.net.ApiRepoService;
import com.lighters.github.domain.viewdata.base.BaseViewData;
import com.lighters.github.domain.viewdata.base.page.PageIndexPagination;
import java.util.List;
import javax.inject.Inject;
import rx.Observable;
import rx.functions.Action1;

/**
 * Created by david on 16/3/12.
 * Email: huangdiv5@gmail.com
 * GitHub: https://github.com/david-wei
 */
public class RepoListViewData extends BaseViewData<List<RepoEntity>, ApiRepoService> implements Parcelable {

    public String mUserName;
    public List<RepoEntity> mlist;

    @Inject
    public RepoListViewData() {
    }

    @Override
    public Observable<List<RepoEntity>> fetchData() {
        return buildService(ApiRepoService.class).getUsersRepos(mUserName, page, pageSize)
            .doOnNext(new Action1<List<RepoEntity>>() {
                @Override
                public void call(List<RepoEntity> entities) {
                    if (entities != null) {
                        if (mlist == null) {
                            mlist = entities;
                        }else{
                            mlist.addAll(entities);
                        }

                        if (entities.size() < pageSize) {
                            setHasMorePage(false);
                        }
                    } else {
                        setHasMorePage(false);
                    }
                }
            });
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest,flags);
        dest.writeInt(this.page);
        dest.writeString(this.mUserName);
        dest.writeTypedList(mlist);
    }

    protected RepoListViewData(Parcel in) {
        readFromParcel(in);
        this.mUserName = in.readString();
        this.mlist = in.createTypedArrayList(RepoEntity.CREATOR);
    }

    public static final Parcelable.Creator<RepoListViewData> CREATOR = new Parcelable.Creator<RepoListViewData>() {
        @Override
        public RepoListViewData createFromParcel(Parcel source) {
            return new RepoListViewData(source);
        }

        @Override
        public RepoListViewData[] newArray(int size) {
            return new RepoListViewData[size];
        }
    };
}

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

import android.os.Parcel;
import javax.inject.Inject;

/**
 * Created by david on 16/3/24.
 * Email: huangdiv5@gmail.com
 * GitHub: https://github.com/david-wei
 */
public class PageIndexPagination implements IPagination {

    public int page = 1;
    public int pageSize = 20;

    private boolean mHasMorePage = true;

    @Inject
    public PageIndexPagination(){

    }

    @Override
    public void initPage() {
        page = 1;
        mHasMorePage = true;
    }

    @Override
    public void loadNextPage() {
        page++;
    }

    @Override
    public boolean hasMorePage() {
        return mHasMorePage;
    }

    @Override
    public void setHasMorePage(boolean hasMorePage) {
        mHasMorePage = hasMorePage;
    }


    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.page);
        dest.writeInt(this.pageSize);
        dest.writeByte(mHasMorePage ? (byte) 1 : (byte) 0);
    }

    protected void readFromParcel(Parcel in) {
        this.page = in.readInt();
        this.pageSize = in.readInt();
        this.mHasMorePage = in.readByte() != 0;
    }

}

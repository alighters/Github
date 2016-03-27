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

package com.lighters.github.data.model.post;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by david on 16/3/27.
 * Email: huangdiv5@gmail.com
 * GitHub: https://github.com/david-wei
 */
public class PostEntity implements Parcelable {
    /**
     * autoid : 14589208392140000
     * p_id : a1fdcedd-6c04-41b3-b9c0-50f7478b3a31
     * id : 14589208392140000
     * guid : a1fdcedd-6c04-41b3-b9c0-50f7478b3a31
     * text : - clean demo 修改分页逻辑 - 安卓小组分享 - RxJavaDemo查看 - 日程的日期显示修改
     * text_attribute : {}
     * tags : []
     * create_time : 2016-03-25 23:47:19
     * source : 明道
     * reply_count : 0
     * like : 0
     * favorite : 0
     * like_count : 2
     * reshared_count : 0
     * favorite_count : 0
     * type : 0
     * share_type : 1
     * groups : [{"id":"fdf25102-4ecc-4b4a-96fb-f1c133377647","name":"移动开发团队","avstar":"https://dn-mdpic.qbox
     * .me/GroupAvatar/default15.png?imageView2/1/w/24/h/24/q/100","avatar":"https://dn-mdpic.qbox.me/GroupAvatar/default15
     * .png?imageView2/1/w/24/h/24/q/100"}]
     * user : {"id":"683c30b3-db72-464e-81ef-3d63f7bbfa7f","accountid":"c3c55503-bc89-4eda-b90f-6644ef663e93","name":"卫顺民",
     * "avstar":"https://dn-mdpic.qbox.me/UserAvatar/1beed6d0-91e9-4c11-b59e-1ef1a3d4f4d5.jpg?imageView2/1/w/100/h/100/q/90",
     * "avatar":"https://dn-mdpic.qbox.me/UserAvatar/1beed6d0-91e9-4c11-b59e-1ef1a3d4f4d5.jpg?imageView2/1/w/100/h/100/q/90"}
     * repost : {"autoid":"14588728216030000","p_id":"3690c241-ee90-4e27-9fd8-6928600698e4","id":"14588728216030000",
     * "guid":"3690c241-ee90-4e27-9fd8-6928600698e4","text":" #今日工作# - 明道登陆API集成 - 安卓小组分享 - 日程bug修改","text_attribute":{},
     * "tags":[],"create_time":"2016-03-25 10:27:01","source":"明道","reply_count":"1","like":0,"favorite":0,"like_count":"0",
     * "reshared_count":"1","favorite_count":"0","type":"0","share_type":"1",
     * "groups":[{"id":"fdf25102-4ecc-4b4a-96fb-f1c133377647","name":"移动开发团队","avstar":"https://dn-mdpic.qbox
     * .me/GroupAvatar/default15.png?imageView2/1/w/24/h/24/q/100","avatar":"https://dn-mdpic.qbox.me/GroupAvatar/default15
     * .png?imageView2/1/w/24/h/24/q/100"}],"user":{"id":"683c30b3-db72-464e-81ef-3d63f7bbfa7f",
     * "accountid":"c3c55503-bc89-4eda-b90f-6644ef663e93","name":"卫顺民","avstar":"https://dn-mdpic.qbox
     * .me/UserAvatar/1beed6d0-91e9-4c11-b59e-1ef1a3d4f4d5.jpg?imageView2/1/w/100/h/100/q/90","avatar":"https://dn-mdpic.qbox
     * .me/UserAvatar/1beed6d0-91e9-4c11-b59e-1ef1a3d4f4d5.jpg?imageView2/1/w/100/h/100/q/90"}}
     */

    public String autoid;
    public String p_id;
    public String id;
    public String guid;
    public String text;
    public String create_time;
    public String source;
    public String reply_count;
    public int like;
    public int favorite;
    public String like_count;
    public String reshared_count;
    public String favorite_count;
    public String type;
    public String share_type;
    /**
     * id : 683c30b3-db72-464e-81ef-3d63f7bbfa7f
     * accountid : c3c55503-bc89-4eda-b90f-6644ef663e93
     * name : 卫顺民
     * avstar : https://dn-mdpic.qbox.me/UserAvatar/1beed6d0-91e9-4c11-b59e-1ef1a3d4f4d5.jpg?imageView2/1/w/100/h/100/q/90
     * avatar : https://dn-mdpic.qbox.me/UserAvatar/1beed6d0-91e9-4c11-b59e-1ef1a3d4f4d5.jpg?imageView2/1/w/100/h/100/q/90
     */

    public UserEntity user;
    /**
     * autoid : 14588728216030000
     * p_id : 3690c241-ee90-4e27-9fd8-6928600698e4
     * id : 14588728216030000
     * guid : 3690c241-ee90-4e27-9fd8-6928600698e4
     * text :  #今日工作# - 明道登陆API集成 - 安卓小组分享 - 日程bug修改
     * text_attribute : {}
     * tags : []
     * create_time : 2016-03-25 10:27:01
     * source : 明道
     * reply_count : 1
     * like : 0
     * favorite : 0
     * like_count : 0
     * reshared_count : 1
     * favorite_count : 0
     * type : 0
     * share_type : 1
     * groups : [{"id":"fdf25102-4ecc-4b4a-96fb-f1c133377647","name":"移动开发团队","avstar":"https://dn-mdpic.qbox
     * .me/GroupAvatar/default15.png?imageView2/1/w/24/h/24/q/100","avatar":"https://dn-mdpic.qbox.me/GroupAvatar/default15
     * .png?imageView2/1/w/24/h/24/q/100"}]
     * user : {"id":"683c30b3-db72-464e-81ef-3d63f7bbfa7f","accountid":"c3c55503-bc89-4eda-b90f-6644ef663e93","name":"卫顺民",
     * "avstar":"https://dn-mdpic.qbox.me/UserAvatar/1beed6d0-91e9-4c11-b59e-1ef1a3d4f4d5.jpg?imageView2/1/w/100/h/100/q/90",
     * "avatar":"https://dn-mdpic.qbox.me/UserAvatar/1beed6d0-91e9-4c11-b59e-1ef1a3d4f4d5.jpg?imageView2/1/w/100/h/100/q/90"}
     */

    public RepostEntity repost;
    public List<TagEntity> tags;
    public List<UserEntity> groups;

    public static class TextAttributeEntity {
    }

    public static class TagEntity{
        public String id;
        public String name;
    }

    public static class UserEntity implements Parcelable {
        public String id;
        public String accountid;
        public String name;
        public String avstar;
        public String avatar;

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.id);
            dest.writeString(this.accountid);
            dest.writeString(this.name);
            dest.writeString(this.avstar);
            dest.writeString(this.avatar);
        }

        public UserEntity() {
        }

        protected UserEntity(Parcel in) {
            this.id = in.readString();
            this.accountid = in.readString();
            this.name = in.readString();
            this.avstar = in.readString();
            this.avatar = in.readString();
        }

        public static final Parcelable.Creator<UserEntity> CREATOR = new Parcelable.Creator<UserEntity>() {
            @Override
            public UserEntity createFromParcel(Parcel source) {
                return new UserEntity(source);
            }

            @Override
            public UserEntity[] newArray(int size) {
                return new UserEntity[size];
            }
        };
    }

    public static class RepostEntity implements Parcelable {
        public String autoid;
        public String p_id;
        public String id;
        public String guid;
        public String text;
        public String create_time;
        public String source;
        public String reply_count;
        public int like;
        public int favorite;
        public String like_count;
        public String reshared_count;
        public String favorite_count;
        public String type;
        public String share_type;
        public UserEntity user;
        public List<TagEntity> tags;
        public List<UserEntity> groups;

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.autoid);
            dest.writeString(this.p_id);
            dest.writeString(this.id);
            dest.writeString(this.guid);
            dest.writeString(this.text);
            dest.writeString(this.create_time);
            dest.writeString(this.source);
            dest.writeString(this.reply_count);
            dest.writeInt(this.like);
            dest.writeInt(this.favorite);
            dest.writeString(this.like_count);
            dest.writeString(this.reshared_count);
            dest.writeString(this.favorite_count);
            dest.writeString(this.type);
            dest.writeString(this.share_type);
            dest.writeParcelable(this.user, flags);
            dest.writeList(this.tags);
            dest.writeTypedList(groups);
        }

        public RepostEntity() {
        }

        protected RepostEntity(Parcel in) {
            this.autoid = in.readString();
            this.p_id = in.readString();
            this.id = in.readString();
            this.guid = in.readString();
            this.text = in.readString();
            this.create_time = in.readString();
            this.source = in.readString();
            this.reply_count = in.readString();
            this.like = in.readInt();
            this.favorite = in.readInt();
            this.like_count = in.readString();
            this.reshared_count = in.readString();
            this.favorite_count = in.readString();
            this.type = in.readString();
            this.share_type = in.readString();
            this.user = in.readParcelable(UserEntity.class.getClassLoader());
            this.tags = new ArrayList<TagEntity>();
            in.readList(this.tags, TagEntity.class.getClassLoader());
            this.groups = in.createTypedArrayList(UserEntity.CREATOR);
        }

        public static final Parcelable.Creator<RepostEntity> CREATOR = new Parcelable.Creator<RepostEntity>() {
            @Override
            public RepostEntity createFromParcel(Parcel source) {
                return new RepostEntity(source);
            }

            @Override
            public RepostEntity[] newArray(int size) {
                return new RepostEntity[size];
            }
        };
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.autoid);
        dest.writeString(this.p_id);
        dest.writeString(this.id);
        dest.writeString(this.guid);
        dest.writeString(this.text);
        dest.writeString(this.create_time);
        dest.writeString(this.source);
        dest.writeString(this.reply_count);
        dest.writeInt(this.like);
        dest.writeInt(this.favorite);
        dest.writeString(this.like_count);
        dest.writeString(this.reshared_count);
        dest.writeString(this.favorite_count);
        dest.writeString(this.type);
        dest.writeString(this.share_type);
        dest.writeParcelable(this.user, flags);
        dest.writeParcelable(this.repost, flags);
        dest.writeList(this.tags);
        dest.writeTypedList(groups);
    }

    public PostEntity() {
    }

    protected PostEntity(Parcel in) {
        this.autoid = in.readString();
        this.p_id = in.readString();
        this.id = in.readString();
        this.guid = in.readString();
        this.text = in.readString();
        this.create_time = in.readString();
        this.source = in.readString();
        this.reply_count = in.readString();
        this.like = in.readInt();
        this.favorite = in.readInt();
        this.like_count = in.readString();
        this.reshared_count = in.readString();
        this.favorite_count = in.readString();
        this.type = in.readString();
        this.share_type = in.readString();
        this.user = in.readParcelable(UserEntity.class.getClassLoader());
        this.repost = in.readParcelable(RepostEntity.class.getClassLoader());
        this.tags = new ArrayList<TagEntity>();
        in.readList(this.tags, TagEntity.class.getClassLoader());
        this.groups = in.createTypedArrayList(UserEntity.CREATOR);
    }

    public static final Parcelable.Creator<PostEntity> CREATOR = new Parcelable.Creator<PostEntity>() {
        @Override
        public PostEntity createFromParcel(Parcel source) {
            return new PostEntity(source);
        }

        @Override
        public PostEntity[] newArray(int size) {
            return new PostEntity[size];
        }
    };
}

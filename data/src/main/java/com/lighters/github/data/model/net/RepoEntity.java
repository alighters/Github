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

package com.lighters.github.data.model.net;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;

/**
 * Created by david on 16/3/12.
 * Email: huangdiv5@gmail.com
 * GitHub: https://github.com/david-wei
 */
public class RepoEntity implements Parcelable {
    /**
     * id : 41650718
     * name : CollapsingAvatarToolbar
     * full_name : david-wei/CollapsingAvatarToolbar
     * owner : {"login":"david-wei","id":5573939,"avatar_url":"https://avatars.githubusercontent.com/u/5573939?v=3",
     * "gravatar_id":"","url":"https://api.github.com/users/david-wei","html_url":"https://github.com/david-wei",
     * "followers_url":"https://api.github.com/users/david-wei/followers","following_url":"https://api.github
     * .com/users/david-wei/following{/other_user}","gists_url":"https://api.github.com/users/david-wei/gists{/gist_id}",
     * "starred_url":"https://api.github.com/users/david-wei/starred{/owner}{/repo}","subscriptions_url":"https://api.github
     * .com/users/david-wei/subscriptions","organizations_url":"https://api.github.com/users/david-wei/orgs",
     * "repos_url":"https://api.github.com/users/david-wei/repos","events_url":"https://api.github
     * .com/users/david-wei/events{/privacy}","received_events_url":"https://api.github.com/users/david-wei/received_events",
     * "type":"User","site_admin":false}
     * private : false
     * html_url : https://github.com/david-wei/CollapsingAvatarToolbar
     * description : Collapsing Toolbar with a moving avatar for Android.
     * fork : true
     * url : https://api.github.com/repos/david-wei/CollapsingAvatarToolbar
     * forks_url : https://api.github.com/repos/david-wei/CollapsingAvatarToolbar/forks
     * keys_url : https://api.github.com/repos/david-wei/CollapsingAvatarToolbar/keys{/key_id}
     * collaborators_url : https://api.github.com/repos/david-wei/CollapsingAvatarToolbar/collaborators{/collaborator}
     * teams_url : https://api.github.com/repos/david-wei/CollapsingAvatarToolbar/teams
     * hooks_url : https://api.github.com/repos/david-wei/CollapsingAvatarToolbar/hooks
     * issue_events_url : https://api.github.com/repos/david-wei/CollapsingAvatarToolbar/issues/events{/number}
     * events_url : https://api.github.com/repos/david-wei/CollapsingAvatarToolbar/events
     * assignees_url : https://api.github.com/repos/david-wei/CollapsingAvatarToolbar/assignees{/user}
     * branches_url : https://api.github.com/repos/david-wei/CollapsingAvatarToolbar/branches{/branch}
     * tags_url : https://api.github.com/repos/david-wei/CollapsingAvatarToolbar/tags
     * blobs_url : https://api.github.com/repos/david-wei/CollapsingAvatarToolbar/git/blobs{/sha}
     * git_tags_url : https://api.github.com/repos/david-wei/CollapsingAvatarToolbar/git/tags{/sha}
     * git_refs_url : https://api.github.com/repos/david-wei/CollapsingAvatarToolbar/git/refs{/sha}
     * trees_url : https://api.github.com/repos/david-wei/CollapsingAvatarToolbar/git/trees{/sha}
     * statuses_url : https://api.github.com/repos/david-wei/CollapsingAvatarToolbar/statuses/{sha}
     * languages_url : https://api.github.com/repos/david-wei/CollapsingAvatarToolbar/languages
     * stargazers_url : https://api.github.com/repos/david-wei/CollapsingAvatarToolbar/stargazers
     * contributors_url : https://api.github.com/repos/david-wei/CollapsingAvatarToolbar/contributors
     * subscribers_url : https://api.github.com/repos/david-wei/CollapsingAvatarToolbar/subscribers
     * subscription_url : https://api.github.com/repos/david-wei/CollapsingAvatarToolbar/subscription
     * commits_url : https://api.github.com/repos/david-wei/CollapsingAvatarToolbar/commits{/sha}
     * git_commits_url : https://api.github.com/repos/david-wei/CollapsingAvatarToolbar/git/commits{/sha}
     * comments_url : https://api.github.com/repos/david-wei/CollapsingAvatarToolbar/comments{/number}
     * issue_comment_url : https://api.github.com/repos/david-wei/CollapsingAvatarToolbar/issues/comments{/number}
     * contents_url : https://api.github.com/repos/david-wei/CollapsingAvatarToolbar/contents/{+path}
     * compare_url : https://api.github.com/repos/david-wei/CollapsingAvatarToolbar/compare/{base}...{head}
     * merges_url : https://api.github.com/repos/david-wei/CollapsingAvatarToolbar/merges
     * archive_url : https://api.github.com/repos/david-wei/CollapsingAvatarToolbar/{archive_format}{/ref}
     * downloads_url : https://api.github.com/repos/david-wei/CollapsingAvatarToolbar/downloads
     * issues_url : https://api.github.com/repos/david-wei/CollapsingAvatarToolbar/issues{/number}
     * pulls_url : https://api.github.com/repos/david-wei/CollapsingAvatarToolbar/pulls{/number}
     * milestones_url : https://api.github.com/repos/david-wei/CollapsingAvatarToolbar/milestones{/number}
     * notifications_url : https://api.github.com/repos/david-wei/CollapsingAvatarToolbar/notifications{?since,all,participating}
     * labels_url : https://api.github.com/repos/david-wei/CollapsingAvatarToolbar/labels{/name}
     * releases_url : https://api.github.com/repos/david-wei/CollapsingAvatarToolbar/releases{/id}
     * deployments_url : https://api.github.com/repos/david-wei/CollapsingAvatarToolbar/deployments
     * created_at : 2015-08-31T02:06:43Z
     * updated_at : 2015-08-31T02:06:43Z
     * pushed_at : 2015-08-30T10:00:40Z
     * git_url : git://github.com/david-wei/CollapsingAvatarToolbar.git
     * ssh_url : git@github.com:david-wei/CollapsingAvatarToolbar.git
     * clone_url : https://github.com/david-wei/CollapsingAvatarToolbar.git
     * svn_url : https://github.com/david-wei/CollapsingAvatarToolbar
     * homepage :
     * size : 2588
     * stargazers_count : 0
     * watchers_count : 0
     * language : Java
     * has_issues : false
     * has_downloads : true
     * has_wiki : true
     * has_pages : false
     * forks_count : 0
     * mirror_url : null
     * open_issues_count : 0
     * forks : 0
     * open_issues : 0
     * watchers : 0
     * default_branch : master
     */

    public int id;
    public String name;
    public String full_name;
    /**
     * login : david-wei
     * id : 5573939
     * avatar_url : https://avatars.githubusercontent.com/u/5573939?v=3
     * gravatar_id :
     * url : https://api.github.com/users/david-wei
     * html_url : https://github.com/david-wei
     * followers_url : https://api.github.com/users/david-wei/followers
     * following_url : https://api.github.com/users/david-wei/following{/other_user}
     * gists_url : https://api.github.com/users/david-wei/gists{/gist_id}
     * starred_url : https://api.github.com/users/david-wei/starred{/owner}{/repo}
     * subscriptions_url : https://api.github.com/users/david-wei/subscriptions
     * organizations_url : https://api.github.com/users/david-wei/orgs
     * repos_url : https://api.github.com/users/david-wei/repos
     * events_url : https://api.github.com/users/david-wei/events{/privacy}
     * received_events_url : https://api.github.com/users/david-wei/received_events
     * type : User
     * site_admin : false
     */

    public OwnerEntity owner;
    @SerializedName("private") public boolean privateX;
    public String html_url;
    public String description;
    public boolean fork;
    public String url;
    public String forks_url;
    public String keys_url;
    public String collaborators_url;
    public String teams_url;
    public String hooks_url;
    public String issue_events_url;
    public String events_url;
    public String assignees_url;
    public String branches_url;
    public String tags_url;
    public String blobs_url;
    public String git_tags_url;
    public String git_refs_url;
    public String trees_url;
    public String statuses_url;
    public String languages_url;
    public String stargazers_url;
    public String contributors_url;
    public String subscribers_url;
    public String subscription_url;
    public String commits_url;
    public String git_commits_url;
    public String comments_url;
    public String issue_comment_url;
    public String contents_url;
    public String compare_url;
    public String merges_url;
    public String archive_url;
    public String downloads_url;
    public String issues_url;
    public String pulls_url;
    public String milestones_url;
    public String notifications_url;
    public String labels_url;
    public String releases_url;
    public String deployments_url;
    public String created_at;
    public String updated_at;
    public String pushed_at;
    public String git_url;
    public String ssh_url;
    public String clone_url;
    public String svn_url;
    public String homepage;
    public int size;
    public int stargazers_count;
    public int watchers_count;
    public String language;
    public boolean has_issues;
    public boolean has_downloads;
    public boolean has_wiki;
    public boolean has_pages;
    public int forks_count;
    public String mirror_url;
    public int open_issues_count;
    public int forks;
    public int open_issues;
    public int watchers;
    public String default_branch;

    public static class OwnerEntity implements Parcelable {
        public String login;
        public int id;
        public String avatar_url;
        public String gravatar_id;
        public String url;
        public String html_url;
        public String followers_url;
        public String following_url;
        public String gists_url;
        public String starred_url;
        public String subscriptions_url;
        public String organizations_url;
        public String repos_url;
        public String events_url;
        public String received_events_url;
        public String type;
        public boolean site_admin;

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.login);
            dest.writeInt(this.id);
            dest.writeString(this.avatar_url);
            dest.writeString(this.gravatar_id);
            dest.writeString(this.url);
            dest.writeString(this.html_url);
            dest.writeString(this.followers_url);
            dest.writeString(this.following_url);
            dest.writeString(this.gists_url);
            dest.writeString(this.starred_url);
            dest.writeString(this.subscriptions_url);
            dest.writeString(this.organizations_url);
            dest.writeString(this.repos_url);
            dest.writeString(this.events_url);
            dest.writeString(this.received_events_url);
            dest.writeString(this.type);
            dest.writeByte(site_admin ? (byte) 1 : (byte) 0);
        }

        public OwnerEntity() {
        }

        protected OwnerEntity(Parcel in) {
            this.login = in.readString();
            this.id = in.readInt();
            this.avatar_url = in.readString();
            this.gravatar_id = in.readString();
            this.url = in.readString();
            this.html_url = in.readString();
            this.followers_url = in.readString();
            this.following_url = in.readString();
            this.gists_url = in.readString();
            this.starred_url = in.readString();
            this.subscriptions_url = in.readString();
            this.organizations_url = in.readString();
            this.repos_url = in.readString();
            this.events_url = in.readString();
            this.received_events_url = in.readString();
            this.type = in.readString();
            this.site_admin = in.readByte() != 0;
        }

        public static final Creator<OwnerEntity> CREATOR = new Creator<OwnerEntity>() {
            public OwnerEntity createFromParcel(Parcel source) {
                return new OwnerEntity(source);
            }

            public OwnerEntity[] newArray(int size) {
                return new OwnerEntity[size];
            }
        };
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.id);
        dest.writeString(this.name);
        dest.writeString(this.full_name);
        dest.writeParcelable(this.owner, 0);
        dest.writeByte(privateX ? (byte) 1 : (byte) 0);
        dest.writeString(this.html_url);
        dest.writeString(this.description);
        dest.writeByte(fork ? (byte) 1 : (byte) 0);
        dest.writeString(this.url);
        dest.writeString(this.forks_url);
        dest.writeString(this.keys_url);
        dest.writeString(this.collaborators_url);
        dest.writeString(this.teams_url);
        dest.writeString(this.hooks_url);
        dest.writeString(this.issue_events_url);
        dest.writeString(this.events_url);
        dest.writeString(this.assignees_url);
        dest.writeString(this.branches_url);
        dest.writeString(this.tags_url);
        dest.writeString(this.blobs_url);
        dest.writeString(this.git_tags_url);
        dest.writeString(this.git_refs_url);
        dest.writeString(this.trees_url);
        dest.writeString(this.statuses_url);
        dest.writeString(this.languages_url);
        dest.writeString(this.stargazers_url);
        dest.writeString(this.contributors_url);
        dest.writeString(this.subscribers_url);
        dest.writeString(this.subscription_url);
        dest.writeString(this.commits_url);
        dest.writeString(this.git_commits_url);
        dest.writeString(this.comments_url);
        dest.writeString(this.issue_comment_url);
        dest.writeString(this.contents_url);
        dest.writeString(this.compare_url);
        dest.writeString(this.merges_url);
        dest.writeString(this.archive_url);
        dest.writeString(this.downloads_url);
        dest.writeString(this.issues_url);
        dest.writeString(this.pulls_url);
        dest.writeString(this.milestones_url);
        dest.writeString(this.notifications_url);
        dest.writeString(this.labels_url);
        dest.writeString(this.releases_url);
        dest.writeString(this.deployments_url);
        dest.writeString(this.created_at);
        dest.writeString(this.updated_at);
        dest.writeString(this.pushed_at);
        dest.writeString(this.git_url);
        dest.writeString(this.ssh_url);
        dest.writeString(this.clone_url);
        dest.writeString(this.svn_url);
        dest.writeString(this.homepage);
        dest.writeInt(this.size);
        dest.writeInt(this.stargazers_count);
        dest.writeInt(this.watchers_count);
        dest.writeString(this.language);
        dest.writeByte(has_issues ? (byte) 1 : (byte) 0);
        dest.writeByte(has_downloads ? (byte) 1 : (byte) 0);
        dest.writeByte(has_wiki ? (byte) 1 : (byte) 0);
        dest.writeByte(has_pages ? (byte) 1 : (byte) 0);
        dest.writeInt(this.forks_count);
        dest.writeString(this.mirror_url);
        dest.writeInt(this.open_issues_count);
        dest.writeInt(this.forks);
        dest.writeInt(this.open_issues);
        dest.writeInt(this.watchers);
        dest.writeString(this.default_branch);
    }

    public RepoEntity() {
    }

    protected RepoEntity(Parcel in) {
        this.id = in.readInt();
        this.name = in.readString();
        this.full_name = in.readString();
        this.owner = in.readParcelable(OwnerEntity.class.getClassLoader());
        this.privateX = in.readByte() != 0;
        this.html_url = in.readString();
        this.description = in.readString();
        this.fork = in.readByte() != 0;
        this.url = in.readString();
        this.forks_url = in.readString();
        this.keys_url = in.readString();
        this.collaborators_url = in.readString();
        this.teams_url = in.readString();
        this.hooks_url = in.readString();
        this.issue_events_url = in.readString();
        this.events_url = in.readString();
        this.assignees_url = in.readString();
        this.branches_url = in.readString();
        this.tags_url = in.readString();
        this.blobs_url = in.readString();
        this.git_tags_url = in.readString();
        this.git_refs_url = in.readString();
        this.trees_url = in.readString();
        this.statuses_url = in.readString();
        this.languages_url = in.readString();
        this.stargazers_url = in.readString();
        this.contributors_url = in.readString();
        this.subscribers_url = in.readString();
        this.subscription_url = in.readString();
        this.commits_url = in.readString();
        this.git_commits_url = in.readString();
        this.comments_url = in.readString();
        this.issue_comment_url = in.readString();
        this.contents_url = in.readString();
        this.compare_url = in.readString();
        this.merges_url = in.readString();
        this.archive_url = in.readString();
        this.downloads_url = in.readString();
        this.issues_url = in.readString();
        this.pulls_url = in.readString();
        this.milestones_url = in.readString();
        this.notifications_url = in.readString();
        this.labels_url = in.readString();
        this.releases_url = in.readString();
        this.deployments_url = in.readString();
        this.created_at = in.readString();
        this.updated_at = in.readString();
        this.pushed_at = in.readString();
        this.git_url = in.readString();
        this.ssh_url = in.readString();
        this.clone_url = in.readString();
        this.svn_url = in.readString();
        this.homepage = in.readString();
        this.size = in.readInt();
        this.stargazers_count = in.readInt();
        this.watchers_count = in.readInt();
        this.language = in.readString();
        this.has_issues = in.readByte() != 0;
        this.has_downloads = in.readByte() != 0;
        this.has_wiki = in.readByte() != 0;
        this.has_pages = in.readByte() != 0;
        this.forks_count = in.readInt();
        this.mirror_url = in.readString();
        this.open_issues_count = in.readInt();
        this.forks = in.readInt();
        this.open_issues = in.readInt();
        this.watchers = in.readInt();
        this.default_branch = in.readString();
    }

    public static final Creator<RepoEntity> CREATOR = new Creator<RepoEntity>() {
        public RepoEntity createFromParcel(Parcel source) {
            return new RepoEntity(source);
        }

        public RepoEntity[] newArray(int size) {
            return new RepoEntity[size];
        }
    };
}

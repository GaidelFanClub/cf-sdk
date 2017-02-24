package com.gaidelfanclub.sdk;


import com.gaidelfanclub.sdk.model.BaseResponse;
import com.gaidelfanclub.sdk.model.BlogEntry;
import com.gaidelfanclub.sdk.model.Comment;
import com.gaidelfanclub.sdk.model.Contest;
import com.gaidelfanclub.sdk.model.Hack;
import com.gaidelfanclub.sdk.model.Problem;
import com.gaidelfanclub.sdk.model.Problems;
import com.gaidelfanclub.sdk.model.RatingChange;
import com.gaidelfanclub.sdk.model.RecentAction;
import com.gaidelfanclub.sdk.model.Standings;
import com.gaidelfanclub.sdk.model.Submission;
import com.gaidelfanclub.sdk.model.User;
import com.gaidelfanclub.sdk.service.ApiService;
import com.gaidelfanclub.sdk.utils.QueryUtils;

import java.io.IOException;
import java.util.List;
import java.util.StringTokenizer;

import retrofit2.Response;

public class CodeforcesSDK {

    private CodeforcesSDK() {
    }

    public static List<Comment> blogEntryComments(int blogEntryId) throws IOException {
        Response<BaseResponse<List<Comment>>> comments = ApiService.getInstance().loadComments(blogEntryId).execute();
        return comments.body().getResult();
    }

    public static RequestBuilder contestStandings(final int contestId) throws IOException {
        return new RequestBuilder<Standings>() {
            private Integer from;
            private Integer count;
            private String[] handles;
            private Integer room;
            private Boolean showUnofficial;

            RequestBuilder<Standings> from(int from) {
                this.from = from;
                return this;
            }

            RequestBuilder<Standings> count(int count) {
                this.count = count;
                return this;
            }

            RequestBuilder<Standings> handles(String... handles) {
                this.handles = handles;
                return this;
            }

            RequestBuilder<Standings> room(int room) {
                this.room = room;
                return this;
            }

            RequestBuilder<Standings> showUnofficial(boolean showUnofficial) {
                this.showUnofficial = showUnofficial;
                return this;
            }

            @Override
            public Standings execute() throws IOException {
                Response<BaseResponse<Standings>> standings = ApiService.getInstance().loadStandings(contestId, from, count, QueryUtils.listToQuery(handles), room, showUnofficial).execute();
                return standings.body().getResult();
            }
        };
    }

    public static RequestBuilder contestStatus(final int contestId) throws IOException{
        return new RequestBuilder<List<Submission>>() {
            private String handle;
            private int from;
            private int count;

            RequestBuilder<List<Submission>> handle(String handle){
                this.handle = handle;
                return this;
            }

            RequestBuilder<List<Submission>> from(int from){
                this.from = from;
                return this;
            }

            RequestBuilder<List<Submission>> count(int count){
                this.count = count;
                return this;
            }
            @Override
            public List<Submission> execute() throws IOException {
                Response<BaseResponse<List<Submission>>> status = ApiService.getInstance().loadStatus(contestId, handle, from, count).execute();
                return status.body().getResult();
            }
        };
    }

    public static List<Hack> contestHacks(final int contestId) throws IOException{
        Response<BaseResponse<List<Hack>>> hacks = ApiService.getInstance().loadHacks(contestId).execute();
        return hacks.body().getResult();
    }

    public static RequestBuilder<List<Contest>> contestList() throws IOException{
        return new RequestBuilder<List<Contest>>() {
            private boolean gym;

            RequestBuilder<List<Contest>> gym(boolean gym){
                this.gym = gym;
                return this;
            }

            @Override
            public List<Contest> execute() throws IOException {
                Response<BaseResponse<List<Contest>>> list = ApiService.getInstance().loadContests(gym).execute();
                return list.body().getResult();
            }
        };
    }

    public static List<RatingChange> contestRatingChanges(final int contestId) throws IOException {
        Response<BaseResponse<List<RatingChange>>> ratingChanges = ApiService.getInstance().loadRatingChanges(contestId).execute();
        return ratingChanges.body().getResult();
    }

    public static BlogEntry blogEntryView(final int blogEntryId) throws IOException{
        Response<BaseResponse<BlogEntry>> blogEntry = ApiService.getInstance().loadBlogEntry(blogEntryId).execute();
        return blogEntry.body().getResult();
    }

    public static RequestBuilder problemsetProblems() throws  IOException {
        return new RequestBuilder<Problems>() {
            private String[] tags;

            RequestBuilder<Problems> tags(String... tags){
                this.tags = tags;
                return this;
            }
            @Override
            public Problems execute() throws IOException {
                Response<BaseResponse<Problems>> problems = ApiService.getInstance().loadProblems(QueryUtils.listToQuery(tags)).execute();
                return problems.body().getResult();
            }
        };
    }

    public static List<Submission> problemsetRecentStatus(final int count) throws IOException{
        Response<BaseResponse<List<Submission>>> recentStatus = ApiService.getInstance().loadRecentStatuses(count).execute();
        return recentStatus.body().getResult();
    }

    public static List<RecentAction> recentActions(final int maxCount) throws IOException{
        Response<BaseResponse<List<RecentAction>>> recentActions = ApiService.getInstance().loadRecentActions(maxCount).execute();
        return recentActions.body().getResult();
    }

    public static List<BlogEntry> userBlogEntries(final String handle) throws IOException{
        Response<BaseResponse<List<BlogEntry>>> blogEntries = ApiService.getInstance().loadBlogEntries(handle).execute();
        return blogEntries.body().getResult();
    }

    public static RequestBuilder userFriends() throws IOException{
        return new RequestBuilder<List<String>>() {
            private boolean onlyOnline;
            RequestBuilder<List<String>> onlyOnline(boolean onlyOnline){
                this.onlyOnline = onlyOnline;
                return this;
            }
            @Override
            public List<String> execute() throws IOException {
                Response<BaseResponse<List<String>>> handles = ApiService.getInstance().loadFriends(onlyOnline).execute();
                return handles.body().getResult();
            }
        };
    }

    public static List<User> userInfo(final String... handles) throws IOException{
        Response<BaseResponse<List<User>>> users = ApiService.getInstance().loadUser(QueryUtils.listToQuery(handles)).execute();
        return users.body().getResult();
    }

    public static List<RatingChange> userRating(final String handle) throws IOException{
        Response<BaseResponse<List<RatingChange>>> ratingChanges = ApiService.getInstance().loadRatingHistory(handle).execute();
        return ratingChanges.body().getResult();
    }

    public static RequestBuilder userStatus(final String handle){
        return new RequestBuilder<List<Submission>>() {
            private int from;
            private int count;

            RequestBuilder<List<Submission>> from(int from){
                this.from = from;
                return this;
            }
            RequestBuilder<List<Submission>> count(int count){
                this.count = count;
                return this;
            }

            @Override
            public List<Submission> execute() throws IOException {
                Response<BaseResponse<List<Submission>>> statuses = ApiService.getInstance().loadStatuses(handle,from,count).execute();
                return statuses.body().getResult();
            }
        };
    }

    public static RequestBuilder userRatedList() throws IOException{
        return new RequestBuilder<List<User>>() {
            private boolean activeOnly;

            RequestBuilder<List<User>> activeOnly(boolean activeOnly){
                this.activeOnly = activeOnly;
                return this;
            }
            @Override
            public List<User> execute() throws IOException {
                Response<BaseResponse<List<User>>> ratedList = ApiService.getInstance().loadRatedList(activeOnly).execute();
                return ratedList.body().getResult();
            }
        };
    }
}

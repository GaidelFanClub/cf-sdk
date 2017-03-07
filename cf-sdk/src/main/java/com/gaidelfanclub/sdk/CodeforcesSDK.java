package com.gaidelfanclub.sdk;

import com.gaidelfanclub.sdk.request.BlogEntriesRequest;
import com.gaidelfanclub.sdk.request.BlogViewRequest;
import com.gaidelfanclub.sdk.request.CommentsRequest;
import com.gaidelfanclub.sdk.request.ContestListRequest;
import com.gaidelfanclub.sdk.request.ContestStatusRequest;
import com.gaidelfanclub.sdk.request.FriendsRequest;
import com.gaidelfanclub.sdk.request.HacksRequest;
import com.gaidelfanclub.sdk.request.ProblemsRequest;
import com.gaidelfanclub.sdk.request.RatedListRequest;
import com.gaidelfanclub.sdk.request.RatingChangesRequest;
import com.gaidelfanclub.sdk.request.RatingHistoryRequest;
import com.gaidelfanclub.sdk.request.RecentActionsRequest;
import com.gaidelfanclub.sdk.request.RecentStatusRequest;
import com.gaidelfanclub.sdk.request.StandingsRequest;
import com.gaidelfanclub.sdk.request.UserInfoRequest;
import com.gaidelfanclub.sdk.request.UserStatusRequest;

public class CodeforcesSDK {

    private CodeforcesSDK() {
    }

    public static StandingsRequest contestStandings(int contestId) {
        return new StandingsRequest(contestId);
    }

    public static CommentsRequest blogEntryComments(int blogEntryId) {
        return new CommentsRequest(blogEntryId);
    }

    public static BlogViewRequest blogEntryView(int blogEntryId) {
        return new BlogViewRequest(blogEntryId);
    }

    public static HacksRequest contestHacks(int contestId) {
        return new HacksRequest(contestId);
    }

    public static ContestListRequest contestList() {
        return new ContestListRequest();
    }

    public static RatingChangesRequest contestRatingChanges(int contestId) {
        return new RatingChangesRequest(contestId);
    }

    public static ContestStatusRequest contestStatus(int contestId) {
        return new ContestStatusRequest(contestId);
    }

    public static ProblemsRequest problemsetProblems() {
        return new ProblemsRequest();
    }

    public static RecentStatusRequest problemsetRecentStatus(int count) {
        return new RecentStatusRequest(count);
    }

    public static RecentActionsRequest recentActions(int maxCount) {
        return new RecentActionsRequest(maxCount);
    }

    public static BlogEntriesRequest userBlogEntries(String handle) {
        return new BlogEntriesRequest(handle);
    }

    public static FriendsRequest userFriends() {
        return new FriendsRequest();
    }

    public static UserInfoRequest userInfo(String... handles) {
        return new UserInfoRequest(handles);
    }

    public static RatedListRequest userRatedList() {
        return new RatedListRequest();
    }

    public static RatingHistoryRequest userRating(String handle) {
        return new RatingHistoryRequest(handle);
    }

    public static UserStatusRequest userStatus(String handle) {
        return new UserStatusRequest(handle);
    }


}

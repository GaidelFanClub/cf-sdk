package com.gaidelfanclub.sdk.model.service;

import com.gaidelfanclub.sdk.model.BaseResponse;
import com.gaidelfanclub.sdk.model.BlogEntry;
import com.gaidelfanclub.sdk.model.Comment;
import com.gaidelfanclub.sdk.model.Contest;
import com.gaidelfanclub.sdk.model.Hack;
import com.gaidelfanclub.sdk.model.Problems;
import com.gaidelfanclub.sdk.model.RatingChange;
import com.gaidelfanclub.sdk.model.RecentAction;
import com.gaidelfanclub.sdk.model.Standing;
import com.gaidelfanclub.sdk.model.Submission;
import com.gaidelfanclub.sdk.model.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Artem on 23.02.2017.
 */

public interface ApiInterface {



    @GET("blogEntry.comments")
    Call<BaseResponse<List<Comment>>> loadComments(@Query("blogEntryId") int blogEntryId );

    @GET("blogEntryId.view")
    Call<BaseResponse<BlogEntry>> loadBlogEntry(@Query("blogEntryId") int blogEntryId);

    @GET("contest.hacks")
    Call<BaseResponse<List<Hack>>> loadHacks(@Query("contestId") int contestId);

    @GET("contest.list")
    Call<BaseResponse<List<Contest>>> loadContests(@Query("gym") Boolean gym);

    @GET("contest.ratingChanges")
    Call<BaseResponse<List<RatingChange>>> loadRatingChanges(@Query("contestId") int contestId);

    @GET("contest.standings")
    Call<BaseResponse<Standing>> loadStanding(@Query("contestId") int contestId, @Query("from") Integer from, @Query("handles") String handle, @Query("room") Integer room, @Query("showUnofficial") Boolean showUnofficial);

    @GET("contest.status")
    Call<BaseResponse<List<Submission>>> loadStatus(@Query("contestId") int contestId, @Query("handle") String handle, @Query("from") Integer from, @Query("count") Integer count);

    @GET("problemset.recentStatus")
    Call<BaseResponse<List<Submission>>> loadSubmissions(@Query("count") int count);

    @GET("problemset.problems")
    Call<BaseResponse<Problems>> loadProblems(@Query("tags") String tag);

    @GET("recentActions")
    Call<BaseResponse<List<RecentAction>>> loadRecentActions(@Query("maxCount") int maxCount);

    @GET("user.blogEntries")
    Call<BaseResponse<List<BlogEntry>>> loadBlogEntries(@Query("onlyOnline") boolean isOnlyOnline);

    @GET("user.friends")
    Call<BaseResponse<List<User>>> loadFriends(@Query("onlyOnline") Boolean onlyOnline);

    @GET("user.info")
    Call<BaseResponse<List<User>>> loadUser(@Query("handles") String handle);

    @GET("user.ratedList")
    Call<BaseResponse<List<User>>> loadRatedList(@Query("activeOnly") Boolean isActiveOnly);

    @GET("user.rating")
    Call<BaseResponse<List<RatingChange>>> loadRatingHistory(@Query("handle") String handle);

    @GET("user.status")
    Call<BaseResponse<List<Submission>>> loadSubmisiions(@Query("handle") String handle, @Query("from") Integer from, @Query("count") Integer count);







}

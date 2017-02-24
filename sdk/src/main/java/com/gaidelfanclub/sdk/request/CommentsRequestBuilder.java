package com.gaidelfanclub.sdk.request;

import com.gaidelfanclub.sdk.model.BaseResponse;
import com.gaidelfanclub.sdk.model.Comment;
import com.gaidelfanclub.sdk.model.Standings;
import com.gaidelfanclub.sdk.service.ApiService;
import com.gaidelfanclub.sdk.utils.QueryUtils;

import java.util.List;

import retrofit2.Call;

/**
 * Created by Artem on 25.02.2017.
 */

public class CommentsRequestBuilder extends RequestBuilder<List<Comment>> {
    private int blogEntryId;

    public CommentsRequestBuilder(int blogEntryId){
        this.blogEntryId = blogEntryId;
    }

    @Override
    protected Call<BaseResponse<List<Comment>>> call() {
        return ApiService.getInstance().loadComments(blogEntryId);
    }
}

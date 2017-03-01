package com.gaidelfanclub.sdk.request;

import com.gaidelfanclub.sdk.model.BaseResponse;
import com.gaidelfanclub.sdk.model.BlogEntry;
import com.gaidelfanclub.sdk.service.ApiService;

import retrofit2.Call;

/**
 * Created by Artem on 25.02.2017.
 */

public class BlogViewRequest extends RequestBuilder<BlogEntry> {
    private int blogEntryId;

    public BlogViewRequest(int blogEntryId) {
        this.blogEntryId = blogEntryId;
    }

    @Override
    protected Call<BaseResponse<BlogEntry>> call() {
        return ApiService.getInstance().loadBlogEntry(blogEntryId);
    }
}

package com.gaidelfanclub.sdk.request;

import com.gaidelfanclub.sdk.model.BaseResponse;
import com.gaidelfanclub.sdk.model.BlogEntry;
import com.gaidelfanclub.sdk.service.ApiService;

import java.util.List;

import retrofit2.Call;

/**
 * Created by Artem on 25.02.2017.
 */

public class BlogEntriesRequest extends RequestBuilder<List<BlogEntry>> {
    private String handle;

    public BlogEntriesRequest(String handle) {
        this.handle = handle;
    }

    @Override
    protected Call<BaseResponse<List<BlogEntry>>> call() {
        return ApiService.getInstance().loadBlogEntries(handle);
    }
}

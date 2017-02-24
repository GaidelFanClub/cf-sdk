package com.gaidelfanclub.sdk.request;

import com.gaidelfanclub.sdk.model.BaseResponse;
import com.gaidelfanclub.sdk.model.Submission;
import com.gaidelfanclub.sdk.service.ApiService;

import java.util.List;

import retrofit2.Call;

/**
 * Created by Artem on 25.02.2017.
 */

public class UserStatusRequestBuilder extends RequestBuilder<List<Submission>> {
    private String handle;
    private Integer from;
    private Integer count;

    public UserStatusRequestBuilder(String handle){
        this.handle = handle;
    }

    public UserStatusRequestBuilder from(int drom){
        this.from = from;
        return this;
    }

    public UserStatusRequestBuilder count(int count){
        this.count = count;
        return this;
    }
    @Override
    protected Call<BaseResponse<List<Submission>>> call() {
        return ApiService.getInstance().loadStatuses(handle, from, count);
    }
}

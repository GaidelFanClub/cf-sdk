package com.gaidelfanclub.sdk.request;

import com.gaidelfanclub.sdk.model.BaseResponse;
import com.gaidelfanclub.sdk.model.Contest;
import com.gaidelfanclub.sdk.model.Submission;
import com.gaidelfanclub.sdk.service.ApiService;

import java.util.List;

import retrofit2.Call;

/**
 * Created by Artem on 25.02.2017.
 */

public class ContestStatusRequestBuilder extends RequestBuilder<List<Submission>>{
    private int contestId;
    private String handle;
    private Integer from;
    private Integer count;

    public ContestStatusRequestBuilder(int contestId){
        this.contestId = contestId;
    }

    public ContestStatusRequestBuilder handle(String handle){
        this.handle = handle;
        return this;
    }

    public ContestStatusRequestBuilder from(int from){
        this.from = from;
        return this;
    }

    public ContestStatusRequestBuilder count(int count){
        this.count = count;
        return this;
    }

    @Override
    protected Call<BaseResponse<List<Submission>>> call() {
        return ApiService.getInstance().loadStatus(contestId, handle, from, count);
    }
}

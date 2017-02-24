package com.gaidelfanclub.sdk.request;

import com.gaidelfanclub.sdk.model.BaseResponse;
import com.gaidelfanclub.sdk.model.Hack;
import com.gaidelfanclub.sdk.service.ApiService;

import java.util.List;

import retrofit2.Call;

/**
 * Created by Artem on 25.02.2017.
 */

public class HacksRequestBuilder extends RequestBuilder<List<Hack>> {

    private int contestId;

    public HacksRequestBuilder(int contestId){
        this.contestId = contestId;
    }
    @Override
    protected Call<BaseResponse<List<Hack>>> call() {
        return ApiService.getInstance().loadHacks(contestId);
    }
}

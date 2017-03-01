package com.gaidelfanclub.sdk.request;

import com.gaidelfanclub.sdk.model.BaseResponse;
import com.gaidelfanclub.sdk.model.Contest;
import com.gaidelfanclub.sdk.service.ApiService;

import java.util.List;

import retrofit2.Call;

/**
 * Created by Artem on 25.02.2017.
 */

public class ContestListRequest extends RequestBuilder<List<Contest>> {
    private Boolean gym;

    public ContestListRequest gym(boolean gym) {
        this.gym = gym;
        return this;
    }

    @Override
    protected Call<BaseResponse<List<Contest>>> call() {
        return ApiService.getInstance().loadContests(gym);
    }
}

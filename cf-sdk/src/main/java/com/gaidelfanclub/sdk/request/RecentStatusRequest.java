package com.gaidelfanclub.sdk.request;

import com.gaidelfanclub.sdk.model.BaseResponse;
import com.gaidelfanclub.sdk.model.Submission;
import com.gaidelfanclub.sdk.service.ApiService;

import java.util.List;

import retrofit2.Call;

/**
 * Created by Artem on 25.02.2017.
 */

public class RecentStatusRequest extends RequestBuilder<List<Submission>> {
    private int count;

    public RecentStatusRequest(int count) {
        this.count = count;
    }

    @Override
    protected Call<BaseResponse<List<Submission>>> call() {
        return ApiService.getInstance().loadRecentStatuses(count);
    }
}

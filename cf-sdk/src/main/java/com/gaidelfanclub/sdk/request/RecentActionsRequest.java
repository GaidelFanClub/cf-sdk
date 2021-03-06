package com.gaidelfanclub.sdk.request;

import com.gaidelfanclub.sdk.model.BaseResponse;
import com.gaidelfanclub.sdk.model.RecentAction;
import com.gaidelfanclub.sdk.service.ApiService;

import java.util.List;

import retrofit2.Call;

/**
 * Created by Artem on 25.02.2017.
 */

public class RecentActionsRequest extends RequestBuilder<List<RecentAction>> {
    private int maxCount;

    public RecentActionsRequest(int maxCount) {
        this.maxCount = maxCount;
    }

    @Override
    protected Call<BaseResponse<List<RecentAction>>> call() {
        return ApiService.getInstance().loadRecentActions(maxCount);
    }
}

package com.gaidelfanclub.sdk.request;

import com.gaidelfanclub.sdk.model.BaseResponse;
import com.gaidelfanclub.sdk.model.RatingChange;
import com.gaidelfanclub.sdk.service.ApiService;

import java.util.List;

import retrofit2.Call;

/**
 * Created by Artem on 25.02.2017.
 */

public class RatingHistoryRequest extends RequestBuilder<List<RatingChange>> {
    private String handle;

    public RatingHistoryRequest(String handle) {
        this.handle = handle;
    }

    @Override
    protected Call<BaseResponse<List<RatingChange>>> call() {
        return ApiService.getInstance().loadRatingHistory(handle);
    }
}

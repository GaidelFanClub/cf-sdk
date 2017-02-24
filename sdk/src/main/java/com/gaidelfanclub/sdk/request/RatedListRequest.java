package com.gaidelfanclub.sdk.request;

import com.gaidelfanclub.sdk.model.BaseResponse;

import com.gaidelfanclub.sdk.model.User;
import com.gaidelfanclub.sdk.service.ApiService;

import java.util.List;

import retrofit2.Call;

/**
 * Created by Artem on 25.02.2017.
 */

public class RatedListRequest extends RequestBuilder<List<User>> {
    private Boolean activeOnly;

    public RatedListRequest activeOnly(boolean activeOnly) {
        this.activeOnly = activeOnly;
        return this;
    }

    @Override
    protected Call<BaseResponse<List<User>>> call() {
        return ApiService.getInstance().loadRatedList(activeOnly);
    }
}

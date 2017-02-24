package com.gaidelfanclub.sdk.request;

import com.gaidelfanclub.sdk.model.BaseResponse;
import com.gaidelfanclub.sdk.service.ApiService;

import java.util.List;

import retrofit2.Call;

/**
 * Created by Artem on 25.02.2017.
 */

public class FriendsRequest extends RequestBuilder<List<String>> {
    private Boolean onlyOnline;

    public FriendsRequest onlyOnline(boolean onlyOnline) {
        this.onlyOnline = onlyOnline;
        return this;
    }

    @Override
    protected Call<BaseResponse<List<String>>> call() {
        return ApiService.getInstance().loadFriends(onlyOnline);
    }
}

package com.gaidelfanclub.sdk.request;

import com.gaidelfanclub.sdk.model.BaseResponse;
import com.gaidelfanclub.sdk.model.User;
import com.gaidelfanclub.sdk.service.ApiService;
import com.gaidelfanclub.sdk.utils.QueryUtils;

import java.util.List;

import retrofit2.Call;

/**
 * Created by Artem on 25.02.2017.
 */

public class UserInfoRequest extends RequestBuilder<List<User>> {
    private String[] handles;

    public UserInfoRequest(String... handles) {
        this.handles = handles;
    }

    @Override
    protected Call<BaseResponse<List<User>>> call() {
        return ApiService.getInstance().loadUser(QueryUtils.listToQuery(handles));
    }
}

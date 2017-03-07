package com.gaidelfanclub.sdk.request;


import com.gaidelfanclub.sdk.ApiException;
import com.gaidelfanclub.sdk.model.BaseResponse;
import com.gaidelfanclub.sdk.utils.ResponseUtils;

import java.io.IOException;

import retrofit2.Call;

public abstract class RequestBuilder<T> {

    public final T execute() throws IOException, ApiException {
        return ResponseUtils.transformCall(call());
    }

    protected abstract Call<BaseResponse<T>> call();
}

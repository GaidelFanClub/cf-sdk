package com.gaidelfanclub.sdk.utils;

import com.gaidelfanclub.sdk.ApiException;
import com.gaidelfanclub.sdk.model.BaseResponse;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Response;

public class ResponseUtils {

    private static final int OK_CODE = 200; // TODO i suppose that there are constant in retrofit/okhhtp

    public static <T> T transformCall(Call<BaseResponse<T>> call) throws IOException, ApiException {
        Response<BaseResponse<T>> response = call.execute();
        if (response.code() == OK_CODE) {
            BaseResponse<T> baseResponse = response.body();
            if (baseResponse.isSuccess()) {
                return baseResponse.getResult();
            } else {
                throw new ApiException(response.code(), baseResponse.getComment());
            }
        } else {
            throw new ApiException(response.code(), "Incorrect response code");
        }
    }
}

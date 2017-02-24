package com.gaidelfanclub.sdk.request;

import com.gaidelfanclub.sdk.model.BaseResponse;
import com.gaidelfanclub.sdk.model.Problems;
import com.gaidelfanclub.sdk.service.ApiService;
import com.gaidelfanclub.sdk.utils.QueryUtils;

import retrofit2.Call;

/**
 * Created by Artem on 25.02.2017.
 */

public class ProblemsRequest extends RequestBuilder<Problems> {
    private String[] tags;

    public ProblemsRequest tags(String... tags) {
        this.tags = tags;
        return this;
    }

    @Override
    protected Call<BaseResponse<Problems>> call() {
        return ApiService.getInstance().loadProblems(QueryUtils.listToQuery(tags));
    }
}

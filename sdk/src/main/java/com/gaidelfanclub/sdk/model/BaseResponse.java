package com.gaidelfanclub.sdk.model;

/**
 * Created by Artem on 23.02.2017.
 */

public class BaseResponse<T> {

    private String status;
    private String comment;
    private T result;

    public T getResult() {
        return result;
    }

}
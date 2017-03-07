package com.gaidelfanclub.sdk.model;

/**
 * Created by Artem on 23.02.2017.
 */

public class BaseResponse<T> {

    private static final String OK_STATUS = "OK";

    private String status;
    private String comment;
    private T result;

    public boolean isSuccess() {
        return OK_STATUS.equals(status);
    }

    public String getComment() {
        return comment;
    }

    public T getResult() {
        return result;
    }

}
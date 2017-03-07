package com.gaidelfanclub.sdk.service;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiService {

    private static final String BASE_URL = "http://codeforces.com/api/";
    private static ApiInterface instance;

    public static ApiInterface getInstance() {
        if (instance == null) {
            synchronized (ApiService.class) {
                if (instance == null) {
                    instance = createInterface();
                }
            }
        }
        return instance;
    }

    private static ApiInterface createInterface() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit.create(ApiInterface.class);
    }
}

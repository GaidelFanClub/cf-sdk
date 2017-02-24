package com.gaidelfanclub.sdk;


import com.gaidelfanclub.sdk.model.BaseResponse;
import com.gaidelfanclub.sdk.model.Comment;
import com.gaidelfanclub.sdk.model.Standings;
import com.gaidelfanclub.sdk.service.ApiService;
import com.gaidelfanclub.sdk.utils.QueryUtils;

import java.io.IOException;
import java.util.List;

import retrofit2.Response;

public class CodeforcesSDK {

    private CodeforcesSDK() {
    }

    public static List<Comment> blogEntryComments(int blogEntryId) throws IOException {
        Response<BaseResponse<List<Comment>>> comments = ApiService.getInstance().loadComments(blogEntryId).execute();
        return comments.body().getResult();
    }

    public static RequestBuilder contestStandings(final int contestId) throws IOException {
        return new RequestBuilder<Standings>() {
            private Integer from;
            private Integer count;
            private String[] handles;
            private Integer room;
            private Boolean showUnofficial;

            RequestBuilder<Standings> from(int from) {
                this.from = from;
                return this;
            }

            RequestBuilder<Standings> count(int count) {
                this.count = count;
                return this;
            }

            RequestBuilder<Standings> handles(String... handles) {
                this.handles = handles;
                return this;
            }

            RequestBuilder<Standings> room(int room) {
                this.room = room;
                return this;
            }

            RequestBuilder<Standings> showUnofficial(boolean showUnofficial) {
                this.showUnofficial = showUnofficial;
                return this;
            }

            @Override
            public Standings execute() throws IOException {
                Response<BaseResponse<Standings>> standings = ApiService.getInstance().loadStandings(contestId, from, count, QueryUtils.listToQuery(handles), room, showUnofficial).execute();
                return standings.body().getResult();
            }
        };
    }
}

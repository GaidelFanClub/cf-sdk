package com.gaidelfanclub.sdk.request;

import com.gaidelfanclub.sdk.model.BaseResponse;
import com.gaidelfanclub.sdk.model.Standings;
import com.gaidelfanclub.sdk.service.ApiService;
import com.gaidelfanclub.sdk.utils.QueryUtils;

import retrofit2.Call;

public class StandingsRequest extends RequestBuilder<Standings> {

    private int contestId;
    private Integer from;
    private Integer count;
    private String[] handles;
    private Integer room;
    private Boolean showUnofficial;

    public StandingsRequest(int contestId) {
        this.contestId = contestId;
    }

    public StandingsRequest from(int from) {
        this.from = from;
        return this;
    }

    public StandingsRequest count(int count) {
        this.count = count;
        return this;
    }

    public StandingsRequest handles(String... handles) {
        this.handles = handles;
        return this;
    }

    public StandingsRequest room(int room) {
        this.room = room;
        return this;
    }

    public StandingsRequest showUnofficial(boolean showUnofficial) {
        this.showUnofficial = showUnofficial;
        return this;
    }

    @Override
    protected Call<BaseResponse<Standings>> call() {
        return ApiService.getInstance().loadStandings(contestId, from, count, QueryUtils.listToQuery(handles), room, showUnofficial);
    }
}

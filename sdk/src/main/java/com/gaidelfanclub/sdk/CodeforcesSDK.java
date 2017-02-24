package com.gaidelfanclub.sdk;

import com.gaidelfanclub.sdk.request.StandingsRequestBuilder;

import java.io.IOException;

public class CodeforcesSDK {

    private CodeforcesSDK() {
    }

    public static StandingsRequestBuilder contestStandings(final int contestId) throws IOException {
        return new StandingsRequestBuilder(contestId);
    }

}

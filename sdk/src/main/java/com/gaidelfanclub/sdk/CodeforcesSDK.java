package com.gaidelfanclub.sdk;

import com.gaidelfanclub.sdk.request.StandingsRequest;

import java.io.IOException;

public class CodeforcesSDK {

    private CodeforcesSDK() {
    }

    public static StandingsRequest contestStandings(final int contestId) throws IOException {
        return new StandingsRequest(contestId);
    }

}

package com.gaidelfanclub.sdk.model;

import java.util.List;

/**
 * Created by Artem on 23.02.2017.
 */

public class Standings {
    private Contest contest;
    private List<Problem> problems;
    private List<RanklistRow> rows;

    public Contest getContest(){
        return contest;
    }

    public List<Problem> getProblems() {
        return problems;
    }

    public List<RanklistRow> getRows() {
        return rows;
    }
}

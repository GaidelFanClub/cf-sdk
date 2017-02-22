package com.gaidelfanclub.sdk.model;

import java.util.List;

public class RanklistRow {

    private Party party;
    private int rank;
    private double points;
    private int penalty;
    private int successfulHackCount;
    private int unsuccessfulHackCount;
    private List<ProblemResult> problemResults;
    private long lastSubmissionTimeSeconds;

    public Party getParty() {
        return party;
    }

    public int getRank() {
        return rank;
    }

    public double getPoints() {
        return points;
    }

    public int getPenalty() {
        return penalty;
    }

    public int getSuccessfulHackCount() {
        return successfulHackCount;
    }

    public int getUnsuccessfulHackCount() {
        return unsuccessfulHackCount;
    }

    public List<ProblemResult> getProblemResults() {
        return problemResults;
    }

    public long getLastSubmissionTimeSeconds() {
        return lastSubmissionTimeSeconds;
    }
}

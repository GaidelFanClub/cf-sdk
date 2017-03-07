package com.gaidelfanclub.sdk.model;

public class RatingChange {

    private int contestId;
    private String contestName;
    private String handle;
    private int rank;
    private long ratingUpdateTimeSeconds;
    private int oldRating;
    private int newRating;

    public int getContestId() {
        return contestId;
    }

    public String getContestName() {
        return contestName;
    }

    public String getHandle() {
        return handle;
    }

    public int getRank() {
        return rank;
    }

    public long getRatingUpdateTimeSeconds() {
        return ratingUpdateTimeSeconds;
    }

    public int getOldRating() {
        return oldRating;
    }

    public int getNewRating() {
        return newRating;
    }
}

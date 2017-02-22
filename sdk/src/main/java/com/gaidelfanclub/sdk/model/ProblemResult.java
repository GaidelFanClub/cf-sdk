package com.gaidelfanclub.sdk.model;


public class ProblemResult {

    public enum Type {
        PRELIMINARY, FINAL;
    }

    private double points;
    private int penalty;
    private int rejectedAttemptCount;
    private Type type;
    private long bestSubmissionTimeSeconds;

    public double getPoints() {
        return points;
    }

    public int getPenalty() {
        return penalty;
    }

    public int getRejectedAttemptCount() {
        return rejectedAttemptCount;
    }

    public Type getType() {
        return type;
    }

    public long getBestSubmissionTimeSeconds() {
        return bestSubmissionTimeSeconds;
    }
}

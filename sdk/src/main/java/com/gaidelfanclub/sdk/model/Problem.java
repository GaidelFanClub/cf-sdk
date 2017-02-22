package com.gaidelfanclub.sdk.model;

import java.util.List;

public class Problem {

    public enum Type {
        PROGRAMMING, QUESTION
    }

    private int contestId;
    private String index;
    private String name;
    private Type type;
    private double points;
    private List<String> tags;

    public int getContestId() {
        return contestId;
    }

    public String getIndex() {
        return index;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public double getPoints() {
        return points;
    }

    public List<String> getTags() {
        return tags;
    }
}

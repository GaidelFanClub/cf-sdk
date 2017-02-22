package com.gaidelfanclub.sdk.model;

public class Contest {

    public enum Type {
        CF, IOI, ICPC
    }

    public enum Phase {
        BEFORE, CODING, PENDING_SYSTEM_TEST, SYSTEM_TEST, FINISHED
    }

    private int id;
    private String name;
    private Type type;
    private Phase phase;
    private boolean frozen;
    private long durationSeconds;
    private long startTimeSeconds;
    private long relativeTimeSeconds;
    private String preparedBy;
    private String websiteUrl;
    private String description;
    private int difficulty;
    private String kind;
    private String icpcRegion;
    private String country;
    private String city;
    private String season;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public Phase getPhase() {
        return phase;
    }

    public boolean isFrozen() {
        return frozen;
    }

    public long getDurationSeconds() {
        return durationSeconds;
    }

    public long getStartTimeSeconds() {
        return startTimeSeconds;
    }

    public long getRelativeTimeSeconds() {
        return relativeTimeSeconds;
    }

    public String getPreparedBy() {
        return preparedBy;
    }

    public String getWebsiteUrl() {
        return websiteUrl;
    }

    public String getDescription() {
        return description;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public String getKind() {
        return kind;
    }

    public String getIcpcRegion() {
        return icpcRegion;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getSeason() {
        return season;
    }
}

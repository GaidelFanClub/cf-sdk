package com.gaidelfanclub.sdk.model;

public class Submission {

    public enum Verdict {
        FAILED, OK, PARTIAL, COMPILATION_ERROR, RUNTIME_ERROR, WRONG_ANSWER, PRESENTATION_ERROR, TIME_LIMIT_EXCEEDED, MEMORY_LIMIT_EXCEEDED, IDLENESS_LIMIT_EXCEEDED, SECURITY_VIOLATED, CRASHED, INPUT_PREPARATION_CRASHED, CHALLENGED, SKIPPED, TESTING, REJECTED
    }

    public enum Testset {
        SAMPLES, PRETESTS, TESTS, CHALLENGES, TESTS1, TESTS2, TESTS3, TESTS4, TESTS5, TESTS6, TESTS7, TESTS8, TESTS9, TESTS10
    }

    private long id;
    private int contestId;
    private long creationTimeSeconds;
    private long relativeTimeSeconds;
    private Problem problem;
    private Party author;
    private String programmingLanguage;
    private Verdict verdict;
    private Testset testset;
    private int passedTestCount;
    private int timeConsumedMillis;
    private long memoryConsumedBytes;

    public long getId() {
        return id;
    }

    public int getContestId() {
        return contestId;
    }

    public long getCreationTimeSeconds() {
        return creationTimeSeconds;
    }

    public long getRelativeTimeSeconds() {
        return relativeTimeSeconds;
    }

    public Problem getProblem() {
        return problem;
    }

    public Party getAuthor() {
        return author;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public Verdict getVerdict() {
        return verdict;
    }

    public Testset getTestset() {
        return testset;
    }

    public int getPassedTestCount() {
        return passedTestCount;
    }

    public int getTimeConsumedMillis() {
        return timeConsumedMillis;
    }

    public long getMemoryConsumedBytes() {
        return memoryConsumedBytes;
    }
}

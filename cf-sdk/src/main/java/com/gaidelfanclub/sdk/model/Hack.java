package com.gaidelfanclub.sdk.model;

public class Hack {

    public enum Verdict {
        HACK_SUCCESSFUL, HACK_UNSUCCESSFUL, INVALID_INPUT, GENERATOR_INCOMPILABLE, GENERATOR_CRASHED, IGNORED, TESTING, OTHER
    }

    private long id;
    private long creationTimeSeconds;
    private Party hacker;
    private Party defender;
    private Verdict verdict;
    private Problem problem;
    private String test;
    private JudgeProtocol judgeProtocol;

    public long getId() {
        return id;
    }

    public long getCreationTimeSeconds() {
        return creationTimeSeconds;
    }

    public Party getHacker() {
        return hacker;
    }

    public Party getDefender() {
        return defender;
    }

    public Verdict getVerdict() {
        return verdict;
    }

    public Problem getProblem() {
        return problem;
    }

    public String getTest() {
        return test;
    }

    public JudgeProtocol getJudgeProtocol() {
        return judgeProtocol;
    }
}

package com.gaidelfanclub.sdk.model;

import java.util.List;

public class Party {

    public enum Type {
        CONTESTANT, PRACTICE, VIRTUAL, MANAGER, OUT_OF_COMPETITION;
    }

    private long contestId;
    private List<Member> members;
    private Type participantType;
    private long teamId;
    private String teamName;
    private boolean ghost;
    private long room;
    private long startTimeSeconds;

    public long getContestId() {
        return contestId;
    }

    public List<Member> getMembers() {
        return members;
    }

    public Type getParticipantType() {
        return participantType;
    }

    public long getTeamId() {
        return teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public boolean isGhost() {
        return ghost;
    }

    public long getRoom() {
        return room;
    }

    public long getStartTimeSeconds() {
        return startTimeSeconds;
    }
}

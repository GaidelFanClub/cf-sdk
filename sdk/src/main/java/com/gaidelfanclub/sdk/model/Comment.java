package com.gaidelfanclub.sdk.model;

public class Comment {

    private long id;
    private long creationTimeSeconds;
    private String commentatorHandle;
    private String locale;
    private String text;
    private long parentCommentId;
    private int rating;

    public long getId() {
        return id;
    }

    public long getCreationTimeSeconds() {
        return creationTimeSeconds;
    }

    public String getCommentatorHandle() {
        return commentatorHandle;
    }

    public String getLocale() {
        return locale;
    }

    public String getText() {
        return text;
    }

    public long getParentCommentId() {
        return parentCommentId;
    }

    public int getRating() {
        return rating;
    }
}

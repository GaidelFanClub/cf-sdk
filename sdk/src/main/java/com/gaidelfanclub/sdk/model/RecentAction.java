package com.gaidelfanclub.sdk.model;

public class RecentAction {

    private long timeSeconds;
    private BlogEntry blogEntry;
    private Comment comment;

    public RecentAction(long timeSeconds, BlogEntry blogEntry, Comment comment) {
        this.timeSeconds = timeSeconds;
        this.blogEntry = blogEntry;
        this.comment = comment;
    }
}

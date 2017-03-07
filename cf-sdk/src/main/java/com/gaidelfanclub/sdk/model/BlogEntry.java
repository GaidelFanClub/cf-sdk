package com.gaidelfanclub.sdk.model;

import java.util.List;

public class BlogEntry {

    private int id;
    private String originalLocale;
    private long creationTimeSeconds;
    private String authorHandle;
    private String title;
    private String content;
    private String locale;
    private long modificationTimeSeconds;
    private boolean allowViewHistory;
    private List<String> tags;
    private int rating;

    public int getId() {
        return id;
    }

    public String getOriginalLocale() {
        return originalLocale;
    }

    public long getCreationTimeSeconds() {
        return creationTimeSeconds;
    }

    public String getAuthorHandle() {
        return authorHandle;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getLocale() {
        return locale;
    }

    public long getModificationTimeSeconds() {
        return modificationTimeSeconds;
    }

    public boolean isAllowViewHistory() {
        return allowViewHistory;
    }

    public List<String> getTags() {
        return tags;
    }

    public int getRating() {
        return rating;
    }
}

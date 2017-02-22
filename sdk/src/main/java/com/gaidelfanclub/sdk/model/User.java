package com.gaidelfanclub.sdk.model;

public class User {

    private String handle;
    private String email;
    private String vkId;
    private String openId;
    private String firstName;
    private String lastName;
    private String country;
    private String city;
    private String organization;
    private int contribution;
    private String rank;
    private int rating;
    private String maxRank;
    private int maxRating;
    private long lastOnlineTimeSeconds;
    private long registrationTimeSeconds;
    private int friendOfCount;
    private String avatar;
    private String titlePhoto;

    public String getHandle() {
        return handle;
    }

    public String getEmail() {
        return email;
    }

    public String getVkId() {
        return vkId;
    }

    public String getOpenId() {
        return openId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getOrganization() {
        return organization;
    }

    public int getContribution() {
        return contribution;
    }

    public String getRank() {
        return rank;
    }

    public int getRating() {
        return rating;
    }

    public String getMaxRank() {
        return maxRank;
    }

    public int getMaxRating() {
        return maxRating;
    }

    public long getLastOnlineTimeSeconds() {
        return lastOnlineTimeSeconds;
    }

    public long getRegistrationTimeSeconds() {
        return registrationTimeSeconds;
    }

    public int getFriendOfCount() {
        return friendOfCount;
    }

    public String getAvatar() {
        return avatar;
    }

    public String getTitlePhoto() {
        return titlePhoto;
    }
}

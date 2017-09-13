package com.kodilla.patterns.strategy.social;

public class User {
    final private String userName;
    protected SocialPublisher socialPublisher;

    public User(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return userName;
    }

    public String predict() {
        return socialPublisher.share();
    }

    public void sharePost(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }

}

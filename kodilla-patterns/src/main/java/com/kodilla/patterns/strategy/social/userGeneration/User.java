package com.kodilla.patterns.strategy.social.userGeneration;

import com.kodilla.patterns.strategy.social.socialPublisher.SocialPublisher;

public class User {
    final private String name;
    protected SocialPublisher socialPublisher;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String sharePost() {
        return socialPublisher.share();
    }

    public void setSocialStrategy(SocialPublisher socialStrategy) {
        this.socialPublisher = socialStrategy;
    }
}

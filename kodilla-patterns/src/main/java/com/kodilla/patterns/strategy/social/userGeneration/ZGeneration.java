package com.kodilla.patterns.strategy.social.userGeneration;

import com.kodilla.patterns.strategy.social.socialPublisher.TwitterPublisher;

public class ZGeneration extends User {
    public ZGeneration(String name) {
        super(name);
        this.socialPublisher = new TwitterPublisher();
    }
}

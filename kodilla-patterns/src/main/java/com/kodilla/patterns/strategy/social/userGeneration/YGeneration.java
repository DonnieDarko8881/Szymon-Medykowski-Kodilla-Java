package com.kodilla.patterns.strategy.social.userGeneration;

import com.kodilla.patterns.strategy.social.socialPublisher.FacebookPublisher;

public class YGeneration extends User {
    public YGeneration(String name) {
        super(name);
        this.socialPublisher = new FacebookPublisher();
    }
}

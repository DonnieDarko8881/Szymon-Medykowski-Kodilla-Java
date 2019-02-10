package com.kodilla.patterns.strategy.social.socialPublisher;

public class TwitterPublisher implements SocialPublisher {
    @Override
    public String share() {
        return "Twitter";
    }
}

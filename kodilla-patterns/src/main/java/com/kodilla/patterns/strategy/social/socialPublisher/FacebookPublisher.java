package com.kodilla.patterns.strategy.social.socialPublisher;

public class FacebookPublisher implements SocialPublisher {

    @Override
    public String share() {
        return "Facebook";
    }
}

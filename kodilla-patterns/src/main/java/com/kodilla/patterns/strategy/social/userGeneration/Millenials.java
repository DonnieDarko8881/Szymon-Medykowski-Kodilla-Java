package com.kodilla.patterns.strategy.social.userGeneration;

import com.kodilla.patterns.strategy.social.socialPublisher.SnapchatPublisher;

public class Millenials extends User {
    public Millenials(String name) {
        super(name);
        this.socialPublisher = new SnapchatPublisher();
    }
}

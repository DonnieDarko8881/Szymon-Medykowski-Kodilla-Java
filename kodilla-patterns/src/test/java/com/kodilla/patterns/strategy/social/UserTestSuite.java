package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.socialPublisher.FacebookPublisher;
import com.kodilla.patterns.strategy.social.userGeneration.Millenials;
import com.kodilla.patterns.strategy.social.userGeneration.User;
import com.kodilla.patterns.strategy.social.userGeneration.YGeneration;
import com.kodilla.patterns.strategy.social.userGeneration.ZGeneration;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User simonMillenials = new Millenials("Simon Millenials");
        User simonYGeneration = new YGeneration("Simon YGeneration");
        User simonZGeneration = new ZGeneration("Simon ZGeneration");

        //When
        String simonMillenialsShare = simonMillenials.sharePost();
        System.out.println("Simon Millenials share post on: " + simonMillenialsShare);
        String simonYGenerationShare = simonYGeneration.sharePost();
        System.out.println("Simon YGeneration share post on: " + simonYGenerationShare);
        String simonZGenerationShare = simonZGeneration.sharePost();
        System.out.println("Simon ZGeneration share post on: " + simonZGenerationShare);

        //Then
        Assert.assertEquals("Snapchat", simonMillenialsShare);
        Assert.assertEquals("Facebook", simonYGenerationShare);
        Assert.assertEquals("Twitter", simonZGenerationShare);

    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User simonMillenials = new Millenials("Simon Millenials");

        //When
        String simonMillenialsShare = simonMillenials.sharePost();
        System.out.println(simonMillenials.getName() + " usually share post on: " + simonMillenialsShare);
        simonMillenials.setSocialStrategy(new FacebookPublisher());
        simonMillenialsShare = simonMillenials.sharePost();
        System.out.println(simonMillenials.getName() + " now is sharing on " + simonMillenialsShare);
        //Then
        Assert.assertEquals("Facebook", simonMillenialsShare);
    }

}


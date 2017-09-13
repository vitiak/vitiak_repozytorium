package com.kodilla.patterns.Strategy.social;

import com.kodilla.patterns.strategy.social.User;
import com.kodilla.patterns.strategy.social.Millenials;
import com.kodilla.patterns.strategy.social.XGeneration;
import com.kodilla.patterns.strategy.social.YGeneration;
import com.kodilla.patterns.strategy.social.TwitterPublisher;
import com.kodilla.patterns.strategy.social.*;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User steven = new Millenials("Steven Links");
        User john = new YGeneration("John Hemerald");
        User kodilla = new XGeneration("Kodilla");

        //When
        String stevenShouldBe = steven.predict();
        System.out.println("Steven should be: " + stevenShouldBe);
        String johnShouldBe = john.predict();
        System.out.println("John should be: " + johnShouldBe);
        String kodillaShouldBe = kodilla.predict();
        System.out.println("Kodilla should: " + kodillaShouldBe);

        //Then
        Assert.assertEquals("FacebookPublisher", stevenShouldBe);
        Assert.assertEquals("SnapchatPublisher", johnShouldBe);
        Assert.assertEquals("TwitterPublisher", kodillaShouldBe);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User steven = new Millenials("Steven Links");

        //When
        String stevenShouldBe = steven.predict();
        System.out.println("Steven should be: " + stevenShouldBe);
        steven.sharePost(new TwitterPublisher());
        stevenShouldBe = steven.predict();
        System.out.println("Steven now should be: " + stevenShouldBe);

        //Then
        Assert.assertEquals("TwitterPublisher", stevenShouldBe);
    }

}

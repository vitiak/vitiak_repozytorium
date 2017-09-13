package com.kodilla.patterns.strategy.social;

public class XGeneration extends User {

    public XGeneration(String userName) {
        super(userName);
        this.socialPublisher = new TwitterPublisher() ;
    }
}

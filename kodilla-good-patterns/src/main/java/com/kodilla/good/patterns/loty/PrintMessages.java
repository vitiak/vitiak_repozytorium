package com.kodilla.good.patterns.loty;

import java.util.ArrayList;
import java.util.List;

public class PrintMessages {

    public void printListOfFly(List<Fly> listOfFly) {
        for (int n=0; n<listOfFly.size(); n++) {
            System.out.println(n+1 + " flight " + listOfFly.get(n).toString());
        }
    }

    public void printListOfFlyPair(List<FlyPair> listOfFlyPair) {
        for (int n=0; n<listOfFlyPair.size(); n++) {
            System.out.println(listOfFlyPair.get(n).toString());
        }
    }
}

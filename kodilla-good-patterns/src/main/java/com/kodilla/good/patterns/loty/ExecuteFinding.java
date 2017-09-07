package com.kodilla.good.patterns.loty;

import java.util.ArrayList;
import java.util.List;

public class ExecuteFinding {

    public static void main(String[] args) throws java.lang.Exception {

        String cityFrom = "Warszawa";
        String cityTo = "Split";

        FindingFly findingFly = new FindingFly();
        PrintMessages printMessages = new PrintMessages();

        List<Fly> listFromCity = findingFly.findingFlyFromCity(cityFrom);
        System.out.println("\nLista lotów z miasta " + cityFrom );
        printMessages.printListOfFly(listFromCity);

        List<Fly> listToCity = findingFly.findingFlyToCity(cityTo);
        System.out.println("\nLista lotów do miasta " + cityTo );
        printMessages.printListOfFly(listToCity);

        List<Fly> listFromTo = findingFly.findingFlyFromToWithoutStop(cityFrom, cityTo);
        System.out.println("\nLista lotów z miasta " + cityFrom + " do miasta " + cityTo );
        printMessages.printListOfFly(listFromTo);

        List<FlyPair> listFromToWithStop = findingFly.findingFlyFromToWithStop(cityFrom, cityTo);
        System.out.println("\nLista lotów z przesiadką z miasta " + cityFrom + " do miasta " + cityTo );
        printMessages.printListOfFlyPair(listFromToWithStop);

    }

}

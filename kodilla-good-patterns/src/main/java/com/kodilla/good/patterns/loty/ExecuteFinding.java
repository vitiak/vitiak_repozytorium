package com.kodilla.good.patterns.loty;

import java.util.ArrayList;
import java.util.List;

public class ExecuteFinding {

    public static void main(String[] args) throws java.lang.Exception {

        String cityFrom = "Warszawa";
        String cityTo = "Split";

        FulListOfFly fullListOfFly = new FulListOfFly();
        FindingFly findingFly = new FindingFly();

        List<Fly> listFromCity = findingFly.findingFlyFromCity(cityFrom);

        System.out.println("Lista lotów z  miasta " + cityFrom);
        for(int n=0; n< listFromCity.size(); n++) {
            System.out.println("Z miasta " + listFromCity.get(n).getFlyFrom() + " do "
                    + listFromCity.get(n).getFlyTo() + " o godz " + listFromCity.get(n).getStartFly());
        }

        List<Fly> listToCity = findingFly.findingFlyToCity(cityTo);

        System.out.println("Lista lotów do  miasta " + cityTo);
        for(int n=0; n< listToCity.size(); n++) {
            System.out.println("Z miasta " + listToCity.get(n).getFlyFrom() + " do "
                    + listToCity.get(n).getFlyTo() + " o godz " + listToCity.get(n).getStartFly());
        }

        System.out.println("Lista lotów z przesiadką z miasta " + cityFrom + " do  miasta " + cityTo);
        for(int n=0; n< listFromCity.size(); n++) {
            for(int k=0; k< listToCity.size(); k++) {
                if (listToCity.get(k).getFlyFrom().equals(listFromCity.get(n).getFlyTo())) {
                    System.out.println("Z miasta " + listFromCity.get(n).getFlyFrom() + " do miasta " +
                            listFromCity.get(n).getFlyTo() + " o godz " + listFromCity.get(n).getStartFly() +
                            " a nastepnie z miasta " + listToCity.get(k).getFlyFrom() + " do "
                            + listToCity.get(k).getFlyTo() + " o godz " + listToCity.get(k).getStartFly());

                }
            }

        }



    }

}

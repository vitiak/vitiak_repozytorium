package com.kodilla.good.patterns.loty;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FindingFly {

    public List<Fly> findingFlyFromCity(String cityFrom) {

        FullListOfFly fullListOfFly = new FullListOfFly();
        List<Fly> resultListOfFly = fullListOfFly.getList().stream()
                .filter(fly -> fly.getFlyFrom().equals(cityFrom))
                .collect(Collectors.toList());
        return resultListOfFly;
    }


    public List<Fly> findingFlyToCity(String cityTo) {

        FullListOfFly fullListOfFly = new FullListOfFly();
        List<Fly> resultListOfFly;
        resultListOfFly = fullListOfFly.getList().stream()
                .filter(fly -> fly.getFlyTo().equals(cityTo))
                .collect(Collectors.toList());
       return resultListOfFly;
    }

    public List<Fly> findingFlyFromToWithoutStop(String cityFrom, String cityTo) {

        FullListOfFly fullListOfFly = new FullListOfFly();
        List<Fly> resultListOfFly;
        resultListOfFly = fullListOfFly.getList().stream()
                .filter(fly -> fly.getFlyFrom().equals(cityFrom))
                .filter(fly -> fly.getFlyTo().equals(cityTo))
                .collect(Collectors.toList());
        return resultListOfFly;
    }


    public List<FlyPair> findingFlyFromToWithStop(String cityFrom, String cityTo) {

        FullListOfFly fullListOfFly = new FullListOfFly();
        ArrayList<FlyPair> resultListOfFlyPair = new ArrayList<>();
        Fly fly1 = null;
        Fly fly2 = null;
        FindingFly findingFly = new FindingFly();

        List<Fly> listFromCity = findingFly.findingFlyFromCity(cityFrom);
        List<Fly> listToCity = findingFly.findingFlyToCity(cityTo);

        for(int n=0; n< listFromCity.size(); n++) {
            for(int k=0; k< listToCity.size(); k++) {
                if (listToCity.get(k).getFlyFrom().equals(listFromCity.get(n).getFlyTo())) {
                    fly1 = listFromCity.get(n);
                    fly2 = listToCity.get(k);
                    resultListOfFlyPair.add(new FlyPair(fly1, fly2));
                }
            }
        }
        return resultListOfFlyPair;
    }
}

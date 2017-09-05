package com.kodilla.good.patterns.loty;

import java.util.List;
import java.util.stream.Collectors;

public class FindingFly {

    public List<Fly> findingFlyFromCity(String cityFrom) {

        FulListOfFly fullListOfFly = new FulListOfFly();
        List<Fly> resultListOfFly;
        resultListOfFly = fullListOfFly.getList().stream()
                                            .filter(fly -> fly.getFlyFrom().equals(cityFrom))
                                           .collect(Collectors.toList());
        return resultListOfFly;
    }


    public List<Fly> findingFlyToCity(String cityTo) {

        FulListOfFly fullListOfFly = new FulListOfFly();
        List<Fly> resultListOfFly;
        resultListOfFly = fullListOfFly.getList().stream()
                .filter(fly -> fly.getFlyTo().equals(cityTo))
                .collect(Collectors.toList());
        return resultListOfFly;
    }



}

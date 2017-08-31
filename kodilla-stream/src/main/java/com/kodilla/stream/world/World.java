package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.List;

public final class World {

    private List<Continent> continentsCollection;

    public BigDecimal getPeopleQuantity() {
        BigDecimal totalPeople = continentsCollection.stream()
                .flatMap(continent -> continent.getCountriesList().stream())
                .map(Country :: getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
        return totalPeople;
    }
}

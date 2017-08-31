package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.List;

public final class World {

    public List<Continent> getContinentsCollection() {
        return continentsCollection;
    }

    public void setContinentsCollection(List<Continent> continentsCollection) {
        this.continentsCollection = continentsCollection;
    }

    private List<Continent> continentsCollection;

    public BigDecimal getPeopleQuantity() {
        BigDecimal totalPeople = continentsCollection.stream()
                .flatMap(continent -> continent.getCountriesList().stream())
                .map(country -> country.getPeopleQuantity())
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
        return totalPeople;
    }
}

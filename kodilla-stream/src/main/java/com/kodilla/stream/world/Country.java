package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country {
    private BigDecimal population;

    public Country(BigDecimal population) {
        this.population = population;
    }

    public BigDecimal getPeopleQuantity() {
        return population;
    }

    @Override
    public String toString() {
        return "Country(population=" + population + ")";
    }
}

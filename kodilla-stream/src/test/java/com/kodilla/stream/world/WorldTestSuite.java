package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        List<Country> countries = new ArrayList<>();
        List<Continent> continents = new ArrayList<>();
        World world = new World();

        Country Polska = new Country(new BigDecimal("39111222"));
        Country Slowacja = new Country(new BigDecimal("12111222"));
        Country Chorwacja = new Country(new BigDecimal("18111222"));
        Country USA = new Country(new BigDecimal("239111222"));
        Country Kanada = new Country(new BigDecimal("112111222"));
        Country Meksyk = new Country(new BigDecimal("78111222"));
        Country Kamerun = new Country(new BigDecimal("139111222"));
        Country Egipt = new Country(new BigDecimal("72111222"));
        Country Kenia = new Country(new BigDecimal("28111222"));

        Continent Europa = new Continent();
        Continent America = new Continent();
        Continent Africa = new Continent();
        continents.add(Europa);
        continents.add(America);
        continents.add(Africa);

        world.setContinentsCollection(continents);

        Europa.addCountries(Polska);
        Europa.addCountries(Slowacja);
        Europa.addCountries(Chorwacja);
        America.addCountries(USA);
        America.addCountries(Kanada);
        America.addCountries(Meksyk);
        Africa.addCountries(Kamerun);
        Africa.addCountries(Egipt);
        Africa.addCountries(Kenia);

        //When
        BigDecimal totalPeople = world.getPeopleQuantity();

        //Then
        BigDecimal expectedPeople = new BigDecimal("738000998");
        Assert.assertEquals(expectedPeople, totalPeople);
    }
}

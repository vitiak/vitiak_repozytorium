package com.kodilla.stream.world;

import java.util.ArrayList;

public class Continent {
    ArrayList<Country> countriesList = new ArrayList<>();

    public void addCountries(Country country) {
        countriesList.add(country);
    }

    public ArrayList<Country> getCountriesList() {
        return /*new*/ countriesList;
    }

}
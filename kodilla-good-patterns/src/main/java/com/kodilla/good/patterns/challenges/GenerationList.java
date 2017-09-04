package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;

public class GenerationList {
    public ArrayList<String> newList() {
        ArrayList<String> warehouse = new ArrayList<>();

        warehouse.add("Kapcie");
        warehouse.add("Buty");
        warehouse.add("Piżama");
        warehouse.add("Koszulka");
        warehouse.add("Spodnie");
        warehouse.add("Skarpety");
        warehouse.add("Kurtka");

        return warehouse;
    }
}

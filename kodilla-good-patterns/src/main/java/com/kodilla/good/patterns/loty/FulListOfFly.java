package com.kodilla.good.patterns.loty;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class FulListOfFly {
    ArrayList<Fly> listOfFly = new ArrayList<>();
        public FulListOfFly() {
            listOfFly.add(new Fly("Warszawa", "Split", LocalTime.of(6, 30)));
            listOfFly.add(new Fly("Warszawa", "Lizbona", LocalTime.of(7, 30)));
            listOfFly.add(new Fly("Lizbona", "Madryt", LocalTime.of(9, 30)));
            listOfFly.add(new Fly("Lizbona", "Madryt", LocalTime.of(9, 30)));
            listOfFly.add(new Fly("Warszawa", "Rzym", LocalTime.of(10, 30)));
            listOfFly.add(new Fly("Warszawa", "Londyn", LocalTime.of(11, 30)));
            listOfFly.add(new Fly("Warszawa", "Londyn", LocalTime.of(12, 30)));
            listOfFly.add(new Fly("Warszawa", "Split", LocalTime.of(13, 30)));
            listOfFly.add(new Fly("Lizbona", "Split", LocalTime.of(14, 30)));
            listOfFly.add(new Fly("Warszawa", "Split", LocalTime.of(15, 30)));
        }

        public List<Fly> getList() {
            return new ArrayList<>(listOfFly);
        }
}


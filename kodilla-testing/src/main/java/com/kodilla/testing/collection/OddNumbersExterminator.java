package com.kodilla.testing.collection;

import javafx.util.converter.NumberStringConverter;

import java.util.ArrayList;

class OddNumbersExterminator {
    ArrayList<Integer> listaParzystych = new ArrayList<Integer>();

     public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        for (Integer singleNumber: numbers) {
            if (((singleNumber) % 2) == 0) {
                lista.add((singleNumber));
            }
        }
        return lista;
    }

}

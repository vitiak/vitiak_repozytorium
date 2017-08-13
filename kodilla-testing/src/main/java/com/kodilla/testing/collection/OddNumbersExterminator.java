package com.kodilla.testing.collection;

import javafx.util.converter.NumberStringConverter;

import java.util.ArrayList;

class OddNumbersExterminator {
    ArrayList<Integer> listaParzystych = new ArrayList<Integer>();

    public OddNumbersExterminator() {
       OddNumbersExterminator exterminate = new OddNumbersExterminator() ;
    }

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        int n=0;
//        for(n=0;n<numbers.size();n++) {
//            if ((numbers.get(n) % 2) == 0) {
//                lista.add(numbers.get(n));
//
//        }
        for (Integer listaParz: numbers) {
            if ((numbers.get(n) % 2) == 0) {
                lista.add(numbers.get(n));
            }
        }
        return lista;
    }

}

package com.kodilla.testing.collection;

import javafx.util.converter.NumberStringConverter;

import java.util.ArrayList;

class OddNumbersExterminator {
    ArrayList<Integer> listaParzystych = new ArrayList<Integer>();

     public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        for (Integer listaParz: numbers) {
            if ((/*numbers.get*/(listaParz) % 2) == 0) {
                lista.add(/*numbers.get*/(listaParz));
            }
        }
        return lista;
    }

    public ArrayList<Integer> createArrayList5El(int int1, int int2, int int3, int int4, int int5) {
        ArrayList<Integer> lista5El = new ArrayList<Integer>();
        lista5El.add(int1);
        lista5El.add(int2);
        lista5El.add(int3);
        lista5El.add(int4);
        lista5El.add(int5);
        return lista5El;
    }


    public ArrayList<Integer> createArrayList2El(int int1, int int2) {
        ArrayList<Integer> lista2El = new ArrayList<Integer>();
        lista2El.add(int1);
        lista2El.add(int2);
        return lista2El;
    }}

package com.kodilla.testing.collection;

import javafx.util.converter.NumberStringConverter;

import java.util.ArrayList;

class OddNumbersExterminator {
    ArrayList<Integer> listaParzystych = new ArrayList<Integer>();

 //   public OddNumbersExterminator() {
 //      OddNumbersExterminator exterminate = new OddNumbersExterminator() ;
 //   }

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
//        int n=0;
//        for(n=0;n<numbers.size();n++) {
//            if ((numbers.get(n) % 2) == 0) {
//                lista.add(numbers.get(n));
//
//        }
        for (Integer listaParz: numbers) {
            if ((numbers.get(listaParz) % 2) == 0) {
                lista.add(numbers.get(listaParz));
            }
        }
        return lista;
    }

    public ArrayList<Integer> createArrayList5El(int int1, int int2, int int3, int int4, int int5) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(int1);
        lista.add(int2);
        lista.add(int3);
        lista.add(int4);
        lista.add(int5);
        return lista;
    }


    public ArrayList<Integer> createArrayList2El(int int1, int int2) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(int1);
        lista.add(int2);
        return lista;
    }}

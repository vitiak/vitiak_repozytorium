package com.codilla;

import java.util.*;
import java.lang.*;
import java.io.*;

class SimpleCalculator
{
    public int addAToB(int a, int b) {
        return a + b;
    }

    public int substractAFromB(int a, int b) {
        return a - b;
    }
}

class Test1Class
{
    public static void main(String[] args) {

        SimpleCalculator simpleCalculator = new SimpleCalculator();

        int result = simpleCalculator.addAToB(5, 5);

        System.out.println(result);

    }
}

package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;

public class StreamMain {

    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        System.out.println("Start");

        String beautifulText = " this is beautiful text ";
        poemBeautifier.creatorBeautifier(beautifulText, "normal text?",(a, b) -> a + b + a);

        beautifulText = " absolutely wonderful ";
        poemBeautifier.creatorBeautifier(beautifulText, "normal text?",(a, b) -> a + b.toUpperCase() + a.toUpperCase());

        beautifulText = " :-) ";
        poemBeautifier.creatorBeautifier(beautifulText, "normal text?",(a, b) -> a + b + a);

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);

    }
}
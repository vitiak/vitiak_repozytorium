package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void creatorBeautifier(String a, String b, PoemDecorator poemDecorator) {
        String result = poemDecorator.decorator(a, b);
        System.out.println("Beautiful result equals: " + result);
    }

}

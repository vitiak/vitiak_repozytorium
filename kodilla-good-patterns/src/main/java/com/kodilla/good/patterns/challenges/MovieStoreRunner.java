package com.kodilla.good.patterns.challenges;

import java.util.stream.Collectors;
import java.util.Map;

public class MovieStoreRunner {
    public static void main(String[] args) {
        MovieStore movies = new MovieStore();

        String theResult = movies.getMovies().entrySet().stream()
                .flatMap(entry -> entry.getValue().stream())
                .collect(Collectors.joining(" ! ", "Lista tytulow: ", "."));
        System.out.println(theResult);
    }
}

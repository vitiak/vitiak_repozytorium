package com.kodilla.good.patterns.loty;

import java.time.LocalTime;

public class Fly {
    private String flyFrom;
    private String flyTo;
    private LocalTime startFly;

    public Fly(String flyFrom, String flyTo, LocalTime startFly) {
        this.flyFrom = flyFrom;
        this.flyTo = flyTo;
        this.startFly = startFly;
    }

    public String getFlyFrom() {
        return flyFrom;
    }

    public String getFlyTo() {
        return flyTo;
    }

    public LocalTime getStartFly() {
        return startFly;
    }

}

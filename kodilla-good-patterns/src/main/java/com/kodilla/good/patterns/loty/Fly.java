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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Fly)) return false;

        Fly fly = (Fly) o;

        if (getFlyFrom() != null ? !getFlyFrom().equals(fly.getFlyFrom()) : fly.getFlyFrom() != null) return false;
        if (getFlyTo() != null ? !getFlyTo().equals(fly.getFlyTo()) : fly.getFlyTo() != null) return false;
        return getStartFly() != null ? getStartFly().equals(fly.getStartFly()) : fly.getStartFly() == null;
    }

    @Override
    public int hashCode() {
        int result = getFlyFrom() != null ? getFlyFrom().hashCode() : 0;
        result = 31 * result + (getFlyTo() != null ? getFlyTo().hashCode() : 0);
        result = 31 * result + (getStartFly() != null ? getStartFly().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Fly{" +
                "flyFrom='" + flyFrom + '\'' +
                ", flyTo='" + flyTo + '\'' +
                ", startFly=" + startFly +
                '}';
    }
}

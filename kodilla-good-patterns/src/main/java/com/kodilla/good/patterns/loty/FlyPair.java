package com.kodilla.good.patterns.loty;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class FlyPair {
    public Fly fly1;
    public Fly fly2;

    public FlyPair(Fly fly1, Fly fly2) {
        this.fly1 = fly1;
        this.fly2 = fly2;
    }

    public Fly getFly1() { return fly1; }

    public Fly getFly2() {
        return fly2;
    }

     @Override
    public String toString() {
        return "FlyPair{" +
                "fly1=" + fly1 +
                ", fly2=" + fly2 +
                '}';
    }
}

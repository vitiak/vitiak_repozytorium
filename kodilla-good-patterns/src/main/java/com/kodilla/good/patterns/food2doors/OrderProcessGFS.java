package com.kodilla.good.patterns.food2doors;

public class OrderProcessGFS implements OrderProcess {

    public void inform() {
        String communicationText = "To jest kontraktem notarialnym zgłoszenie zamowienia ";
        System.out.println(communicationText);
    }

    public void process() {
        String realizationText = "To jest realizacja zaopatrzenia Pocztą Polską";
        System.out.println(realizationText);
    }
}

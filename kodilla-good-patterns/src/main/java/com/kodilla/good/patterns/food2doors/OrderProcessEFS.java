package com.kodilla.good.patterns.food2doors;

public class OrderProcessEFS implements OrderProcess {

    public void inform() {
        String communicationText = "To jest telefoniczne zgłoszenie zamowienia";
        System.out.println(communicationText);
    }

    public void process() {
        String realizationText = "To jest realizacja zaopatrzenia wlasnym transportem po potwierdzeniu telefonicznym";
        System.out.println(realizationText);
    }
}

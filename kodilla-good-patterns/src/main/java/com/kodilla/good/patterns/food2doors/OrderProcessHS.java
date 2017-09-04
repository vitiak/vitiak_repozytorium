package com.kodilla.good.patterns.food2doors;

public class OrderProcessHS implements OrderProcess {

        public void inform() {
            String communicationText = "To jest potwierdzone mailem zgłoszenie zamowienia ";
            System.out.println(communicationText);
        }

        public void process() {
            String realizationText = "To jest realizacja zaopatrzenia wlasnym transportem po potwierdzeniu mailowym";
            System.out.println(realizationText);
        }

}

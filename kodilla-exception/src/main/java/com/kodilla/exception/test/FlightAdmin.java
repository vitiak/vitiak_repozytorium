package com.kodilla.exception.test;

public class FlightAdmin {
    public static void main(String[] args) throws Exception {
//        String arrivalAirport = "Poznan";
//        String arrivalAirport = "Porto";
        String arrivalAirport = "Split";
        Flight flightExample = new Flight("Warszawa", arrivalAirport);
        Boolean result = null;

        try {
            result = flightExample.findFlight(flightExample);
        } catch (RouteNotFoundException e) {

        }
    }
}

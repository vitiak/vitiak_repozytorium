package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class Flight {
    private String departureAirport;
    private String arrivalAirport;

    public Flight(String departureAirport, String arrivalAirport) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public Boolean findFlight(Flight flight) throws RouteNotFoundException {
        Boolean existsFlight = null;
        HashMap<String, Boolean> mapaLotow = new HashMap<>();
        mapaLotow.put("Poznan", true);
        mapaLotow.put("Krakow", true);
        mapaLotow.put("Dubrownik", false);
        mapaLotow.put("Lizbona", false);
        mapaLotow.put("Porto", false);

        for(Map.Entry<String,Boolean> entry :mapaLotow.entrySet()) {
            if (entry.getKey() == flight.getArrivalAirport())  {
                existsFlight = entry.getValue();
            }
        }
        if (existsFlight != null) {
            System.out.println("Czy lotnisko jest dostepne? " + existsFlight);
            return existsFlight;
        }
        throw new RouteNotFoundException("Ni ma takigo lotniska");
    }

}

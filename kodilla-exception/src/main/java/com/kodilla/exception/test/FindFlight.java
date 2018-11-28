package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FindFlight {


    public Map<String, Boolean> findFlight(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> airports = new HashMap<>();
        airports.put("New York", false);
        airports.put("Amsterdam", true);
        airports.put("Warsaw", true);
        airports.put("London", true);
        airports.put("Berlin", true);


        boolean ifCityArrivalISInMaP = airports.containsKey(flight.getArrivalAirport());
        boolean ifCityDepartureIsInMaP = airports.containsKey(flight.getDepartureAirport());


        if (ifCityArrivalISInMaP != true) {
            throw new RouteNotFoundException("nie ma w mapie lotniska " + flight.getArrivalAirport() + " do przylotu");
        } else {
            boolean possibilityOfLanding = airports.get(flight.getArrivalAirport()).booleanValue();
            if (possibilityOfLanding == false) {
                throw new RouteNotFoundException("nie można wylądować na " + flight.getArrivalAirport() + ". Atak terorystyczny");
            }
        }

        if (ifCityDepartureIsInMaP != true) {
            throw new RouteNotFoundException("Nie ma w mapie lotniska " + flight.getDepartureAirport() + " do odjazu ");
        } else {
            boolean possibilityOfTakesOff = airports.get(flight.getDepartureAirport()).booleanValue();
            if (possibilityOfTakesOff == false) {
                throw new RouteNotFoundException("nie można wylecieć  z " + flight.getDepartureAirport() + ". Atak terorystyczny");
            }
        }

        return airports;

    }
}

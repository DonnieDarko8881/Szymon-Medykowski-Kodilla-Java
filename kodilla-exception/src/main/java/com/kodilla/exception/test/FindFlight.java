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
            throw new RouteNotFoundException(flight.getArrivalAirport() + " is not found in the Map of the airport to arrival");
        } else {
            boolean possibilityOfLanding = airports.get(flight.getArrivalAirport()).booleanValue();
            if (possibilityOfLanding == false) {
                throw new RouteNotFoundException("it is not allowed to land in " + flight.getArrivalAirport() + ". Terrorist Attack!");
            }
        }

        if (ifCityDepartureIsInMaP != true) {
            throw new RouteNotFoundException(flight.getDepartureAirport() + " is not found in the Map of the airport to departure");
        } else {
            boolean possibilityOfTakesOff = airports.get(flight.getDepartureAirport()).booleanValue();
            if (possibilityOfTakesOff == false) {
                throw new RouteNotFoundException("it is not allowet to take off from " + flight.getDepartureAirport() + ". Terrosist Attack!");
            }
        }

        return airports;

    }
}

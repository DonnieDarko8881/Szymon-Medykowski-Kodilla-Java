package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FindFlight{

    private final Map<String, Boolean> airportAvailability;

    public FindFlight(Map<String, Boolean> airportsAvailability) {
        this.airportAvailability = airportsAvailability;
    }


    public void checkIfArrivalIsPossible(Flight flight) throws RouteNotFoundException {

        if (airportAvailability.get(flight.getArrivalAirport()) == null) {
            throw new RouteNotFoundException(flight.getArrivalAirport() + " is not found in the Map of the airport to arrival");
        } else {
            boolean possibilityOfLanding = airportAvailability.get(flight.getArrivalAirport()).booleanValue();
            if (possibilityOfLanding == false) {
                throw new RouteNotFoundException("it is not allow to land in " + flight.getArrivalAirport() + ". Terrorist Attack!");
            }
        }

    }

    public void checkIfDepartureIsPossible(Flight flight) throws RouteNotFoundException {

        if (airportAvailability.get(flight.getDepartureAirport()) == null) {
            throw new RouteNotFoundException(flight.getDepartureAirport() + " is not found in the Map of the airport to departure");
        } else {
            boolean possibilityOfTakesOff = airportAvailability.get(flight.getDepartureAirport()).booleanValue();
            if (possibilityOfTakesOff == false) {
                throw new RouteNotFoundException("it is not allow to take off from " + flight.getDepartureAirport() + ". Terrosist Attack!");
            }
        }
    }
}

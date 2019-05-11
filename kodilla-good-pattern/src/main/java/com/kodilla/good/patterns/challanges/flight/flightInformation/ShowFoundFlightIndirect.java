package com.kodilla.good.patterns.challanges.flight.flightInformation;

import com.kodilla.good.patterns.challanges.flight.flightRetriever.Flight;

import java.util.Map;

public class ShowFoundFlightIndirect {

    public void showFlightWithInderect(Map<Flight, Flight> flightIndirect) {
        flightIndirect.entrySet().stream().forEach(
                city -> {
                    System.out.println("Flight From " + city.getKey().getCityOfDeparture() + " to "
                            + city.getValue().getCityOfArrival() + " through " +
                            city.getKey().getCityOfArrival());
                }
        );
    }
}

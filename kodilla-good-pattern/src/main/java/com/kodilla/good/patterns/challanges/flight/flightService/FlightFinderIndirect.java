package com.kodilla.good.patterns.challanges.flight.flightService;

import com.kodilla.good.patterns.challanges.flight.flightRetriever.City;
import com.kodilla.good.patterns.challanges.flight.flightRetriever.Flight;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FlightFinderIndirect {
    private FlightFinder flightFinderFromCity;
    private FlightFinder flightFinderToCity;

    public FlightFinderIndirect() {
        this.flightFinderFromCity = new FlightFinderFromCity();
        this.flightFinderToCity = new FlightFinderToCity();
    }

    public Map<Flight, Flight> findWithIndirect(Set<Flight> flights, City cityOfDeparture, City cityOfArrival) {
        Set<Flight> fromCity = flightFinderFromCity.find(flights, cityOfDeparture);
        Set<Flight> toCity = flightFinderToCity.find(flights, cityOfArrival);
        Map<Flight, Flight> fromToIndirect = new HashMap<>();

        for (Flight from : fromCity) {
            for (Flight to : toCity) {
                if (from.getCityOfArrival().equals(to.getCityOfDeparture())) {
                    fromToIndirect.put(from,to);
                }
            }
        }
        return fromToIndirect;
    }
}

package com.kodilla.good.patterns.challanges.flight;

import com.kodilla.good.patterns.challanges.flight.flightInformation.ShowFoundFlight;
import com.kodilla.good.patterns.challanges.flight.flightRetriever.City;
import com.kodilla.good.patterns.challanges.flight.flightRetriever.Flight;
import com.kodilla.good.patterns.challanges.flight.flightService.FlightFinder;

import java.util.Set;

public class FlightFinderDirectProcessor {
    private FlightFinder flightFinder;
    private ShowFoundFlight showFoundFlight;

    public FlightFinderDirectProcessor(FlightFinder flightFinder, ShowFoundFlight showFoundFlight) {
        this.flightFinder = flightFinder;
        this.showFoundFlight = showFoundFlight;
    }

    public Set<Flight> processor(Set<Flight> flights, City city) {
        Set<Flight> foundCity = flightFinder.find(flights,city);
        showFoundFlight.show(foundCity);
        return foundCity;
    }

}
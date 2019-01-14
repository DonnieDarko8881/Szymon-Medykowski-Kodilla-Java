package com.kodilla.good.patterns.challanges.Flights;

import com.kodilla.good.patterns.challanges.Flights.flightInformation.ShowFoundFlight;
import com.kodilla.good.patterns.challanges.Flights.flightRetriever.City;
import com.kodilla.good.patterns.challanges.Flights.flightRetriever.Flight;
import com.kodilla.good.patterns.challanges.Flights.flightService.FlightFinder;

import java.util.Set;

public class FlightFinderProcessor {
    private FlightFinder flightFinder;
    private ShowFoundFlight showFoundFlight;

    public FlightFinderProcessor(FlightFinder flightFinder, ShowFoundFlight showFoundFlight) {
        this.flightFinder = flightFinder;
        this.showFoundFlight = showFoundFlight;
    }

    public Set<Flight> processor(Set<Flight> flights,City city) {
        Set<Flight> foundCity = flightFinder.find(flights,city);
        showFoundFlight.show(foundCity);
        return foundCity;
    }
}

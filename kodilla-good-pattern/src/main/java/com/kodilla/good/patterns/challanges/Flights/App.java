package com.kodilla.good.patterns.challanges.Flights;

import com.kodilla.good.patterns.challanges.Flights.flightInformation.ShowFoundFlightFromCity;
import com.kodilla.good.patterns.challanges.Flights.flightRetriever.Flight;
import com.kodilla.good.patterns.challanges.Flights.flightRetriever.FlightRetriever;
import com.kodilla.good.patterns.challanges.Flights.flightService.FlightFinderFromCity;
import java.util.Set;
import static com.kodilla.good.patterns.challanges.Flights.flightRetriever.City.*;

public class App {
    public static void main(String[] args) {
        FlightRetriever flightRetriever = new FlightRetriever();
        Set<Flight> flights = flightRetriever.retrieve();

        FlightFinderProcessor flightFinderProcessor = new FlightFinderProcessor(new FlightFinderFromCity(),
                new ShowFoundFlightFromCity());
        flightFinderProcessor.processor(flights, WARSZAWA);
    }
}

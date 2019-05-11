package com.kodilla.good.patterns.challanges.flight;

import com.kodilla.good.patterns.challanges.flight.flightInformation.ShowFoundFlightFromCity;
import com.kodilla.good.patterns.challanges.flight.flightInformation.ShowFoundFlightIndirect;
import com.kodilla.good.patterns.challanges.flight.flightInformation.ShowFoundFlightToCity;
import com.kodilla.good.patterns.challanges.flight.flightRetriever.Flight;
import com.kodilla.good.patterns.challanges.flight.flightRetriever.FlightRetriever;
import com.kodilla.good.patterns.challanges.flight.flightService.FlightFinder;
import com.kodilla.good.patterns.challanges.flight.flightService.FlightFinderFromCity;
import com.kodilla.good.patterns.challanges.flight.flightService.FlightFinderIndirect;
import com.kodilla.good.patterns.challanges.flight.flightService.FlightFinderToCity;

import java.util.Map;
import java.util.Set;

import static com.kodilla.good.patterns.challanges.flight.flightRetriever.City.WARSZAWA;
import static com.kodilla.good.patterns.challanges.flight.flightRetriever.City.WROCŁAW;

public class App {
    public static void main(String[] args) {
        FlightRetriever flightRetriever = new FlightRetriever();
        Set<Flight> flights = flightRetriever.retrieve();

        FlightFinderDirectProcessor flightFinderFromProcessor = new FlightFinderDirectProcessor( new FlightFinderFromCity(),
                new ShowFoundFlightFromCity());
        flightFinderFromProcessor.processor(flights, WARSZAWA);

        FlightFinderDirectProcessor flightFinderToProcessor = new FlightFinderDirectProcessor( new FlightFinderToCity(),
                new ShowFoundFlightToCity());
        flightFinderToProcessor.processor(flights, WROCŁAW);

        FlightFinderIndirectProcessor flightFinderIndirectProcessor = new FlightFinderIndirectProcessor();
        flightFinderIndirectProcessor.process(flights,WARSZAWA, WROCŁAW);
    }
}

package com.kodilla.good.patterns.challanges.flight;

import com.kodilla.good.patterns.challanges.flight.flightInformation.ShowFoundFlightIndirect;
import com.kodilla.good.patterns.challanges.flight.flightRetriever.City;
import com.kodilla.good.patterns.challanges.flight.flightRetriever.Flight;
import com.kodilla.good.patterns.challanges.flight.flightService.FlightFinderIndirect;

import java.util.Map;
import java.util.Set;

public class FlightFinderIndirectProcessor {
    FlightFinderIndirect flightFinderIndirect;
    ShowFoundFlightIndirect showFoundFlightIndirect;

    public FlightFinderIndirectProcessor() {
        this.flightFinderIndirect = new FlightFinderIndirect();
        this.showFoundFlightIndirect = new ShowFoundFlightIndirect();
    }

    public Map<Flight, Flight> process(Set<Flight> flights, City cityOfDeparture, City cityOfArrival) {
        Map<Flight, Flight> flightsIndirect = flightFinderIndirect.findWithIndirect(flights,
                cityOfDeparture, cityOfArrival);
        showFoundFlightIndirect.showFlightWithInderect(flightsIndirect);
        return flightsIndirect;
    }
}

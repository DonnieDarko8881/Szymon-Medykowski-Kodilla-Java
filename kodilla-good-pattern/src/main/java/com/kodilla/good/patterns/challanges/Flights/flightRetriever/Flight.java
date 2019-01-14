package com.kodilla.good.patterns.challanges.Flights.flightRetriever;

import java.time.LocalTime;
import java.util.Objects;

public final class Flight {
    private final City cityOfDeparture;
    private final City cityOfArrival;
    private final LocalTime timeOfDeparture;
    private final LocalTime timeOfArrival;


    public Flight(City cityOfDeparture, City cityOfArrival, LocalTime timeOfDeparture, LocalTime timeOfArrival) {
        this.cityOfDeparture = cityOfDeparture;
        this.cityOfArrival = cityOfArrival;
        this.timeOfDeparture = timeOfDeparture;
        this.timeOfArrival = timeOfArrival;
    }

    public City getCityOfDeparture() {
        return cityOfDeparture;
    }

    public City getCityOfArrival() {
        return cityOfArrival;
    }

    public LocalTime getTimeOfDeparture() {
        return timeOfDeparture;
    }

    public LocalTime getTimeOfArrival() {
        return timeOfArrival;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return cityOfDeparture == flight.cityOfDeparture &&
                cityOfArrival == flight.cityOfArrival &&
                Objects.equals(timeOfDeparture, flight.timeOfDeparture) &&
                Objects.equals(timeOfArrival, flight.timeOfArrival);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cityOfDeparture, cityOfArrival, timeOfDeparture, timeOfArrival);
    }

    @Override
    public String toString() {
        return "Flight{" +
                "cityOfDeparture=" + cityOfDeparture +
                ", cityOfArrival=" + cityOfArrival +
                ", timeOfDeparture=" + timeOfDeparture +
                ", timeOfArrival=" + timeOfArrival +
                '}';
    }
}

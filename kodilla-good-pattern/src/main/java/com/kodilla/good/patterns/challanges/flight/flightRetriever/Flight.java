package com.kodilla.good.patterns.challanges.flight.flightRetriever;

import java.time.LocalTime;
import java.util.Objects;

public final class Flight {
    private final City cityOfDeparture;
    private final City cityOfArrival;


    public Flight(City cityOfDeparture, City cityOfArrival) {
        this.cityOfDeparture = cityOfDeparture;
        this.cityOfArrival = cityOfArrival;
    }

    public City getCityOfDeparture() {
        return cityOfDeparture;
    }

    public City getCityOfArrival() {
        return cityOfArrival;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return cityOfDeparture == flight.cityOfDeparture &&
                cityOfArrival == flight.cityOfArrival;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cityOfDeparture, cityOfArrival);
    }

    @Override
    public String toString() {
        return "Flight{" +
                "cityOfDeparture=" + cityOfDeparture +
                ", cityOfArrival=" + cityOfArrival +
                '}';
    }
}

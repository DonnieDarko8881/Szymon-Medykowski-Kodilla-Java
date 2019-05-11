package com.kodilla.good.patterns.challanges.flight;

import com.kodilla.good.patterns.challanges.flight.flightInformation.ShowFoundFlightFromCity;
import com.kodilla.good.patterns.challanges.flight.flightInformation.ShowFoundFlightToCity;
import com.kodilla.good.patterns.challanges.flight.flightRetriever.Flight;
import com.kodilla.good.patterns.challanges.flight.flightRetriever.FlightRetriever;
import com.kodilla.good.patterns.challanges.flight.flightService.FlightFinderFromCity;
import com.kodilla.good.patterns.challanges.flight.flightService.FlightFinderToCity;
import org.junit.*;

import java.util.Map;
import java.util.Set;

import static com.kodilla.good.patterns.challanges.flight.flightRetriever.City.POZNAN;
import static com.kodilla.good.patterns.challanges.flight.flightRetriever.City.WARSZAWA;
import static com.kodilla.good.patterns.challanges.flight.flightRetriever.City.WROCŁAW;


public class FlightTestSuit {
    private static int testCounter;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test
    public void Find2FlightFromWarsaw() {
        FlightRetriever flightRetriever = new FlightRetriever();
        Set<Flight> flights = flightRetriever.retrieve();

        //When
        FlightFinderDirectProcessor flightFinderProcessor = new FlightFinderDirectProcessor(new FlightFinderFromCity(),
                new ShowFoundFlightFromCity());
        Set<Flight> result = flightFinderProcessor.processor(flights, WARSZAWA);
        int expected = 2;

        //Then
        Assert.assertEquals(expected, result.size());
    }

    @Test
    public void Find1FlightToPoznan() {
        //Given
        FlightRetriever flightRetriever = new FlightRetriever();
        Set<Flight> flights = flightRetriever.retrieve();

        //When
        FlightFinderDirectProcessor flightFinderProcessor = new FlightFinderDirectProcessor(new FlightFinderToCity(),
                new ShowFoundFlightToCity());
        Set<Flight> result = flightFinderProcessor.processor(flights, POZNAN);
        int expected = 1;

        //Then
        Assert.assertEquals(expected, result.size());
    }

    @Test
    public void find2IndirectFlightFromWarsawToWroclaw(){
        //Given
        FlightRetriever flightRetriever = new FlightRetriever();
        Set<Flight> flights = flightRetriever.retrieve();

        //When
        FlightFinderIndirectProcessor flightFinderIndirectProcessor = new FlightFinderIndirectProcessor();
        Map<Flight, Flight> result = flightFinderIndirectProcessor.process(flights, WARSZAWA, WROCŁAW);
        int expected = 2;

        //Then
        Assert.assertEquals(expected, result.size());
    }
}
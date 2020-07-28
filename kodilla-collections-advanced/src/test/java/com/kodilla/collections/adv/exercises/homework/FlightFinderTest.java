package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FlightFinderTest {

    @Test
    public void x() {


        FlightFinder flight = new FlightFinder();
        List<Flight> result = flight.findFlightsFrom("Warsaw");

        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Warsaw", "Madrid"));
        expectedList.add(new Flight("Warsaw", "Berlin"));

        assertEquals(expectedList, result);

    }

    @Test
    public void testWithBadArguments_From() {
        FlightFinder flight = new FlightFinder();
        List<Flight> result = flight.findFlightsFrom("Chicago");

        assertEquals(0, result.size());

    }

    @Test
    public void testFlightTo() {
        FlightFinder flight = new FlightFinder();
        List<Flight> result = flight.findFlightsTo("Madrid");

        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("London", "Madrid"));
        expectedList.add(new Flight("Berlin", "Madrid"));
        expectedList.add(new Flight("Warsaw", "Madrid"));

        assertEquals(expectedList, result);

    }

    @Test
    public void testWithBadArguments_To() {
        FlightFinder flight = new FlightFinder();
        List<Flight> result = flight.findFlightsTo("Chicago");

        assertEquals(0, result.size());

    }
}
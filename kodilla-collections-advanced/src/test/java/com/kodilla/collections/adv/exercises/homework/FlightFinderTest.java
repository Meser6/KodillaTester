package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FlightFinderTest {

    @Test
    public void testFlightFrom() {
/*
        List<Flight> flights = FlightRepository.getFlightsTable();
        flights.add(new Flight("XXX", "YYY"));
        flights.add(new Flight("XXX", "ZZZ"));
        flights.add(new Flight("AAA", "XXX"));
        flights.add(new Flight("YYY", "ZZZ"));

        FlightFinder flight = new FlightFinder();
        List<Flight> result = flight.findFlightsFrom("XXX");

        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("XXX", "YYY"));
        expectedList.add(new Flight("XXX", "ZZZ"));
        assertEquals(expectedList, result);

        Chciałem dodać własne, nowe przypadki tylko na czas testu. z tego co widziałem dodało je, ale wyszukuje się tylko
        po tej starej liscie. jak się dostać do nowej, z tymi przypadkami?
 */

        FlightFinder flight = new FlightFinder();
        List<Flight> result = flight.findFlightsFrom("Warsaw");

        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Warsaw", "Madrid"));
        expectedList.add(new Flight("Warsaw", "Berlin"));

        assertEquals(expectedList, result);

    }

    @Test
    public void testWithBadArguments_From(){
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
    public void testWithBadArguments_To(){
        FlightFinder flight = new FlightFinder();
        List<Flight> result = flight.findFlightsTo("Chicago");

        assertEquals(0, result.size());

    }
}
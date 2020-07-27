package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightFinder {
    List<Flight> flightList = FlightRepository.getFlightsTable();

    public List<Flight> findFlightsFrom(String departure) {
        List<Flight> flightsFrom = new ArrayList<>();
        for (Flight flight : flightList) {
            if (flight.getDeparture().equals(departure)) {
                flightsFrom.add(flight);
            }
        }
        return flightsFrom;
    }

    public List<Flight> findFlightsTo(String arrival) {
        List<Flight> flightsTo = new ArrayList<>();
        for (Flight flight : flightList) {
            if (flight.getArrival().equals(arrival)) {
                flightsTo.add(flight);
            }
        }
        return flightsTo;
    }
}

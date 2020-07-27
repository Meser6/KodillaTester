package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {

    public static List<Flight> getFlightsTable() {
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("London", "Warsaw"));
        flights.add(new Flight("Wroclaw", "Warsaw"));
        flights.add(new Flight("London", "Madrid"));
        flights.add(new Flight("Berlin", "Madrid"));
        flights.add(new Flight("Madrid", "London"));
        flights.add(new Flight("London", "Wroclaw"));
        flights.add(new Flight("Warsaw", "Madrid"));
        flights.add(new Flight("Warsaw", "Berlin"));
        return flights;
    }
}

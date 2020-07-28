package com.kodilla.stream;

import com.kodilla.exception.AirportNotFoundException;
import com.kodilla.exception.AirportRepository;

public class ThirdExample {
    public static void main(String[] args) {
        AirportRepository airportRepository = new AirportRepository();
        boolean isViennaInUse = false;
        try {
            isViennaInUse = airportRepository.isAirportInUse("Vienna");
            System.out.println("Vienna status " + isViennaInUse);
        } catch (AirportNotFoundException e) {
            System.out.println("Sorry, this airport cannot be served by out airlines");
        } finally {
            System.out.println("Thank you for using Kodilla Airlines");
        }
    }
}

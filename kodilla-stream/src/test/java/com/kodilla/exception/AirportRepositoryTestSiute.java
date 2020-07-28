package com.kodilla.exception;


import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class AirportRepositoryTestSuite {

    @Test
    public void testIsAirportInUse() throws AirportNotFoundException {
        AirportRepository airportRepository = new AirportRepository();
        boolean isWarsawInUse = airportRepository.isAirportInUse("Warsaw");
        assertTrue(isWarsawInUse);
    }

    @Test(expected = AirportNotFoundException.class)
    public void testIsAirportInUse_withException() throws AirportNotFoundException {
        AirportRepository airportRepository = new AirportRepository();
        boolean isViennaInUse = airportRepository.isAirportInUse("Vienna");
        assertTrue(isViennaInUse);
    }

}
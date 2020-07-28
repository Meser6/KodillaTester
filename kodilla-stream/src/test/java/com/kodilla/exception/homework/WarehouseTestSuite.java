package com.kodilla.exception.homework;

import org.junit.Test;

class WarehouseTestSuite {

    @Test(expected = OrderDoesntExistException.class)
    public void testWrongOrderNumber() throws Exception {
        Warehouse warehouse = new Warehouse();
        warehouse.getOrder("1");
    }
}
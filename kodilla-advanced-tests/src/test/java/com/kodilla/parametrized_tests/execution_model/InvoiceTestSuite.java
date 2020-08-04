package com.kodilla.parametrized_tests.execution_model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class InvoiceTestSuite {

    @Test
    public void sizeIfAddTwoItems() {
        Invoice invoice = new Invoice();
        invoice.addItem(new Item("XXX", 50.5));
        invoice.addItem(new Item("YYY", 49.1));
        Assertions.assertEquals(2, invoice.getSize());
    }

    @ParameterizedTest
    @ValueSource(ints = {-5, 555})
    public void nullIfGetWrongItem(int index) {
        Invoice invoice = new Invoice();
        Assertions.assertNull(invoice.getItem(index));
    }

    @Test
    public void getPriceIfGetGoodIndex() {
        Invoice invoice = new Invoice();
        invoice.addItem(new Item("XXX", 45));
        Assertions.assertEquals(45, invoice.getItem(0).getPrice());
    }

    @Test
    public void getNameIfGetGoodIndex() {
        Invoice invoice = new Invoice();
        invoice.addItem(new Item("XXX", 45));
        Assertions.assertEquals("XXX", invoice.getItem(0).getName());
    }

    @Test
    public void EmptyListIfCleanUp() {
        Invoice invoice = new Invoice();
        invoice.addItem(new Item("XXX", 45));
        invoice.addItem(new Item("ZZZ", 55));
        invoice.clearItem();
        Assertions.assertEquals(0, invoice.getSize());
    }

}

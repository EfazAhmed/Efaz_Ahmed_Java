package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    Customer customer;

    @BeforeEach
    void setUp() {
        customer = new Customer();
        customer.setId(1);
        customer.setName("Test");

        for (int i = 10; i < 100; i += 10) {
            AccountRecord record = new AccountRecord();
            record.setCharge(i);
            record.setChargeDate("01-01-2023");
            customer.addCharge(record);
        }
    }

    @Test
    void getBalance() {
        assertEquals(450, customer.getBalance());
    }

    @Test
    void testToString() {
        String expected = "Customer ID: 1 | Customer Name: Test | Customer Balance: $450";
        assertEquals(expected, customer.toString());
    }
}
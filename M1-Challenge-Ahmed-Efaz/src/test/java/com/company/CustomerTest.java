package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    Customer customer1;
    Customer customer2;
    Customer customer3;
    Customer customer4;


    @BeforeEach
    public void setUp() {
        // Setting up Customer 1
        customer1 = new Customer();
        customer1.setId(1);
        customer1.setName("c1");
        for (int i = 10; i < 100; i += 10) {
            AccountRecord record = new AccountRecord();
            record.setCharge(i);
            record.setChargeDate("01-01-2023");
            customer1.addCharge(record);
        }
        // Setting up Customer 2
        customer2 = new Customer();
        customer2.setId(2);
        customer2.setName("c2");
        for (int i = -1000; i < -300; i += 100) {
            AccountRecord record = new AccountRecord();
            record.setCharge(i);
            record.setChargeDate("01-01-2023");
            customer2.addCharge(record);
        }
        // Setting up Customer 3
        customer3 = new Customer();
        customer3.setId(3);
        customer3.setName("c3");
        for (int i = -1000; i <= 1000; i += 100) {
            AccountRecord record = new AccountRecord();
            record.setCharge(i);
            record.setChargeDate("01-01-2023");
            customer3.addCharge(record);
        }
        // Setting up Customer 4
        customer4 = new Customer();
        customer4.setId(4);
        customer4.setName("c4");
    }

    @Test
    public void shouldBePositiveBalance() {
        assertEquals(450, customer1.getBalance());
    }

    @Test
    public void shouldBeNegativeBalance() {
        assertEquals(-4900, customer2.getBalance());
    }

    @Test
    public void shouldBeZeroBalance() {
        assertEquals(0, customer3.getBalance());
        assertEquals(0, customer4.getBalance());
    }

    @Test
    public void testToString() {
        String expected;

        expected = "Customer ID: 1 | Customer Name: c1 | Customer Balance: $450";
        assertEquals(expected, customer1.toString());

        expected = "Customer ID: 2 | Customer Name: c2 | Customer Balance: -$4900";
        assertEquals(expected, customer2.toString());

        expected = "Customer ID: 3 | Customer Name: c3 | Customer Balance: $0";
        assertEquals(expected, customer3.toString());

        expected = "Customer ID: 4 | Customer Name: c4 | Customer Balance: $0";
        assertEquals(expected, customer4.toString());
    }
}
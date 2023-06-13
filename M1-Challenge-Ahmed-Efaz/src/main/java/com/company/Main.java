package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.HashMap;

public class Main {

    private static List<String[]> customerData = Arrays.asList(
            new String[] {"1","Wayne Enterprises","10000","12-01-2021"},
            new String[] {"2","Daily Planet","-7500","01-10-2022"},
            new String[] {"1","Wayne Enterprises","18000","12-22-2021"},
            new String[] {"3","Ace Chemical","-48000","01-10-2022"},
            new String[] {"3","Ace Chemical","-95000","12-15-2021"},
            new String[] {"1","Wayne Enterprises","175000","01-01-2022"},
            new String[] {"1","Wayne Enterprises","-35000","12-09-2021"},
            new String[] {"1","Wayne Enterprises","-64000","01-17-2022"},
            new String[] {"3","Ace Chemical","70000","12-29-2022"},
            new String[] {"2","Daily Planet","56000","12-13-2022"},
            new String[] {"2","Daily Planet","-33000","01-07-2022"},
            new String[] {"1","Wayne Enterprises","10000","12-01-2021"},
            new String[] {"2","Daily Planet","33000","01-17-2022"},
            new String[] {"3","Ace Chemical","140000","01-25-2022"},
            new String[] {"2","Daily Planet","5000","12-12-2022"},
            new String[] {"3","Ace Chemical","-82000","01-03-2022"},
            new String[] {"1","Wayne Enterprises","10000","12-01-2021"}
    );

    public static void main(String[] args) {

        // Created HashMap to find Unique Customers
        HashMap<Integer, Customer> uniqueCustomers = new HashMap<>();

        // Traversed through customerData and populate uniqueCustomers
        for (String[] customerRecord: customerData) {
            int id = Integer.parseInt(customerRecord[0]);
            Customer customer;
            if (uniqueCustomers.containsKey(id)) {
                customer = uniqueCustomers.get(id);
            } else {
                customer = new Customer();
                customer.setId(id);
                customer.setName(customerRecord[1]);
                uniqueCustomers.put(id, customer);
            }
            AccountRecord record = new AccountRecord();
            record.setCharge(Integer.parseInt(customerRecord[2]));
            record.setChargeDate(customerRecord[3]);
            customer.addCharge(record);
        }

        // Populated a List of Customers using the values of uniqueCustomers
        List<Customer> customers = new ArrayList<>(uniqueCustomers.values());

        // Printed out all accounts with a positive balance
        System.out.println("Positive accounts:");
        for (Customer customer: customers) {
            if (customer.getBalance() > 0) {
                System.out.println(customer);
            }
        }

        // Printed out all accounts with a negative balance
        System.out.println("Negative accounts:");
        for (Customer customer: customers) {
            if (customer.getBalance() < 0) {
                System.out.println(customer);
            }
        }
    }
}

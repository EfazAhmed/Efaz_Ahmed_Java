package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.HashMap;
import java.util.stream.Collectors;

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

        // Created an Empty List of Unique Customers
        List<Customer> uniqueCustomers = new ArrayList<>();

        // Algorithm to populate uniqueCustomers and the charges associated with each unique customer
        for (int i = 0; i < customerData.size(); i++) {
            int id = Integer.parseInt(customerData.get(i)[0]);
            boolean isExist = uniqueCustomers.stream().anyMatch(obj -> obj.getId() == id);
            Customer customer;
            if (isExist) {
                customer = uniqueCustomers.stream().filter(obj -> obj.getId() == id).collect(Collectors.toList()).get(0);
            } else {
                customer = new Customer();
                customer.setId(Integer.parseInt(customerData.get(i)[0]));
                customer.setName(customerData.get(i)[1]);
                uniqueCustomers.add(customer);
            }
            AccountRecord record = new AccountRecord();
            record.setCharge(Integer.parseInt(customerData.get(i)[2]));
            record.setChargeDate(customerData.get(i)[3]);
            customer.addCharge(record);
        }

        // Printed out all accounts with a positive balance
        System.out.println("Positive accounts:");
        for (Customer customer: uniqueCustomers) {
            if (customer.getBalance() > 0) {
                System.out.println(customer);
            }
        }

        // Printed out all accounts with a negative balance
        System.out.println("Negative accounts:");
        for (Customer customer: uniqueCustomers) {
            if (customer.getBalance() < 0) {
                System.out.println(customer);
            }
        }

    }
}

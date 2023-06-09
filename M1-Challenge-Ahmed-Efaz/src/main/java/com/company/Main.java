package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        //Update this
        Customer wayneEnterprises = new Customer();
        wayneEnterprises.setId(Integer.parseInt("1"));
        wayneEnterprises.setName("Wayne Enterprises");

        Customer dailyPlanet =  new Customer();
        dailyPlanet.setId(Integer.parseInt(("2")));
        dailyPlanet.setName("Daily Planet");

        Customer aceChemical =  new Customer();
        aceChemical.setId(Integer.parseInt(("3")));
        aceChemical.setName("Ace Chemical");

        for (String[] customer: customerData) {
            AccountRecord record = new AccountRecord();
            record.setCharge(Integer.parseInt(customer[2]));
            record.setChargeDate(customer[3]);
            if (customer[0] == "1") {
                wayneEnterprises.addCharge(record);
            } else if (customer[0] == "2") {
                dailyPlanet.addCharge(record);
            } else if (customer[0] == "3") {
                aceChemical.addCharge(record);
            }
        }

        System.out.println("Positive accounts:");
        if (wayneEnterprises.getBalance() > 0) {
            System.out.println(wayneEnterprises);
        }
        if (dailyPlanet.getBalance() > 0) {
            System.out.println(dailyPlanet);
        }
        if (aceChemical.getBalance() > 0) {
            System.out.println(aceChemical);
        }
        System.out.println("Negative accounts:");
        if (wayneEnterprises.getBalance() < 0) {
            System.out.println(wayneEnterprises);
        }
        if (dailyPlanet.getBalance() < 0) {
            System.out.println(dailyPlanet);
        }
        if (aceChemical.getBalance() < 0) {
            System.out.println(aceChemical);
        }
    }
}

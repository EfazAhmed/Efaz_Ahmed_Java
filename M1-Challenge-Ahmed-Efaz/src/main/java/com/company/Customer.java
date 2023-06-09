package com.company;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int id;
    private String name;
    private List<AccountRecord> charges = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        //update this
        int balance = 0;
        for (AccountRecord record: charges) {
            balance += record.getCharge();
        }
        return balance;
    }

    public List<AccountRecord> getCharges() {
        return charges;
    }

    public void addCharge(AccountRecord record) {
        charges.add(record);
    }

    @Override
    public String toString() {
        //update this
        if (getBalance() >= 0) {
            return "Customer ID: " + Integer.toString(id) + " | Customer Name: " + name + " | Customer Balance: $" + Integer.toString(getBalance());
        }
        return "Customer ID: " + Integer.toString(id) + " | Customer Name: " + name + " | Customer Balance: -$" + (Integer.toString(-1 * getBalance()));
    }
}

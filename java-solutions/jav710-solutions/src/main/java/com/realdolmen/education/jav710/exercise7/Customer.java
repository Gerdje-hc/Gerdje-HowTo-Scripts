package com.realdolmen.education.jav710.exercise7;

public class Customer extends Person {
    private double discount;

    public Customer(String firstName, String lastName, double discount) {
        super(firstName, lastName);
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }

    @Override
    public void showDetails() {
        System.out.println("First name: " + getFirstName());
        System.out.println("Last name: " + getLastName());
        System.out.println("Discount: " + discount);
    }
}

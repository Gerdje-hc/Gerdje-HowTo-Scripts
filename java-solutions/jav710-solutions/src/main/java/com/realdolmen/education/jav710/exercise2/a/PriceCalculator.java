package com.realdolmen.education.jav710.exercise2.a;

public class PriceCalculator {
    private int price;
    private int quantity;
    private double tax;

    public PriceCalculator(int price, int quantity, double tax) {
        this.price = price;
        this.quantity = quantity;
        this.tax = tax;
    }

    public double calculatePrice() {
        return price * quantity * (1 + tax);
    }
}

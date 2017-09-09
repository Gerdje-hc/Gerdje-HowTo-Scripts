package com.realdolmen.education.jav710.exercise2.a;

public class Runner {
    public static void main(String[] args) {
        PriceCalculator calculator = new PriceCalculator(35, 5, 0.21);
        double price = calculator.calculatePrice();
        System.out.println("The total price is €" + price);
    }
}

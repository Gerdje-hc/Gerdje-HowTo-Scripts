package com.realdolmen.education.jav710.exercise7;

public class Manager extends Employee {
    private double bonus;

    public Manager(String firstName, String lastName, String email, double salary, double bonus) {
        super(firstName, lastName, email, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Bonus: " + bonus);
    }
}

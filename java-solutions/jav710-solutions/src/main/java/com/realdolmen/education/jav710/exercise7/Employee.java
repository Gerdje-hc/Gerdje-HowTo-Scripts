package com.realdolmen.education.jav710.exercise7;

public class Employee extends Person {
    private String email;
    private double salary;

    public Employee(String firstName, String lastName, String email, double salary) {
        super(firstName, lastName);
        this.email = email;
        this.salary = salary;
    }

    public String getEmail() {
        return email;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public void showDetails() {
        System.out.println("First name: " + getFirstName());
        System.out.println("Last name: " + getLastName());
        System.out.println("Salary: " + salary);
        System.out.println("Email: " + email);
    }
}

package com.realdolmen.education.jav710.exercise4.a;

import java.util.Date;

public class Employee {
    private String firstName;
    private String lastName;
    private double salary;
    private String birthDate;
    private String email;

    public Employee() {
    }

    public Employee(String firstName, String lastName, double salary, String birthDate, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.birthDate = birthDate;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        String value = "";
        value += "First name: " + firstName + "\n";
        value += "Last name: " + lastName + "\n";
        value += "Salary: " + salary + "\n";
        value += "Birth birthDate: " + birthDate + "\n";
        value += "Email: " + email;
        return value;
    }

    public void printDetails() {
        System.out.println(this);
    }
}

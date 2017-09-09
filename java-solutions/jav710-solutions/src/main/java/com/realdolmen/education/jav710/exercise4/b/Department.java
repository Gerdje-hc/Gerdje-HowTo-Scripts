package com.realdolmen.education.jav710.exercise4.b;

import com.realdolmen.education.jav710.exercise4.a.Employee;

public class Department {
    private String name;
    private String location;
    private Employee manager;

    public Department() {
    }

    public Department(String name, String location) {
        this.name = name;
        this.location = location;
        this.manager = manager;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    @Override
    public String toString() {
        String value = "";
        value += "Name: " + name + "\n";
        value += "Location: " + name + "\n";
        value += "Manager: " + manager.getFirstName() + " " + manager.getLastName() + "\n";
        return value;
    }

    public void printDetails() {
        System.out.println(this);
    }
}

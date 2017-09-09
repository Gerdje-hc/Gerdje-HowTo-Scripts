package com.realdolmen.education.jav710.exercise4.b;

import com.realdolmen.education.jav710.exercise4.a.Employee;

public class Runner {
    public static void main(String[] args) {
        Department department = new Department("Education", "Huizingen");
        department.setManager(new Employee("Janis", "Joplin", 1000.00, "1943-01-19", "janis.joplin@gmail.com"));
        department.printDetails();
    }
}

package com.realdolmen.education.jav710.exercise7;

public class Runner {
    public static void main(String[] args) {
        Person janis = new Customer("Janis", "Joplin", 150);
        janis.showDetails();
        System.out.println();

        Person jim = new Employee("Jim", "Morrison", "jim.morrison@gmail.com", 1000.00);
        jim.showDetails();
        System.out.println();

        Person jimi = new Manager("Jimi", "Hendrix", "jimi.hendrix@gmail.com", 1000.00, 500.00);
        jimi.showDetails();
    }
}

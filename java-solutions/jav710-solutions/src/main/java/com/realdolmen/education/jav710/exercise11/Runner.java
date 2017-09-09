package com.realdolmen.education.jav710.exercise11;

import com.realdolmen.education.jav710.exercise7.Customer;
import com.realdolmen.education.jav710.exercise7.Employee;
import com.realdolmen.education.jav710.exercise7.Manager;
import com.realdolmen.education.jav710.exercise7.Person;

import java.util.ArrayList;
import java.util.Iterator;

public class Runner {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        addPeople(people);

        iterateUsingForEachLoop(people);
        System.out.println();
        System.out.println();
        iterateUsingIterator(people);
    }

    private static void addPeople(ArrayList<? super Person> people) {
        people.add(new Customer("Janis", "Joplin", 150));
        people.add(new Employee("Jim", "Morrison", "jim.morrison@gmail.com", 1000.00));
        people.add(new Manager("Jimi", "Hendrix", "jimi.hendrix@gmail.com", 1000.00, 500.00));
    }

    private static void iterateUsingForEachLoop(ArrayList<Person> people) {
        System.out.println("Printing using for each:");
        System.out.println("************************");

        for (Person person : people) {
            person.showDetails();
            System.out.println();
        }
    }

    private static void iterateUsingIterator(ArrayList<? extends Person> people) {
        System.out.println("Printing using iterator:");
        System.out.println("************************");

        Iterator<? extends Person> iterator = people.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            person.showDetails();
            System.out.println();
        }
    }
}

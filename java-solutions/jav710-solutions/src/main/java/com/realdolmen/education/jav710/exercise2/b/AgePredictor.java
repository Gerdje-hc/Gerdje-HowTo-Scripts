package com.realdolmen.education.jav710.exercise2.b;

import java.util.Scanner;

public class AgePredictor {
    private Scanner scanner = new Scanner(System.in);

    void predictAge() {
        System.out.print("What is your name?: ");
        String name = scanner.next();

        System.out.print("What is your age?: ");
        int age = scanner.nextInt();

        System.out.println("Hello " + name + "! Next year you'll be " + (age + 1) + " years old.");
    }
}

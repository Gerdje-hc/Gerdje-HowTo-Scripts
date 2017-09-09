package com.realdolmen.education.jav710.exercise2.c;

import java.util.Scanner;

public class Averager {
    Scanner scanner = new Scanner(System.in);

    public void run() {
        int a = queryNumber();
        int b = queryNumber();
        int c = queryNumber();

        int average = (int) Math.round((a + b + c) / 3.0);
        System.out.println("The rounded average of " + a + ", " + b + ", and " + c + " is " + average);
    }

    private int queryNumber() {
        System.out.print("Enter a number: ");
        return scanner.nextInt();
    }
}

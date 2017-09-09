package com.realdolmen.education.jav710.exercise5;


import java.util.Scanner;

public class SnowPredictor {
    Scanner scanner = new Scanner(System.in);

    public void predict() {
        System.out.print("What's the season: ");
        String seasonString = scanner.next();
        Season season = Season.valueOf(seasonString);
        System.out.println("The chances of it snowing this " + season + " are " + (100 * season.snowProbability) + "%");
    }
}

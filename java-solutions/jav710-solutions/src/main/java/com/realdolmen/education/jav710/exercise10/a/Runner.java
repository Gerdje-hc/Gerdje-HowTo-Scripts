package com.realdolmen.education.jav710.exercise10.a;

public class Runner {
    public static void main(String[] args) {
        methodOfDoom();
        System.out.println();
        methodOfLuck();
    }

    private static void methodOfLuck() {
        try {
            new Submarine().launchMissiles();
            System.out.println("Total destruction!");
        } catch (LaunchException exception) {
            System.out.println(exception.getMessage());
            System.out.println("Saved the day!");
        }
    }

    private static void methodOfDoom() {
        try {
            Submarine submarine = new Submarine();
            submarine.receiveLaunchApproval();
            submarine.launchMissiles();
            System.out.println("Total destruction!");
        } catch (LaunchException exception) {
            System.out.println(exception.getMessage());
            System.out.println("Saved the day!");
        }
    }
}

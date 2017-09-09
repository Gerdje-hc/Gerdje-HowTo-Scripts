package com.realdolmen.education.jav710.exercise3;

import java.util.Scanner;

public class GuessingGame {
    private int minimum;
    private int maximum;

    public GuessingGame(int minimum, int maximum) {
        this.minimum = minimum;
        this.maximum = maximum;
    }

    private int random(int minimum, int maximum) {
        return (int)(minimum + Math.random() * (1 + maximum - minimum));
    }

    public void play(int numberOfTries) {
        System.out.println("Playing guessing game!");
        System.out.println("**********************");
        System.out.println();
        System.out.println("You have " + numberOfTries + " attempts to guess a number between " + minimum + " and " + maximum);
        int numberToGuess = random(minimum, maximum);
        System.out.println("(cheating: the number to guess is " + numberToGuess + ")");
        System.out.println();
        boolean winner = guesses(numberOfTries, numberToGuess);
        if(winner) {
            System.out.println("==================================");
            System.out.println("WE HAVE A WINNER, A TRUE CHAMPION!");
            System.out.println("==================================");
        } else {
            System.out.println("==================");
            System.out.println("GAME OVER, LOOSER!");
            System.out.println("==================");
        }
    }

    private boolean guesses(int numberOfTries, int numberToGuess) {
        Scanner scanner = new Scanner(System.in);
        int attempt = 0;
        boolean winner;
        do {
            attempt++;
            System.out.print("Attempt " + attempt + "! Guess a number: ");
            int guess = scanner.nextInt();
            winner = (guess == numberToGuess);
        } while(attempt < numberOfTries && !winner);
        return winner;
    }
}

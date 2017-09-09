package com.realdolmen.education.jav710.exercise8.b;

import java.util.Arrays;

public class LottoPredictor {
    private static final int NUMBER_COUNT = 6;
    private static final int MAXIMUM_NUMBER = 6;

    private int[] numbers;

    public void predict() {
        numbers = new int[NUMBER_COUNT];
        for(int i=0; i< NUMBER_COUNT; i++) {
            numbers[i] = pick();
        }
        Arrays.sort(numbers);
    }

    private int pick() {
        int number = random();
        while(alreadyPicked(number)) {
            number = random();
        }
        return number;
    }

    private boolean alreadyPicked(int candidate) {
        for (int number : numbers) {
            if(number == candidate) {
                return true;
            }
        }
        return false;
    }

    private int random() {
        return (int)(Math.random() * (MAXIMUM_NUMBER)) + 1;
    }

    public void print() {
        for (int number : numbers) {
            System.out.print(number);
            System.out.print("\t");
        }
        System.out.println();
    }
}

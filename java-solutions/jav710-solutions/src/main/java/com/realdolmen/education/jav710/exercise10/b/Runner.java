package com.realdolmen.education.jav710.exercise10.b;

public class Runner {
    public static void main(String[] args) {
        try {
            int[] arrayThatIsTooSmall = new int[10];
            arrayThatIsTooSmall[15] = 42;
        } catch(ArrayIndexOutOfBoundsException exception) {
            System.out.println("It is too small!");
        }
    }
}

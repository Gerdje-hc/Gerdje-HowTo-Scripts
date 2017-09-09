package com.realdolmen.education.jav710.exercise6;

public class IntOverflowRunner {
    public static void main(String[] args) {
        short value = 0;
        while(value >= 0) {
            System.out.println("Adding 1 to " + value + " equals " + (++value));
        }
        System.out.println("Strange phenomenon detected. Possibly aliens are involved!");
    }
}

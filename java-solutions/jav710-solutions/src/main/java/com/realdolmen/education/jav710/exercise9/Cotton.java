package com.realdolmen.education.jav710.exercise9;

public class Cotton extends Cloth implements Printable {
    @Override
    public void print(String text) {
        System.out.println("Printing '" + text + "' to cotton");
    }
}

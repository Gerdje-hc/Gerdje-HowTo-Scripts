package com.realdolmen.education.jav710.exercise9;

public class WritingPaper extends Paper implements Printable {
    @Override
    public void print(String text) {
        System.out.println("Printing '" + text + "' to writing paper");
    }
}

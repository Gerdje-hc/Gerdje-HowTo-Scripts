package com.realdolmen.education.jav710.exercise9;

public class Printer {
    private String text;

    public Printer(String text) {
        this.text = text;
    }

    public void printTextTo(Printable printable) {
        printable.print(this.text);
    }
}

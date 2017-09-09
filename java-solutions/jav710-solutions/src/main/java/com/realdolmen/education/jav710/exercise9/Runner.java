package com.realdolmen.education.jav710.exercise9;

public class Runner {
    public static void main(String[] args) {
        Printer printer = new Printer("RealDolmen");
        printer.printTextTo(new Cotton());
        printer.printTextTo(new WritingPaper());

        // No, no, no!
        // printer.printTextTo("RealDolmen", new Silk());
        // printer.printTextTo("RealDolmen", new ToiletPaper());
    }
}

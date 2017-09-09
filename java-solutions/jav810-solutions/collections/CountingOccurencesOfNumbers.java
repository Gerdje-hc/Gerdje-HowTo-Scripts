package com.realdolmen.broc;

import java.util.Scanner;
import java.util.TreeMap;

public class CountingOccurencesOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeMap<Integer, Integer> entries = new TreeMap<>();

        int n = askNumber(scanner);
        while(n != 0) {
            if(entries.containsKey(n)) {
                entries.put(n, entries.get(n) + 1);
            } else {
                entries.put(n, 1);
            }
            n = askNumber(scanner);
        }

        System.out.println("List of entries: ");
        for(Integer key : entries.keySet()) {
            Integer value = entries.get(key);
            System.out.println("Number " + key + " occurs " + value + " time(s)");
        }
    }

    private static int askNumber(Scanner scanner) {
        System.out.print("Geef een getal in: ");
        return scanner.nextInt();
    }
}

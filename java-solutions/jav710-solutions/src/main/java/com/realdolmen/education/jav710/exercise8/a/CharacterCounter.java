package com.realdolmen.education.jav710.exercise8.a;

public class CharacterCounter {
    private static final char FIRST_LETTER = 'a';
    private static final char LAST_LETTER = 'z';

    private String sentence;
    private int[] characterCounts = new int[LAST_LETTER - FIRST_LETTER + 1];

    public CharacterCounter(String sentence) {
        this.sentence = sentence.toLowerCase();
        countCharacters();
    }

    public void countCharacters() {
        for (char character : sentence.toCharArray()) {
            if(Character.isAlphabetic(character)) {
                int index = character - FIRST_LETTER;
                characterCounts[index]++;
            }
        }
    }

    public void printResults() {
        for (int i = 0; i < characterCounts.length; i++) {
            int count = characterCounts[i];
            char character = (char) (FIRST_LETTER + i);
            System.out.println("The letter '" + character + "' occurs " + count + " times.");
        }
    }
}

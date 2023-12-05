package com.itvdn.junit;

public class CalculateWords {
    public int calculateWords(String sentence){
        sentence = sentence.trim();

        // Check if the sentence is empty after trimming
        if (sentence.isEmpty()) {
            return 0;
        }

        // Use "\\s+" as the split pattern to handle multiple whitespaces
        String[] words = sentence.split("\\s+");

        return words.length;
    }
}

package com.itvdn.junit;

public class CalculateDigits {
    public int calculateDigits(String sentence){
        int digits = 0;
        for (int i = 0; i < sentence.length(); i++){
            if (Character.isDigit(sentence.charAt(i))){
                digits++;
            }
        }
        return digits;
    }
}

package com.itvdn.junit;

public class StringProcessing {
    public static void main(String[] args){
        StrongPassword strongPassword = new StrongPassword();
        System.out.println(strongPassword.isStrongPassword("Qwerty7"));

        CalculateWords calculateWords = new CalculateWords();
        System.out.println(calculateWords.calculateWords(""));

        CalculateDigits calculateDigits = new CalculateDigits();
        System.out.println(calculateDigits.calculateDigits("GeeksforGeeks2 password is : 1234"));

        CalculateExpression calculateExpression = new CalculateExpression();
        System.out.println(calculateExpression.calculateExpression("3 + 5 * ( 2 - 8 ) / 0"));
    }
}

package com.itvdn.junit;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringProcessingTest {

    @Test
    public void testStrongPassword() {
        StrongPassword strongPassword = new StrongPassword();
        assertEquals(true, strongPassword.isStrongPassword("@w3rtY"));
        assertEquals(true, strongPassword.isStrongPassword("00P$m@$h"));
        assertEquals(true, strongPassword.isStrongPassword("B3k$ulT@n"));
        assertEquals(false, strongPassword.isStrongPassword("1234567890"));
        assertEquals(false, strongPassword.isStrongPassword("qwerty123"));
        assertEquals(false, strongPassword.isStrongPassword("beksultan2005"));
    }
    @Test
    public void testCalculateWords(){
        CalculateWords calculateWords = new CalculateWords();
        assertEquals(6, calculateWords.calculateWords("Hello, world my name is Beksultan"));
        assertEquals(2, calculateWords.calculateWords("Be grateful"));
        assertEquals(0, calculateWords.calculateWords(""));
        assertEquals(10, calculateWords.calculateWords("My friend takes a lot of sugar in her tea."));
        assertEquals(3, calculateWords.calculateWords("Act as if"));
        assertEquals(7, calculateWords.calculateWords("Hope is the dream of waking man."));

    }
    @Test
    public void testCalculateDigits(){
        CalculateDigits calculateDigits = new CalculateDigits();
        assertEquals(4, calculateDigits.calculateDigits("GeeksforGeeks password is : 1234"));
        assertEquals(2, calculateDigits.calculateDigits("I am 18 years old"));
        assertEquals(0, calculateDigits.calculateDigits("To know nothing is the happiest life"));
        assertEquals(10, calculateDigits.calculateDigits("0123456789"));
        assertEquals(5, calculateDigits.calculateDigits("Embrace each day with 1 smile, 2 kind gestures, 3 moments of gratitude, 4 acts of love, and 5 dreams to chase. Life's beauty lies in the simple digits of joy."));

    }
    @Test
    public void testCalculateExpression(){
        CalculateExpression calculateExpression = new CalculateExpression();
        assertEquals(17.0, calculateExpression.calculateExpression("10 / 2 + 3 * 5"), 0.0001);
        assertEquals(5.0, calculateExpression.calculateExpression("7 - 4 * 2 / 2"), 0.0001);
        assertEquals(6.0, calculateExpression.calculateExpression("5 + (3 * 2 - 6) / 2"), 0.0001);
        assertEquals(-12.0, calculateExpression.calculateExpression("3 + 5 * ( 2 - 8 ) / 2"), 0.0001);
    }
}
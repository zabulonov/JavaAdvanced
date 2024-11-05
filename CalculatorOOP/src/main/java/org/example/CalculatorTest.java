package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    @org.junit.jupiter.api.Test
    public void testDivision() {
        Division division = new Division();
        assertEquals(2.0, division.calculate(10, 5));
        assertThrows(ArithmeticException.class, () -> division.calculate(10, 0));
    }
    @org.junit.jupiter.api.Test
    public void testAddition() {
        Addition addition = new Addition();
        assertEquals(5, addition.calculate(2, 3));
    }

    @org.junit.jupiter.api.Test
    public void testSubtraction() {
        Subtraction subtraction = new Subtraction();
    }

    @org.junit.jupiter.api.Test
    public void testDivisionByZero() {
        Division division = new Division();
        assertThrows(ArithmeticException.class, () -> division.calculate(10, 0));
    }

    @org.junit.jupiter.api.Test
    public void testDivisionBySmallNumber() {
        Division division = new Division();
        assertEquals(1000000.0, division.calculate(10, 0.00001), 0.001);
    }
    
    @org.junit.jupiter.api.Test
    public void testNegativeNumbers() {
        Subtraction subtraction = new Subtraction();
        assertEquals(-5, subtraction.calculate(2, 7));
    }
}

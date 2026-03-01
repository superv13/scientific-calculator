package com.shruti.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    @Test
    public void testSqrt() {
        Calculator calc = new Calculator();
        assertEquals(2, calc.sqrt(4));
        assertEquals(0.0, calc.sqrt(0));
        assertThrows(IllegalArgumentException.class, () -> calc.sqrt(-4));
    }

    @Test
    public void testFactorial() {
        Calculator calc = new Calculator();
        assertEquals(24, calc.factorial(4));
        assertEquals(1, calc.factorial(0));
        assertEquals(1, calc.factorial(1));
        assertThrows(IllegalArgumentException.class, () -> calc.factorial(-3));
    }

    @Test
    public void testNaturalLog() {
        Calculator calc = new Calculator();
        assertEquals(1.0, calc.naturalLog(Math.E), 0.0001);
        assertEquals(0.0, calc.naturalLog(1), 0.0001);
        assertThrows(IllegalArgumentException.class, () -> calc.naturalLog(-1));
    }

    @Test
    public void testPower() {
        Calculator calc = new Calculator();
        assertEquals(8, calc.power(2, 3));
        assertEquals(0.25, calc.power(2,-2));
        assertEquals(0.25, calc.power(-2,-2));
        assertEquals(-0.125, calc.power(-2,-3));
    }


}


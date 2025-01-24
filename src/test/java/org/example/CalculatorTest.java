package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static java.lang.Float.NaN;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        // Initialize the calculator object before each test
        calculator = new Calculator();
    }

    @Test
    void add() {
        // Test for addition
        assertEquals(5.0, calculator.add(2.0, 3.0), 0.0001, "Addition test failed");
        assertEquals(0.0, calculator.add(-1.0, 1.0), 0.0001, "Addition with negative numbers failed");
    }

    @Test
    void subtract() {
        // Test for subtraction
        assertEquals(1.0, calculator.subtract(3.0, 2.0), 0.0001, "Subtraction test failed");
        assertEquals(-4.0, calculator.subtract(-1.0, 3.0), 0.0001, "Subtraction with negative numbers failed");
    }

    @Test
    void multiply() {
        // Test for multiplication
        assertEquals(6.0, calculator.multiply(2.0, 3.0), 0.0001, "Multiplication test failed");
        assertEquals(-3.0, calculator.multiply(-1.0, 3.0), 0.0001, "Multiplication with negative numbers failed");
        assertEquals(0.0, calculator.multiply(0.0, 5.0), 0.0001, "Multiplication with zero failed");
    }

    @Test
    void divide() {
        // Test for division
        assertEquals(2.0, calculator.divide(6.0, 3.0), 0.0001, "Division test failed");
        assertEquals(-2.0, calculator.divide(-6.0, 3.0), 0.0001, "Division with negative numbers failed");

        // Test for division by zero
        Exception exception = assertThrows(ArithmeticException.class, () -> calculator.divide(1.0, 0),
                "Expected division by zero to throw an exception");
        assertEquals("Division by zero is not allowed.", exception.getMessage());
    }
    @Test
    void wurzel (){
        assertEquals(NaN, calculator.wurzel(-9.0), "Wurzel test failed you cannot do square root of negative numbers");
        assertEquals(0.0, calculator.wurzel(0.0), 0.0, "wurzel with 0 as basis doesnt exist");

    }
    @Test
    void square(){
        assertEquals(4.0, calculator.square(2.0), "square of 2 is 4");
        assertEquals(9.0, calculator.square(3.0),  "square 3 is 9");

    }
}

package pl.kgurniak.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {
    private Calculator calculator = new Calculator();

    @Test
    void returnsCorrectSumOfTwoNumbers() {
        assertEquals(5, calculator.sum(2, 3));
    }
}

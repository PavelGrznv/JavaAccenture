import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    public void addsTwoPositiveNumbers() {
        assertEquals(7, calculator.add(3, 4));
    }

    @Test
    public void addsTwoNumbersWithNegativeOperand() {
        assertEquals(2, calculator.add(5, -3));
    }

    @Test
    public void addsThreePositiveNumbers() {
        assertEquals(6, calculator.add(1, 2, 3));
    }

    @Test
    public void addsThreeNumbersWithZeroAndNegativeOperand() {
        assertEquals(-2, calculator.add(0, 3, -5));
    }

    @Test
    public void subtractsTwoNumbers() {
        assertEquals(5, calculator.subtract(8, 3));
    }

    @Test
    public void subtractionCanReturnNegativeResult() {
        assertEquals(-5, calculator.subtract(3, 8));
    }

    @Test
    public void dividesTwoNumbers() {
        assertEquals(4, calculator.divide(12, 3));
    }

    @Test(expected = ArithmeticException.class)
    public void divisionByZeroThrowsArithmeticException() {
        calculator.divide(12, 0);
    }

    @Test
    public void multipliesTwoNumbers() {
        assertEquals(12, calculator.multiply(3, 4));
    }

    @Test(expected = Calculator.InvalidMultiplicationException.class)
    public void multiplicationOverflowThrowsCustomException() {
        calculator.multiply(Integer.MAX_VALUE, 2);
    }
}

public class Calculator {

    public int add(int first, int second) {
        return first + second;
    }

    public int add(int first, int second, int third) {
        return first + second + third;
    }

    public int subtract(int first, int second) {
        return first - second;
    }

    public int divide(int dividend, int divisor) {
        try {
            return dividend / divisor;
        } catch (ArithmeticException exception) {
            throw new ArithmeticException("Cannot divide by zero");
        }
    }

    public int multiply(int first, int second) {
        try {
            return Math.multiplyExact(first, second);
        } catch (ArithmeticException exception) {
            throw new InvalidMultiplicationException(
                    "Multiplication result is outside the int range", exception);
        }
    }

    public static class InvalidMultiplicationException extends RuntimeException {

        public InvalidMultiplicationException(String message, Throwable cause) {
            super(message, cause);
        }
    }
}
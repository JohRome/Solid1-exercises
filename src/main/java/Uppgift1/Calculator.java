package Uppgift1;

/**
 * The Calculator class provides basic arithmetic operations.
 */
public class Calculator {

    /**
     * Adds two numbers.
     *
     * @param n1 The first number.
     * @param n2 The second number.
     * @return The sum of the two numbers.
     */
    public double add(double n1, double n2) {
        return n1 + n2;
    }

    /**
     * Subtracts one number from another.
     *
     * @param n1 The number to be subtracted from.
     * @param n2 The number to subtract.
     * @return The difference between the two numbers.
     */
    public double subtract(double n1, double n2) {
        return n1 - n2;
    }

    /**
     * Multiplies two numbers.
     *
     * @param n1 The first number.
     * @param n2 The second number.
     * @return The product of the two numbers.
     */
    public double multiply(double n1, double n2) {
        return n1 * n2;
    }

    /**
     * Divides one number by another.
     *
     * @param n1 The number to be divided.
     * @param n2 The number to divide by.
     * @return The quotient of the division.
     * @throws ArithmeticException if the divisor is zero.
     */
    public double divide(double n1, double n2) {
        if (n2 == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return n1 / n2;
    }
}

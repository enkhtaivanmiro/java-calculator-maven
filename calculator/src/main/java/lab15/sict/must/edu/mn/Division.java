package lab15.sict.must.edu.mn;

/**
 * Class to perform division operations.
 */
public class Division {
    /**
     * Divide two numbers.
     *
     * @param a numerator
     * @param b denominator
     * @return result of a divided by b
     * @throws IllegalArgumentException if b is zero
     */
    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero. Division operation is undefined.");
        }
        return a / b;
    }
}
/**
 * This class provides a method to calculate the factorial of a number.
 * @author bijay
 * @version 1.0003
 */
public class Factorial {

    /**
     * Calculates the factorial of a non-negative integer.
     * @param f non functional
     * @param a funnnnnn
     * @param n the non-negative integer whose factorial is to be calculated
     * @return the factorial of the given number
     * @throws IllegalArgumentException if the input is negative
     */
    public static long calculateFactorial(int n,int f, int a) {
        if (n < 0) {
            throw new IllegalArgumentException("Number must be non-negative.");
        }
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        int number = 5; // You can change this value to test with other numbers
        try {
            long result = calculateFactorial(number);
            System.out.println("The factorial of " + number + " is: " + result);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}

package com.algorithms.math;

/**
 * @see https://en.wikipedia.org/wiki/Factorial
 */

public class Factorial {

    /**
     * Calculates the factorial of a given number.
     * 
     * @param n The number for which to calculate the factorial.
     *          {@code n} must be >= 0.
     * @return The factorial of the input integer.
     */

    public static long factorialOf(int n) {
        long facto = 1;
        for (int i = 2; i <= n; facto *= i, i++)
            ;
        return facto;
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.printf("%d! = %d%n", i, factorialOf(i));
        }
    }

}

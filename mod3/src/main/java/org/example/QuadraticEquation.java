package org.example;
/*
For the given quadratic equation coefficients (ax2 + bx + c = 0) return array with zero,
one or two real roots of the equation.
Roots in the array may be in any order. Specify behavior of infinite roots case by yourself.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class QuadraticEquation {


    public double[] quadratic(double firstParametor, double secondParametor, double thirdParametor) {
        double discr = Math.pow(secondParametor, 2) - 4 * firstParametor * thirdParametor;
        if (firstParametor <= 0) {
            return new double[]{};
        }
        if (secondParametor == 0 && thirdParametor / firstParametor > 0) {

            return new double[]{};
        }
        if (discr < 0) {
            return new double[]{};
        }
        double sqrt = Math.sqrt(discr);
        double expressionWithPlus = (-secondParametor + sqrt) / (2 * firstParametor);
        double expressionWithMinus = (-secondParametor - sqrt) / (2 * firstParametor);
        double[] currentValue = new double[]{expressionWithPlus, expressionWithMinus};
        return currentValue;
    }

    public void printArray(double[] array) {
        for (double v : array) {
            System.out.println(v);
        }
    }
}

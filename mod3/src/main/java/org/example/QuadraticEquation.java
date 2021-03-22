package org.example;
/*
For the given quadratic equation coefficients (ax2 + bx + c = 0) return array with zero,
one or two real roots of the equation.
Roots in the array may be in any order. Specify behavior of infinite roots case by yourself.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class QuadraticEquation {
    static Scanner inputForQuadratic = new Scanner(System.in);

    public static double enterFirstParametor() {
        System.out.println("Enter first parametor");
        double firstParametor = 0;
        try {
            firstParametor = inputForQuadratic.nextDouble();
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
        return firstParametor;

    }

    public static double enterSecondParametor() {
        System.out.println("Enter second parametor");
        double secondParametor = 0;
        try {
            secondParametor = inputForQuadratic.nextDouble();

        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
        return secondParametor;
    }


    public static double enterThirdParametor() {
        System.out.println("Enter third parametor");
        double thirdParametor = 0;
        try {
            thirdParametor = inputForQuadratic.nextDouble();
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
        return thirdParametor;
    }

    public double[] quadratic(double firstParametor, double secondParametor, double thirdParametor) {
        double discr = Math.pow(secondParametor, 2) - 4 * firstParametor * thirdParametor;
        if (firstParametor <= 0) {
            return new double[]{};
        }
        if (-thirdParametor / firstParametor < 0) {
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

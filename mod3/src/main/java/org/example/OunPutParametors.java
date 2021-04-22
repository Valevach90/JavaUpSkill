package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public  class OunPutParametors {
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
}

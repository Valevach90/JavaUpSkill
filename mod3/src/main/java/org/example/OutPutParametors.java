package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public  class OutPutParametors {
    static Scanner inputForQuadratic = new Scanner(System.in);

    public static double enterParametor(String massage) {
        System.out.println(massage);
        double parametor = 0;
        try {
            parametor = inputForQuadratic.nextDouble();
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
        return parametor;

    }


}

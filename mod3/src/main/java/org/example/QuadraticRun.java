package org.example;

import static org.example.OunPutParametors.*;

public class QuadraticRun {
    public static void main(String[] args) {
        QuadraticEquation quadraticEquation = new QuadraticEquation();
        double[] result = quadraticEquation.quadratic(enterFirstParametor(),
                enterSecondParametor(),
                enterThirdParametor());

        quadraticEquation.printArray(result);
    }
}

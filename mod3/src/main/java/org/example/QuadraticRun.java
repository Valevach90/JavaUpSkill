package org.example;

public class QuadraticRun {
    public static void main(String[] args) {
        QuadraticEquation quadraticEquation = new QuadraticEquation();
        double[] result = quadraticEquation.quadratic(QuadraticEquation.enterFirstParametor(),
                QuadraticEquation.enterSecondParametor(),
                QuadraticEquation.enterThirdParametor());

        quadraticEquation.printArray(result);
    }
}

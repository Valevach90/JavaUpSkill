package org.example;


import static org.example.OutPutParametors.enterParametor;


public class QuadraticRun {
    public static void main(String[] args) {
        QuadraticEquation quadraticEquation = new QuadraticEquation();
        double firstParametor = enterParametor("Enter first parametor");
        double secondParametor = enterParametor("Enter second parametor");
        double thirdParametor = enterParametor("Enter third parametor");
        double[] result = quadraticEquation.quadratic(firstParametor,secondParametor,thirdParametor);

        quadraticEquation.printArray(result);
    }
}

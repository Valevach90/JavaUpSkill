package org.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.InputMismatchException;

import static org.junit.Assert.*;

public class QuadraticEquationTest {
    private final QuadraticEquation quadraticEquation = new QuadraticEquation();

    @Test
    public void whenDiscrEqualsNegative() {
        double[] result = quadraticEquation.quadratic(1,2,3);
        double [] expected = new double[]{};
        assertArrayEquals(expected,result,0);
    }
    @Test
    public void whenDiscrEqualsZero(){
        double[] result = quadraticEquation.quadratic(1,2,3);
        double [] expected = new double[]{};
        assertArrayEquals(expected,result,0);

    }
    @Test
    public  void whenDiscrTrue(){
        double[] result = quadraticEquation.quadratic(2,3,1);
        double value1 = 2*(result[0]*result[0])+3*result[0]+1;
        double value2 = 2*(result[1]*result[1])+3*result[1]+1;
        assertEquals(0,value1,0);
        assertEquals(0,value2,0);
    }

    @Test
    public void whenFirstParametorEqualsZero(){
        double[] result = quadraticEquation.quadratic(0,3,1);
        double[] expected =  new double[]{};
        assertArrayEquals(expected,result,0);
    }
    @Test
    public void whenSecondParametorEqualsZero(){
        double[] result = quadraticEquation.quadratic(1,0,1);
        double[] expected =  new double[]{};
        assertArrayEquals(expected,result,0);
    }
    @Test
    public void whenSecondParametorEqualsZeroSecondExample(){
        double[] result = quadraticEquation.quadratic(1,0,-2);
        double value1 = 1*(result[0]*result[0])+0*result[0]-2;
        double value2 = 1*(result[1]*result[1])+0*result[1]-2;
        assertEquals(0,value1,0.000001);//дельту поменять
        assertEquals(0,value2,0.000001);
    }
    @Test
    public void whenThirdParametorEqualsZero(){
        double[] result = quadraticEquation.quadratic(1,3,0);
        double value1 = 1*(result[0]*result[0])+3*result[0]+0;
        double value2 = 1*(result[1]*result[1])+3*result[1]+0;
        assertEquals(0,value1,0);
        assertEquals(0,value2,0);
    }



}
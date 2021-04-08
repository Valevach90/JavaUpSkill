package org.example;


import org.junit.Test;


import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class QuadraticEquationTest {
    private final QuadraticEquation quadraticEquation = new QuadraticEquation();

    @Test
    public void whenDiscrEqualsNegative() {
        double[] result = quadraticEquation.quadratic(9, 6, 2);
        double[] expected = new double[]{};
        assertArrayEquals(expected, result, 0);
        assertEquals(expected.length, result.length);
    }

    @Test
    public void whenDiscrEqualsZero() {
        double[] result = quadraticEquation.quadratic(1, 2, 3);
        double[] expected = new double[]{};
        assertArrayEquals(expected, result, 0);

    }

    @Test
    public void whenDiscrTrue() {
        double[] result = quadraticEquation.quadratic(2, 3, 1);
        double value1 = 2 * (result[0] * result[0]) + 3 * result[0] + 1;
        double value2 = 2 * (result[1] * result[1]) + 3 * result[1] + 1;
        assertEquals(0, value1, 0);
        assertEquals(0, value2, 0);
    }

    @Test
    public void whenFirstParametorEqualsZero() {
        double[] result = quadraticEquation.quadratic(0, 3, 1);
        double[] expected = new double[]{};
        assertArrayEquals(expected, result, 0);
        assertEquals(expected.length, result.length);
    }

    @Test
    public void whenSecondParametorEqualsZero() {
        double[] result = quadraticEquation.quadratic(5, 0, 30);
        double[] expected = new double[]{};
        assertArrayEquals(expected, result, 0);
        assertEquals(expected.length, result.length);
    }

    @Test
    public void whenSecondParametorEqualsZeroSecondExample() {
        double[] result = quadraticEquation.quadratic(4, 0, -9);
        double value1 = 4 * (result[0] * result[0]) + 0 * result[0] - 9;
        double value2 = 4 * (result[1] * result[1]) + 0 * result[1] - 9;
        assertEquals(0, value1, 0.000001);
        assertEquals(0, value2, 0.000001);
    }

    @Test
    public void whenThirdParametorEqualsZero() {
        double[] result = quadraticEquation.quadratic(1, 3, 0);
        double value1 = 1 * (result[0] * result[0]) + 3 * result[0] + 0;
        double value2 = 1 * (result[1] * result[1]) + 3 * result[1] + 0;
        assertEquals(0, value1, 0);
        assertEquals(0, value2, 0);
    }
}
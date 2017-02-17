package oose.dea;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tyskie on 2/18/17.
 */
public class CalculatorTest {
    Calculator sut;

    @Before
    public void setUp(){
        sut = new Calculator();
    }

    @Test
    public void testAddPositives(){
        int expected = 10;
        int actual = sut.add("5", "5");
        assertEquals(expected, actual);
    }

    @Test
    public void testAddNegatives(){
        int expected = 5;
        int actual = sut.add("10", "-5");
        assertEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddIllegalArgument(){
        sut.add("5", "x");
    }

    @Test
    public void testEmptyString(){
        int expected = 0;
        int actual = sut.add("", "");
        assertEquals(expected, actual);
    }

    @Test
    public void testSubtractPositives(){
        int expected = 5;
        int actual = sut.subtract("10", "5");
        assertEquals(expected, actual);
    }

    @Test
    public void testSubtractNegatives(){
        int expected = 0;
        int actual = sut.subtract("-5", "-5");
        assertEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSubtractIllegalArgument(){
        sut.subtract("x", "5");
    }

    @Test
    public void testSubtractEmptyString(){
        int expected = -5;
        int actual = sut.subtract("", "5");
        assertEquals(expected, actual);
    }

    @Test
    public void testMultiplyPositives(){
        int expected = 10;
        int actual = sut.multiply("2", "5");
        assertEquals(expected, actual);
    }

    @Test
    public void testMultiplyNegatives(){
        int expected = -10;
        int actual = sut.multiply("2", "-5");
        assertEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMultiplyIllegalArgument(){
        sut.multiply("x", "5");
    }

    @Test
    public void testMultiplyEmptyString(){
        int expected = 0;
        int actual = sut.multiply("5", "");
        assertEquals(expected, actual);
    }

    @Test
    public void testDividePositives(){
        int expected = 5;
        int actual = sut.divide("50", "10");
        assertEquals(expected, actual);
    }

    @Test
    public void testDivideNegatives(){
        int expected = -5;
        int actual = sut.divide("50", "-10");
        assertEquals(expected, actual);
    }

}
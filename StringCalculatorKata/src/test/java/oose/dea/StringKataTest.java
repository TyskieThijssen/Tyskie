package oose.dea;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Thijs on 14-2-2017.
 */
public class StringKataTest {
    StringKata sut;

    @Before
    public void setUp(){
        sut = new StringKata();
    }

    @Test
    public void testEmptyString(){
        int expected = 0;
        int actual = sut.add("");
        assertEquals(expected, actual);
    }

    @Test
    public void testOneNumber(){
        int expected = 5;
        int actual = sut.add("5");
        assertEquals(expected, actual);
    }

    @Test
    public void testTwoNumbers(){
        int expected = 10;
        int actual = sut.add("5,5");
        assertEquals(expected, actual);
    }

    @Test
    public void testThreeNumbers(){
        int expected = 15;
        int actual = sut.add("5,5,5");
        assertEquals(expected, actual);
    }

    @Test
    public void testNewLine(){
        int expected = 6;
        int actual = sut.add("1\n2,3");
        assertEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeNumber(){
        sut.add("-1");
    }

}
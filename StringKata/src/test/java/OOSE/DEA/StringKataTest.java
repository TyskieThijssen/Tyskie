package OOSE.DEA;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Thijs on 10-2-2017.
 */
public class StringKataTest {
    StringKata sut;

    @Before
    public void setUp(){
        sut = new StringKata();
    }

    @Test
    public void testAddEmptyString(){
        int expected = 0;
        int actual = sut.Add("");
        assertEquals(expected, actual);
    }

    @Test
    public void testAddOneNumber(){
        int expected = 5;
        int actual = sut.Add("5");
        assertEquals(expected, actual);
    }

    @Test
    public void testAddTwoNumbers(){
        int expected = 10;
        int actual = sut.Add("5,5");
        assertEquals(expected, actual);
    }

    @Test
    public void testAddThreeNumbers(){
        int expected = 9;
        int actual = sut.Add("3,3,3");
        assertEquals(expected, actual);
    }

    @Test
    public void testAddNewLine(){
        int expected = 6;
        int actual = sut.Add("1\n2,3");
        assertEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddNegative(){
        sut.Add("-1");
    }
}
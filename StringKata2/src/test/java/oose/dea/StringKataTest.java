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
    public void testTwoEmptyStrings(){
        int expected = 0;
        int actual = sut.sum("","");
        assertEquals(expected, actual);
    }

    @Test
    public void testOneEmptyString(){
        int expected = 5;
        int actual = sut.sum("","5");
        assertEquals(expected, actual);
    }

    @Test
    public void testTwoValidStrings(){
        int expected = 10;
        int actual = sut.sum("5", "5");
        assertEquals(expected, actual);
    }

    @Test
    public void testOneInvalidString(){
        int expected = 5;
        int actual = sut.sum("x","5");
        assertEquals(expected, actual);
    }

    @Test
    public void testTwoInvalidStrings(){
        int expected = 0;
        int actual = sut.sum("x","x");
        assertEquals(expected, actual);
    }

}
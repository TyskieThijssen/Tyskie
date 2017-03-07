package oose.dea;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tyskie on 3/3/17.
 */
public class GuessTheNumberTest {
    GuessTheNumber sut;

    @Before
    public void setUp(){
        sut = new GuessTheNumber();
    }

    @Test
    public void testWrongTooHigh(){
        String expected = "Wrong number, it's too high!";
        String actual = sut.checkIfCorrect(10, 15);
        assertEquals(expected, actual);
    }

    @Test
    public void testWrongTooLow(){
        String expected = "Wrong number, it's too low!";
        String actual = sut.checkIfCorrect(10, 5);
        assertEquals(expected, actual);
    }

    @Test
    public void testCorrectNumber(){
        String expected = "You've guessed the right number!";
        String actual = sut.checkIfCorrect(10, 10);
        assertEquals(expected, actual);
    }

}
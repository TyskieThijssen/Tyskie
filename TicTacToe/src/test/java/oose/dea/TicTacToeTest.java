package oose.dea;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tyskie on 3/3/17.
 */
public class TicTacToeTest {
    TicTacToe sut;

    @Before
    public void setUp(){
        sut = new TicTacToe();
    }

    @Test
    public void testValidTurn(){
        boolean expected = true;
        boolean actual = sut.setMove(1, 1, "X");
        assertEquals(expected, actual);
    }

    @Test
    public void testInvalidTurn(){
        boolean expected = false;
        sut.setMove(1, 1, "X");
        boolean actual = sut.setMove(1, 1, "O");
        assertEquals(expected, actual);
    }

}
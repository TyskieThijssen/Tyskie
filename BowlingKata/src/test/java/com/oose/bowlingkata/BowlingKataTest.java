package com.oose.bowlingkata;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Thijs on 10-2-2017.
 */
public class BowlingKataTest {
    BowlingKata sut;

    @Before
    public void setUp() throws Exception {
        sut = new BowlingKata();
    }

    private void rollMany(int n, int pins){
        for(int i = 0; i < n; i++){
            sut.roll(pins);
        }
    }

    @Test
    public void testGutterGame() throws Exception {
        rollMany(20, 0);
        assertEquals(0, sut.score());
    }

    @Test
    public void testAllOnes() throws Exception {
        rollMany(20, 1);
        assertEquals(20, sut.score());
    }

    @Test
    public void testOnSpare() throws Exception {
        rollSpare();
        sut.roll(3);
        rollMany(17, 0);
        assertEquals(16, sut.score());
    }

    @Test
    public void testOneStrike() throws Exception {
        rollStrike(10); // strike
        sut.roll(3);
        sut.roll(4);
        rollMany(16,0);
        assertEquals(24, sut.score());
    }

    @Test
    public void testPerfectGame() throws Exception {
        rollMany(12,10);
        assertEquals(300, sut.score());
    }

    private void rollStrike(int pins) {
        sut.roll(10);
    }

    private void rollSpare() {
        sut.roll(5);
        sut.roll(5); //spare
    }
}
package OOSE.DEA.TDD;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Tyskie on 10-2-2017.
 */
public class CokeMachineTest {
    @Test
    public void testMachineVoorraad(){
        CokeMachine sut = new CokeMachine();
        sut.setVoorraad(10);

        int expected = 10;
        int actual = sut.getVoorraad();

        assertEquals(expected, actual);
    }
}
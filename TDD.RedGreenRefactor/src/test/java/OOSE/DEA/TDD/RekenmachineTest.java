package OOSE.DEA.TDD;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RekenmachineTest {
    @Test
    public void testMultiply(){
        Rekenmachine sut = new Rekenmachine();
        int expected = 20;
        int actual = sut.multiply(10, 2);

        assertEquals(expected, actual);
    }

    @Test
    public void testSubtraction(){
        Rekenmachine sut = new Rekenmachine();
        int expected = 20;
        int actual = sut.subtract(30, 10);

        assertEquals(expected, actual);
    }

    @Test
    public void testAddition(){
        Rekenmachine sut = new Rekenmachine();
        int expected = 20;
        int actual = sut.add(10, 10);

        assertEquals(expected, actual);
    }

    @Test
    public void testDevision(){
        Rekenmachine sut = new Rekenmachine();
        int expected = 20;
        int actual = sut.divide(200, 10);

        assertEquals(expected, actual);
    }
}
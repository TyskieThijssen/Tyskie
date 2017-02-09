package OOSE.DEA.TDD;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RekenmachineTest {
    @Test
    public void testMultiplyWholeNumbers(){
        Rekenmachine sut = new Rekenmachine();
        double expected = 20;
        double actual = sut.multiply(10, 2);

        assertEquals(expected, actual,1);
    }

    @Test
    public void testMultiplyHalfNumbers(){
        Rekenmachine sut = new Rekenmachine();
        double expected = 35;
        double actual = sut.multiply(3.5, 10);
        assertEquals(expected, actual,1);
    }

    @Test
    public void testSubtraction(){
        Rekenmachine sut = new Rekenmachine();
        double expected = 20;
        double actual = sut.subtract(30, 10);

        assertEquals(expected, actual,1);
    }

    @Test
    public void testAddition(){
        Rekenmachine sut = new Rekenmachine();
        double expected = 20;
        double actual = sut.add(10, 10);

        assertEquals(expected, actual,1);
    }

    @Test
    public void testDevision(){
        Rekenmachine sut = new Rekenmachine();
        double expected = 20;
        double actual = sut.divide(200, 10);

        assertEquals(expected, actual, 1);
    }
}
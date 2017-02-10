package OOSE.DEA;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest {
    @Test
    public void testAddEmpty(){
        App sut = new App();

        int expected = 0;
        int actual = sut.Add("");
        assertEquals(expected, actual);
    }

    @Test
    public void testAddOneNumber(){
        App sut = new App();

        int expected = 5;
        int actual = sut.Add("5");
        assertEquals(expected, actual);
    }

    @Test
    public void testAddTwoNumbers(){
        App sut = new App();

        int expected = 10;
        int actual = sut.Add("5,5");
        assertEquals(expected, actual);
    }

    @Test
    public void testAddSixNumbers(){
        App sut = new App();

        int expected = 6;
        int actual = sut.Add("1,1,1,1,1,1");
        assertEquals(expected, actual);
    }

    @Test
    public void testAddThreeNumbersWithNewLine(){
        App sut = new App();

        int expected = 6;
        int actual = sut.Add("1\n2,3");
        assertEquals(expected, actual);
    }

    @Test
    public void testAddInvalidNewLine(){
        App sut = new App();

        int expected = 1;
        int actual = sut.Add("1,\n");
        assertEquals(expected, actual);
    }
}

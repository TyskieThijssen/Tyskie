package OOSE.DEA.TDD;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest {
    @Test
    public void testSubtraction(){
        App sut = new App();
        int expected = 20;
        int actual = sut.subtract(30, 10);

        assertEquals(expected, actual);
    }
}
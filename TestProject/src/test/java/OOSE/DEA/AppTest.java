package OOSE.DEA;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    public void testApp(){
        App sut = new App();
        int expected = 20;
        int actual = sut.doSomething(10, 2);
        assertEquals(expected, actual);
    }
}

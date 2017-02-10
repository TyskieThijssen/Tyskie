package OOSE.DEA;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test(expected = DivideBySeroExecpetion.class)
    public void testDivideByZero() throws DivideBySeroExecpetion{
        App sut = new App();
        sut.divide(10, 0);
    }
}

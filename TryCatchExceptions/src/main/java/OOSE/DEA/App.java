package OOSE.DEA;

import java.util.EmptyStackException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws DivideBySeroExecpetion, Exception {
        App app = new App();
        int num1 = 10;
        int num2 = 0;
        int result = app.divide(num1, num2);
        System.out.println(result);
    }

    public int divide(int x, int y)  throws DivideBySeroExecpetion{

        if (y == 0) {
            throw new DivideBySeroExecpetion();
        }
        int result = 0;

        return result;
    }
}
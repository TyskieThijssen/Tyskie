package OOSE.DEA.TDD;

/**
 * Hello world!
 *
 */
public class Rekenmachine
{
    public static void main( String[] args )
    {
        Rekenmachine app = new Rekenmachine();
        int firstValue = 10;
        int secondValue = 5;

        int total = app.multiply(firstValue, secondValue);
        System.out.println("The total of the two numbers is: " + total);
    }

    public int multiply(int x, int y) {
        return x * y;
    }

    public int subtract(int x, int y) {
        return x - y;
    }

    public int add(int x, int y) {
        return x + y;
    }

    public int divide(int x, int y) {
        return x / y;
    }
}

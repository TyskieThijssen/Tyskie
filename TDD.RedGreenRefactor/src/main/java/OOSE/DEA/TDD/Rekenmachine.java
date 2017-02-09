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
        double firstValue = 10;
        double secondValue = 5;

        double total = app.multiply(firstValue, secondValue);
        System.out.println("The total of the two numbers is: " + total);
    }

    public double multiply(double x, double y) {
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

package OOSE.DEA.TDD;

/**
 * Hello world!
 *
 */
public class Rekenmachine
{
    public static void main( String[] args ) {
        Rekenmachine app = new Rekenmachine();
        double firstValue = 10;
        double secondValue = 5;

        double total = app.multiply(firstValue, secondValue);
        System.out.println(firstValue + " * " + secondValue + " has a total value of: " + total);
    }

    public double multiply(double x, double y) {
        return x * y;
    }

    public double subtract(double x, double y) {
        return x - y;
    }

    public double add(double x, double y) {
        return x + y;
    }

    public double divide(double x, double y) {
        return x / y;
    }
}

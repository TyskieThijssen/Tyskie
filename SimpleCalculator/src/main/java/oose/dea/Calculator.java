package oose.dea;

/**
 * Created by tyskie on 2/18/17.
 */
public class Calculator {
    public int add(String x, String y) throws IllegalArgumentException {
        int first;
        int second;

        if(x.isEmpty()){
            first = 0;
        } else {
            first = Integer.parseInt(x);
        }

        if(y.isEmpty()) {
            second = 0;
        } else {
            second = Integer.parseInt(y);
        }

        return first + second;
    }

    public int subtract(String x, String y) throws IllegalArgumentException {
        int first;
        int second;

        if(x.isEmpty()){
            first = 0;
        } else {
            first = Integer.parseInt(x);
        }

        if(y.isEmpty()){
            second = 0;
        } else {
            second = Integer.parseInt(y);
        }

        return first - second;
    }

    public int multiply(String x, String y) {
        int first;
        int second;

        if(x.isEmpty()){
            first = 0;
        } else {
            first = Integer.parseInt(x);
        }

        if(y.isEmpty()){
            second = 0;
        } else {
            second = Integer.parseInt(y);
        }

        return first * second;
    }

    public int divide(String x, String y) {
        int first = Integer.parseInt(x);
        int second = Integer.parseInt(y);

        return first / second;
    }
}

package oose.dea;

/**
 * Created by Thijs on 14-2-2017.
 */
public class StringKata {
    public int sum(String num1, String num2) throws NumberFormatException {
        int first;
        int second;

        first = checkIfValid(num1);
        second = checkIfValid(num2);

        return first + second;
    }

    private int checkIfValid(String num) {
        int result;
        if(num.isEmpty()){
            result = 0;
        } else {
            try {
                result = Integer.parseInt(num);
            } catch (NumberFormatException e){
                result = 0;
            }
        }
        return result;
    }
}

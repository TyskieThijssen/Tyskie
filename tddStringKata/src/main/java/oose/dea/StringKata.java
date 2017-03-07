package oose.dea;

/**
 * Created by tyskie on 3/2/17.
 */
public class StringKata {
    public int add(String numbers) {
        if(numbers.isEmpty()){
            return 0;
        }

        if(numbers.length() == 1){
            return Integer.parseInt(numbers);
        }

        String[] parts = numbers.split(",");

        int total = 0;

        for(int i = 0; i < parts.length; i++){
            int addNumber = Integer.parseInt(parts[i]);
            total += addNumber;
        }

        return total;
    }
}

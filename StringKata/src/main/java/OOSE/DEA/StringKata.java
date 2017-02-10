package OOSE.DEA;

/**
 * Created by Thijs on 10-2-2017.
 */
public class StringKata {
    public int Add(String numbers) {
        if(numbers.isEmpty()){
            return 0;
        }

        if(numbers.length() == 1){
            return Integer.parseInt(numbers);
        }

        int total = 0;

        String result = numbers.replaceAll("\n", ",");

        String[] parts = result.split(",");
        for (int i = 0; i < parts.length; i++) {
            int addNumber = Integer.parseInt(parts[i]);
            if(addNumber < 0){
                throw new IllegalArgumentException("Negatives not allowed! " + addNumber);
            }
            total += addNumber;
        }

        return total;
    }
}

package oose.dea;

/**
 * Created by Thijs on 14-2-2017.
 */
public class StringKata {
    public int add(String numbers) throws IllegalArgumentException {
        int result = 0;
        if(numbers.isEmpty()){
            result = 0;
        } else if(numbers.length() == 1){
            result = Integer.parseInt(numbers);
        } else {
            String replacedString = numbers.replaceAll("\n",",");
            String[] parts = replacedString.split(",");
            for(int i = 0; i < parts.length; i++){
                int addNumber = Integer.parseInt(parts[i]);
                if(addNumber < 0){
                    throw new IllegalArgumentException("Negatives are not allowed! " + addNumber);
                }
                result += addNumber;
            }
        }
        return result;
    }
}

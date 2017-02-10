package OOSE.DEA;

/**
 * Hello world!
 *
 */
public class App 
{
    public int Add(String numbers) {
        if(numbers.isEmpty()){
            return 0;
        }

        if(numbers.length() == 1){
            return Integer.parseInt(numbers);
        }

        String result = numbers.replaceAll("\n", ",");

        int total = 0;

        String[] parts = result.split(",");
        for(int i = 0; i < parts.length; i++){
            String addNumber = parts[i];
            total += Integer.parseInt(addNumber);
        }

        return total;
    }
}
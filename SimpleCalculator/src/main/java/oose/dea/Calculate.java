package oose.dea;

import java.util.Scanner;

/**
 * Created by tyskie on 2/18/17.
 */
public class Calculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("Welcome to my simple calculator!");
        System.out.print("Please enter your name: ");
        String username = scanner.nextLine();
        System.out.println("Welcome, " + username);

        boolean play = true;

        while(play) {
            System.out.println("");
            System.out.println("Choose between: add, subtract, multiply and divide");
            System.out.print("Choice: ");
            String mode = scanner.nextLine();
            System.out.print("Your first number: ");
            String first = scanner.nextLine();
            System.out.print("Your second number: ");
            String second = scanner.nextLine();
            try {
                int result;
                if (mode.equalsIgnoreCase("add")) {
                    result = calculator.add(first, second);
                    System.out.println(first + " + " + second + " = " + result);
                } else if (mode.equalsIgnoreCase("subtract")) {
                    result = calculator.subtract(first, second);
                    System.out.println(first + " - " + second + " = " + result);
                } else if (mode.equalsIgnoreCase("multiply")) {
                    result = calculator.multiply(first, second);
                    System.out.println(first + " * " + second + " = " + result);
                } else if (mode.equalsIgnoreCase("divide")) {
                    try {
                        result = calculator.divide(first, second);
                        System.out.println(first + " / " + second + " = " + result);
                    } catch (ArithmeticException e) {
                        System.out.println("You cannot divide by zero!");
                    }
                } else {
                    System.out.println("Invalid mode!");
                }
            } catch (IllegalArgumentException e){
                System.out.println("Please only enter numbers!");
            }
            System.out.println("");

            boolean exit = false;

            while(exit == false){
                System.out.print("Do you want to use the calculator again? Yes/No: ");
                String playAgain = scanner.nextLine();

                if(playAgain.equalsIgnoreCase("yes")){
                    exit = true;
                } else if(playAgain.equalsIgnoreCase("no")){
                    exit = true;
                    play = false;
                    System.out.println("Thanks for using my simple calculator!");
                }
            }
        }
    }
}

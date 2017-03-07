package thuis.fun;

import java.util.ArrayList;

/**
 * Created by tyskie on 2/23/17.
 */
public class TheTwelveDaysOf {
    private static String[] inputs = {"Partridge in a Pear Tree", "Turtle Doves",
                                    "French Hens", "Calling Birds", "Golden Rings",
                                    "Geese a Laying", "Swans a Swimming", "Maids a Milking",
                                    "Ladies Dancing", "Lords a Leaping", "Pipers Piping",
                                    "Drummers Drumming"};

    private static String[] days = {"first", "second", "third", "fourth", "fifth", "sixth",
                                    "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth"};

    private static String[] amounts = {"a", "two", "three", "four", "five", "six",
                                        "seven", "eight", "nine", "ten", "eleven", "twelve"};

    private static ArrayList<String> used;

    public static void main(String[] args) {
        for(int day = 0; day < days.length; day++) {
            System.out.println("On the " + days[day] + " day of Christmas");
            System.out.println("my true love sent to me:");
            int previous = day;
            for (int input = 0; input <= day; input++) {
                System.out.println(amounts[input] + " " + inputs[input]);
            }
            System.out.println("");
        }
    }
}

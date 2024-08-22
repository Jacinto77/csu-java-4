

/*
Option #1: Looping Construct with Floating Point Numbers

Write a program that utilizes a while-loop to read a set of five floating-point values from user input.
Include code to prevent an endless loop. Ask the user to enter the values, then print the following data:

    Total
    Average
    Maximum
    Minimum
    Interest on total at 20%

Compile and submit your pseudocode, source code, and screenshots of the application executing the application,
the results and GIT repository in a single document.

*/

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // scanner for user input
        Scanner input = new Scanner(System.in);

        // list of double values
        ArrayList<Double> values = new ArrayList<>();

        // while loop counter
        int counter = 0;

        // get input from user
        while (counter < 5){
            Double userInput = input.nextDouble();
            values.add(userInput);
            counter += 1;
        }

        // variables for use in next loop
        double total = 0;
        double max = 0;
        double min = 0;
        // for loop based on size of list
        for (double value : values) {
            // running count of total
            total += value;
            // checking for max value
            if (value > max) {
                max = value;
            }
            // checking for min value
            if (value < min) {
                min = value;
            }

        }
        // display results
        System.out.println(total);
        // calculate average
        System.out.println(total / 5);
        System.out.println(max);
        System.out.println(min);
        // calculate additional 20% on total
        System.out.println( total + ( total * 0.20 ));
    }
}
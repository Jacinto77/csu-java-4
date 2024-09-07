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

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // scanner for user input
        Scanner input = new Scanner(System.in);

        // list of double values
        ArrayList<Double> values = new ArrayList<>();

        // while loop counter
        int counter = 0;

        System.out.println("This program will take in 5 floating point numbers, then output calculations on those values.");

        // get input from user
        while (counter < 5){
            System.out.println("Enter number " + (counter + 1) + ": ");
            System.out.print("> ");
            Double userInput = input.nextDouble();
            values.add(userInput);
            counter += 1;
        }

        // variables for use in next loop
        double total = 0;
        double max = values.get(0);
        double min = values.get(0);
        // for loop based on size of list to find the minimum and maximum values, and sum of all values
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
        System.out.println();
        System.out.println("Total: " + total);
        // calculate average
        System.out.println("Average: " + total / 5);
        System.out.println();
        // maximum
        values.sort(Comparator.reverseOrder());
        System.out.println("Maximum: " + max);
        System.out.println(values);
        System.out.println();
        // minimum
        values.sort(Comparator.naturalOrder());
        System.out.println("Minimum: " + min);
        System.out.println(values);
        System.out.println();

        // calculate additional 20% on total
        double twentyPercent = total + total * 0.2;
        System.out.println("20% interest on top of Total: " + twentyPercent);
        System.out.println(total + " + ( " + total + " * 0.20 ) = " + twentyPercent);
    }
}
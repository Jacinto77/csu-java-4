

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

public class Main {
    public static void main(String[] args) {
        // while loop counter
        int counter = 0;
        // scanner for user input
        Scanner input = new Scanner(System.in);
        // list of double values
        double[] list = new double[5];

        // get input from user
        while (counter < 5){
            double userInput = input.nextDouble();
            list[counter] = userInput;
            counter += 1;
        }

        // variables for use in next loop
        double total = 0;
        double max = 0;
        double min = 0;
        // for loop based on size of list
        for (int i = 0; i < list.length; i += 1) {
            // running count of total
            total += list[i];
            // checking for max value
            if (list[i] > max) {
                max = list[i];
            }
            // checking for min value
            if (list[i] < min){
                min = list[i];
            }

        }
        // display results
        System.out.println(total);
        System.out.println(total / 5);
        System.out.println(max);
        System.out.println(min);
        // calculate additional 20% on total
        System.out.println( total + ( total * 0.20 ));
    }
}
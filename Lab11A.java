//Class: CSE 1321L
//Section:WJ1 JAVA
//Term: FALL 2021
//Instructor: Enda Sullivan
//Name: Kristin Brewer
//Lab#: 11A
//Let's step back a bit...

import java.util.Scanner;

public class Lab11A   //Program that asks the user for three numbers?//
{   //Main Method
    public static void main(String[] args)
    {
        Scanner keyboardInput = new Scanner(System.in);

        //Prompts user for input, reads input, initializes variables
        System.out.print("Enter number 1: ");
        double num1 = keyboardInput.nextDouble();
        System.out.print("Enter number 2: ");
        double num2 = keyboardInput.nextDouble();

        System.out.println("Min is " + (int)min(num1, num2));
        System.out.println("Max is " + (int)max(num1, num2));
        System.out.println("Average is " + (int)average(num1, num2));
    }

    //min value method
    public static double min(double x, double y)
    {
        double min = Math.min(x, y);
        return min;
    }

    //max value method
    public static double max(double x, double y)
    {
        double max = Math.max(x, y);
        return max;
    }

    //average of values method
    public static double average(double x, double y)
    {
        double average = (x + y) / (double)2;
        return average;
    }
}
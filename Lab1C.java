//Class: CSE 1321L
//Section:WJ1 JAVA
//Term: FALL 2021
//Instructor:Maneesha Kumari Penmetsa
//Name: Kristin Brewer
//Lab: 1C
// Demonstrate the use of the Scanner class to read numeric data.

import java.util.Scanner;

public class Lab1C {
    // Calculates fuel efficiency based on values entered by the user.
    public static void main (String[] args)
    {
        int miles;
        double gallons, mpg;
        Scanner input = new Scanner(System.in);
        System.out.print ("Enter the number of miles: ");
        miles = input.nextInt();

        System.out.print ("Enter the gallons of fuel used: ");
        gallons = input.nextDouble();

        mpg = miles / gallons;
        System.out.println ("Miles Per Gallon: " + mpg);
    }
}

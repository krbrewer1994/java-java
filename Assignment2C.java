//Class: CSE 1321L
//Section:WJ1 JAVA
//Term:FALL 2021
//Instructor:Maneesha Kumari Penmetsa
//Name: Kristin Brewer
//Assignment: 2C
//Currency Conversion

import java.util.Scanner;

public class Assignment2C {
    public static void main(String[] args) {
        //Covering currency in the land of Bisonica between US Dollars and Bison Dollars
        Scanner keyboardInput = new Scanner(System.in);

        //Initializing constant variables
        float BISON_DOLLAR = 5;
        float US_DOLLAR = 0.73f;

        //Prompting user for input, reading input, initializing variable
        System.out.println("Welcome to Bisonica!");
        System.out.print("How many US Dollars do you have? ");
        float usDollars = keyboardInput.nextFloat();

        //Calculations
        float britishP = usDollars*US_DOLLAR;
        float bisonDollar = britishP/BISON_DOLLAR;

        //Output
        System.out.print((int) usDollars + " US Dollar(s) is " + britishP + " British Pounds(s),\nwhich is " +
                 bisonDollar + " Bison Dollar(s)!");

    }
}

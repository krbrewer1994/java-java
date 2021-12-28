//Class: CSE 1321L
//Section:WJ1 JAVA
//Term:Fall 2021
//Instructor: Maneesha Kumari Penmetsa
//Name: Kristin Brewer
//Lab#: 2B
//Credit card calculator

import java.util.Currency;
import java.util.Scanner;

public class Lab3A {
    public static void main (String [] args)
    {
        Scanner keyboardInput = new Scanner(System.in);

        //Prompting user, reading input, initializing
        System.out.print("Amount owed: $");
        float currentBalance = keyboardInput.nextFloat();
        System.out.print("ARP: ");
        float annualPercent= keyboardInput.nextFloat();

        //Calculating Minimum Payment and Monthly Percent Rate
        float monthlyPercentRate = annualPercent/12;
        float minPayment = (currentBalance*annualPercent)/12/100;

        //Output
        System.out.println("Monthly percentage rate: " + monthlyPercentRate);
        System.out.println("Minimum payment: $" + minPayment);
    }
}

//Class: CSE 1321L
//Section:WJ1 JAVA
//Term:FALL 2021
//Instructor:Maneesha Kumari Penmetsa
//Name: Kristin Brewer
//Assignment: 1B
// Whats your integrity worth?

import java.util.Scanner;

public class Assignment1B {
    public static void main(String[] args) {

        Scanner keyboardInput = new Scanner(System.in);

        //Initialization
        int weeklySubscriptionFee;
        int numberOfPayingCustomers;
        int profitPerWeek;
        int profitPerYr;

        //Prompt for user input and read
        System.out.print("Enter the weekly subscription fee:  ");
        weeklySubscriptionFee= keyboardInput.nextInt();

        System.out.print("Enter the number of customers: ");
        numberOfPayingCustomers = keyboardInput.nextInt();

        //Calculate conversion
        profitPerWeek = weeklySubscriptionFee * numberOfPayingCustomers;
        profitPerYr = 52 * profitPerWeek;

        //Output
        System.out.println("The company earns $" + profitPerWeek + " each week.");
        System.out.println("This company earns $" + profitPerYr + " each year.");
    }
}


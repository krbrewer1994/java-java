//Class: CSE 1321L
//Section:WJ1 JAVA
//Term:Fall 2021
//Instructor:Maneesha Kumari Penmetsa
//Name: Kristin Brewer
//Lab#: 2B
//Coins

import java.util.Scanner;

public class Lab3C {
    public static void main (String[] args) {

        Scanner keyboardInput = new Scanner(System.in);

        //Prompt user, read input, initialize
        System.out.print("Enter the number of quarters: ");
        int quarters = keyboardInput.nextInt();
        System.out.print("Enter the number of dimes: ");
        int dimes = keyboardInput.nextInt();
        System.out.print("Enter the number of nickels: ");
        int nickels = keyboardInput.nextInt();
        System.out.print("Enter the number of pennies: ");
        int pennies = keyboardInput.nextInt();

        //Evaluating whole dollar and sum
        int totalQuarters = quarters*25/100;
        int totalDimes = dimes*10/100;
        int totalNickels = nickels*5/100;
        int totalPennies = pennies/100;
        int dollars = totalQuarters + totalDimes + totalNickels +totalPennies;

        //Evaluating remainder and sum
        int remainderQ = quarters*25%100;
        int remainderD = dimes*10%100;
        int remainderN = nickels*5%100;
        int remainderP = pennies%100;
        int addedDollars = (remainderQ + remainderD + remainderN + remainderP)/100;
        int totalRemainder = (remainderQ + remainderD + remainderN + remainderP)%100;

        //Adding remainder sum to whole dollar sum
        int totalDollars = dollars + addedDollars;

        //Output
        System.out.println("\nYou entered " + quarters + " quarters.");
        System.out.println("You entered " + dimes + " dimes.");
        System.out.println("You entered " + nickels + " nickels.");
        System.out.println("You entered " + pennies + " pennies. \n");
        System.out.println("Your total is " + totalDollars + " dollars and " + totalRemainder + " cents." );
    }
}

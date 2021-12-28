//Class: CSE 1321L
//Section:WJ1 JAVA
//Term: FALL2021
//Instructor: Maneesha Penmetsa
//Name: Kristin Brewer
//Lab#: 6C
//Cha-Ching use a do-while loop (sentinel loop)

import java.util.Scanner;

public class Lab6C {
    public static void main(String[] args) {

        Scanner keyboardInput = new Scanner(System.in);

        //Initializing variables
        int deposit;
        int withdraw = 0;
        int balance = 1000;
        int menuSelection;
        char returnToMenu;

        System.out.println("Welcome!\nYou have $" + balance + " in your account.\n");

        //Loop to print welcome menu once
        do {
            System.out.print("Menu\n0 - Make a deposit\n1 - Make a withdrawal\n2 - Display account value\n");

            System.out.print("\nPlease make a selection: ");
            menuSelection = keyboardInput.nextInt();


                //Switch statement for bank menu selection
                switch (menuSelection) {
                    case 0://Make a deposit
                        System.out.print("How much would you like to deposit? : ");
                        deposit = keyboardInput.nextInt();
                        balance = deposit + balance;
                        System.out.println("Your current balance is $" + balance);
                        break;
                    case 1://Make a withdraw
                        System.out.print("How much would you like to withdraw? : ");
                        withdraw = keyboardInput.nextInt();
                        balance = balance - withdraw;
                        System.out.println("Your current balance is $" + balance);
                        break;
                    case 2://Display account value
                        System.out.print("Your current balance is $" + balance + "\n");
                        break;
                    default://For invalid menu selections
                        System.out.println("Invalid entry, please try again.");
                }

                //Prompt asking user to return to menu
                System.out.print("Would you like to return to the main menu (Y/N)? : ");
                returnToMenu = keyboardInput.next().charAt(0);
                System.out.println();

        //Loop returning to main menu
        } while (Character.toLowerCase(returnToMenu) == 'y');

        System.out.println("Thank you for banking with us!");
    }
}
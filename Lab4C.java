//Class: CSE 1321L
//Section:WJ1 JAVA
//Term: FALL 2021
//Instructor: Maneesha Penmetsa
//Name: Kristin Brewer
//Lab#: 4C
//Creating a menu using a switch statement

import java.util.Scanner;

public class Lab4C {
    public static void main(String[] args) {

        Scanner keyboardInput = new Scanner(System.in);

        //Welcome message prompting input user to input a number
        System.out.print("Welcome!"+ "\n");
        System.out.print("Please input a number: ");
        float num = keyboardInput.nextFloat();

        //Prompting user to input a number related to the transformation of previous number inputted
        System.out.println("\nWhat would you like to do to this number:");
        System.out.println("0- Get the additive inverse of the number");
        System.out.println("1- Get the reciprocal of the number");
        System.out.println("2- Square the number");
        System.out.println("3- Cube the number");
        System.out.println("4- Exit the program" + "\n");
        int menuNum = keyboardInput.nextInt();

        //Calculations for number transformations
        float additiveIn = -num;
        float reciprocal = 1/num;
        float square = num*num;
        float cube = num*num*num;

        //Output based on menu transformation selection
        switch (menuNum) {
            case 0:
                System.out.println("\nThe additive inverse of " + num + " is " + additiveIn);
                break;
            case 1:
                System.out.println("\nThe reciprocal of " + num + " is " + reciprocal);
                break;
            case 2:
                System.out.println("\nThe square of " + num + " is " + square);
                break;
            case 3:
                System.out.println("\nThe cube of " + num + " is " + cube);
                break;
            case 4:
                System.out.println("\nThank you, goodbye!");
                break;
            default:
                System.out.println("\nInvalid input, please try again!");
        }

    }
}

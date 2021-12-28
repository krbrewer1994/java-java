//Class: CSE 1321L
//Section:WJ1 JAVA
//Term: FALL2021
//Instructor: Maneesha Penmetsa
//Name: Kristin Brewer
//Lab#: 6A
//Largest of 10

import java.util.Scanner;

public class Lab6A {
    public static void main(String[] args) {

        Scanner keyboardInput = new Scanner(System.in);

        System.out.println("Please enter 10 numbers and this program will display the largest. \n");

        //Initializing variables
        int value;
        int biggestValue = 0;

        //Loop to print prompt, read input, and initialize value
        for (int i = 1; i <= 10; i++) {
            System.out.print("Please enter number " + i + ": ");
            value = keyboardInput.nextInt();

            //Loop comparing values to find largest
            if (value > biggestValue)
            {
                biggestValue = value;
            }
        }
        System.out.println("\n" + "The largest number was " + biggestValue);
    }
}

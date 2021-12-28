//Class: CSE 1321L
//Section:WJ1 JAVA
//Term:FALL 2021
//Instructor:Maneesha Kumari Penmetsa
//Name: Kristin Brewer
//Lab: 1B
// Demonstrate reading a string from the user.

import java.util.Scanner;

public class Lab1B {
    // Reads a character string from the user and prints it.
    public static void main (String[] args) {
        String message;
        Scanner input = new Scanner(System.in);
        System.out.print ("Enter a line of text:");
        message = input.nextLine();
        System.out.println ("You entered: \"" + message + "\"");
    }

}

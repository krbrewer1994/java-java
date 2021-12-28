//Class: CSE 1321L
//Section:WJ1 JAVA
//Term:FALL 2021
//Instructor:Maneesha Kumari Penmetsa
//Name: Kristin Brewer
//Assignment: 1C
// Pick your stage name!

import java.util.Scanner;

public class Assignment1C {
    public static void main(String[] args) {

        Scanner keyboardInput = new Scanner(System.in);

        //Prompt user for input, read input, initialize
        System.out.print("Enter the name of the street you live on: ");
        String street = keyboardInput.next();

        System.out.print("Enter the name of your favorite color: ");
        String color = keyboardInput.next();

        System.out.print("Enter the name of your favorite food: ");
        String food = keyboardInput.next();

        //Output
        System.out.println("Your stage name is " + food + " " + color + " " + street + "!");
    }
}

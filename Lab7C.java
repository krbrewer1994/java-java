//Class: CSE 1321L
//Section:WJ1 JAVA
//Term: FALL2021
//Instructor: Maneesha Penmetsa
//Name: Kristin Brewer
//Lab#: 7C
//Right-Triangle (Left) use nested for loop

import java.util.Scanner;

public class Lab7C {
    public static void main(String[] args) {

        Scanner keyboardInput = new Scanner(System.in);

        //Prompting user for right-triangle dimensions, reading input, initializing variable
        System.out.print("Please enter a value for the size: ");
        int size = keyboardInput.nextInt();
        System.out.println("This is the requested " + size + "x" + size + " right-triangle:");

        //Loop creating a blank right-triangle
        for (int i = 1; i <= size; i++) {        //row
            for (int j = i; j <= size; j++) {    //column
                System.out.print(" ");
            }
            //Loop creating left right triangle with asterisks
            for (int j = 1; j <= i; j++) {       //column
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

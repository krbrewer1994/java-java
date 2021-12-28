//Class: CSE 1321L
//Section:WJ1 JAVA
//Term: FALL2021
//Instructor: Maneesha Penmetsa
//Name: Kristin Brewer
//Lab#: 7A
//Warming-up use nested for-loop

import java.util.Scanner;

public class Lab7A {
    public static void main(String[] args) {

        Scanner keyboardInput = new Scanner(System.in);

        //Prompting user for box dimensions, reading input, initializing variable
        System.out.print("Please enter a value for the size: ");
        int size = keyboardInput.nextInt();
        System.out.println("This is the requested " + size + "x" + size + " box:");

        //Loop creating a rectangle from user input of dimensions
        for (int i = 1; i <= size; i++) {       //row
            for (int j = 1; j <= size; j++) {   //columns
                System.out.print("*");
            }
            System.out.println();
        }
    }
}




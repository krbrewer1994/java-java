//Class: CSE 1321L
//Section:WJ1 JAVA
//Term: SUMMER2021
//Instructor: Maneesha Penmetsa
//Name: Kristin Brewer
//Lab#: 7B
//Right-Triangle (Right) use nested for loop

import java.util.Scanner;

public class Lab7B {
    public static void main(String[] args) {

        Scanner keyboardInput= new Scanner(System.in);

        //Prompting user for right-triangle dimensions, reading input, initializing variable
        System.out.print("Please enter a value for the size: ");
        int size = keyboardInput.nextInt();
        System.out.println("This is the requested " + size + "x" + size + " right-triangle:");

        //Loop creating a right-triangle from user input of dimensions
        for (int i = 1; i <= size; i++) {   //row
            for (int j = 1; j <= i; j++) {  //column
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


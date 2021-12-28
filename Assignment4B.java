//Class: CSE 1321L
//Section:WJ1 JAVA
//Term: FALL2021
//Instructor: Maneesha Penmetsa
//Name: Kristin Brewer
//Assignment#: 4B
//Diamonds in the sky

import java.util.Scanner;

public class Assignment4B {
    //This program prints customizable diamond patterns to the screen
    public static void main(String[] args) {

        Scanner keyboardInput = new Scanner(System.in);

        //Prompting user for input, reading input, initializes variable
        System.out.print("Enter the diamond's width: ");
        int width = keyboardInput.nextInt();

        while (width < 3){
            System.out.println("Please enter a width of at least 3.");
            System.out.println("Enter the diamond's width: ");
            width = keyboardInput.nextInt();
        }

        if (width % 2 == 0) {
            width++;
            System.out.println("To make a diamond, we’ll use " + width + " as the width instead.\n");
            }
            print(width);
    }

    //Method to print diamond loop sequence
    public static void print(int width) {
        int spaces = 1;
        spaces = width -1;
        //Outer loop
        for (int i = 1; i <=width; i++) {
            //Loop for beginning space
            for (int j = 1; j <= spaces; j++)
                System.out.print(" ");
            spaces--;
            //Loop to print star rows
            for (int j = 1; j <= (2*i-1); j++)
                System.out.print("*");

            System.out.print("\n");

        }
        spaces = 1;
            //Reverse Outer loop
        for (int i = 1; i <= width; i++){
            //Loop for beginning space
            for (int j = 1; j <= spaces; j++)
            System.out.print(" ");
            spaces++;
            //Loop to print star rows
            for (int j = 1; j < 2*(width-i); j++){
            System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}


//Class: CSE 1321L
//Section:WJ1 JAVA
//Term: FALL 2021
//Instructor: Maneesha Kumari Penmetsa
//Name: Kristin Brewer
//Lab#: 2B
//Area and Perimeter

import java.util.Scanner;

public class Lab2C {//Program that reads the width and height from user
    // then calculates the area and perimeter of a rectangle
    public static void main(String[] args) {

        Scanner keyboardInput = new Scanner(System.in);

        //Prompt user, reads input, initializes varibles
        System.out.print("Enter a width: ");
        int w = keyboardInput.nextInt();
        System.out.print("Enter a height: ");
        int h = keyboardInput.nextInt();

        //Calculation for area and perimeter
        int a= w*h ;
        int p= 2*(w+h) ;

        //Output
        System.out.println("The area is " + a);
        System.out.println("The perimeter is " + p);
    }
}



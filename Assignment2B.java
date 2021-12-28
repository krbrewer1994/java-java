//Class: CSE 1321L
//Section:WJ1 JAVA
//Term:FALL 2021
//Instructor:Maneesha Kumari Penmetsa
//Name: Kristin Brewer
//Assignment: 2B
//Hit Boxes

import java.util.Scanner;

public class Assignment2B {
    //Program to calculate the four coordinates of a hit box based on user input
    public static void main(String[] args) {

        Scanner keyboardInput = new Scanner(System.in);

        //Prompt user for input, read input, initialize variable
        System.out.print("Enter the hit box top-left X coordinate: ");
        int xTopL = keyboardInput.nextInt();

        System.out.print("Enter the hit box top-left Y coordinate: ");
        int yTopL = keyboardInput.nextInt();

        System.out.print("Enter the width of the hit box: ");
        int width = keyboardInput.nextInt();

        System.out.print("Enter the height of the hit box: ");
        int height = keyboardInput.nextInt();

        //Calculations
        int xBottomL = xTopL;
        int yBottomL = xTopL;
        int xBottomR = width + xTopL;
        int yBottomR = xTopL;
        int xTopR = xBottomR;
        int yTopR = yTopL;

        //Output
        System.out.println("[Hit Box Coordinates]");
        System.out.println("Top-Left: " + xTopL + "," + yTopL);
        System.out.println("Bottom-Left: " + xBottomL + ", " + yBottomL);
        System.out.println("Top-Right: " + xTopR + ", " + yTopR);
        System.out.println("Bottom-Right: " + xBottomR + ", " + yBottomR);
    }
}

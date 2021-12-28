//Class: CSE 1321L
//Section:WJ1 JAVA
//Term: Fall2021
//Instructor: Maneesha Penmetsa
//Name: Kristin Brewer
//Lab#: 5C
//What's the point?

import java.util.Scanner;

public class Lab5C {
    public static void main(String[] args) {

        Scanner keyboardInput = new Scanner(System.in);

        //Prompting user for coordinates, reads input, initializes variables
        System.out.print("Enter x: ");
        int x = keyboardInput.nextInt();
        System.out.print("Enter y: ");
        int y = keyboardInput.nextInt();

        //Conditional states that determine which quadrant the coordinates lie
        if(x>0 && y>0) {
            System.out.println("This point is in the first quadrant."); }
        else if(x<0 && y>0) {
            System.out.println("This point is in the second quadrant."); }
        else if (x<0 && y<0) {
            System.out.println("This point is in the third quadrant."); }
        else if (x>0 && y<0){
            System.out.println("This point is in the fourth quadrant."); }
        else if (x==0 && y>0 || y<0) {
            System.out.println("This point is on the y axis.");}
        else  if (x>0 || x<0 && y==0) {
            System.out.println("This point is on the x axis."); }
        else if (x==0 && y==0) {
            System.out.println("This point is the origin."); }
        else {
            System.out.println("Invalid input");
        }
    }
}
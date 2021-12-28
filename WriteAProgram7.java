package src;
//Programming 1
//Exam 1
//Practice problems
//Write A Program Example
//Physics 101

import java.util.Scanner;

public class WriteAProgram7 {
    public static void main(String[] args) {

        Scanner keyboardInput = new Scanner(System.in);

        System.out.print("Please enter the velocity in miles per hour: ");
        int velocity = keyboardInput.nextInt();

        System.out.print("Please enter a time in hours: ");
        int time = keyboardInput.nextInt();

        int distance = velocity/time;

        System.out.println("The total distance the object has moved is " + distance + " miles.");
    }
}

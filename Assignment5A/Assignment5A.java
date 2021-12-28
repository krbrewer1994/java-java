package Assignment5A;
//Section:WJ1 JAVA
//Term: FALL 2021
//Instructor: Enda Sullivan
//Name: Kristin Brewer
//Assignment#: 5A
//This used to be entertainment

import java.util.Scanner;

public class Assignment5A {
    public static void main(String[] args) {

        Scanner keyboardInput = new Scanner(System.in);

        System.out.println("x: ");
        int xCoordinate = keyboardInput.nextInt();

        System.out.println("y:");
        int yCoordinate = keyboardInput.nextInt();

        System.out.println("x velocity:");
        int xVel = keyboardInput.nextInt();

        System.out.println("y velocity:");
        int yVel = keyboardInput.nextInt();

        System.out.println("Number of moves:");
        int numOfMoves = keyboardInput.nextInt();

        Ball ball = new Ball(xCoordinate,yCoordinate,xVel, yVel);

        for (int i = 0; i<numOfMoves; i++)
        {
            ball.move();
            ball.print();
        }
    }
}

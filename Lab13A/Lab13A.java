package Lab13A;//Class: CSE 1321L
//Section:WJ1 JAVA
//Term: FALL 2021
//Instructor: Enda Sullivan
//Name: Kristin Brewer
//Lab#: 13A
//A Tale of Two Classes

import java.util.Scanner;

public class Lab13A {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);

        System.out.println("You are about to create a chair.");

        System.out.print("How many legs does your chair have: ");
        int numOfLegs = keyboardInput.nextInt();

        System.out.print("Is your chair rolling (true/false): ");
        boolean roll = keyboardInput.nextBoolean();
        keyboardInput.nextLine();

        System.out.print("What is your chair made of: ");
        String material = keyboardInput.nextLine();

        Chair firstChair = new Chair(numOfLegs, material, roll);

        System.out.println();
        if (firstChair.roll) {
            System.out.println("Your chair has " + firstChair.numOfLegs + " legs, " + "is rolling," + " and " + "is made of " + firstChair.material + ".\n");
        } else {
            System.out.println("Your chair has " + firstChair.numOfLegs + " legs, " + "is not rolling," + " and " + "is made of " + firstChair.material + ".\n");
        }

        firstChair.numOfLegs = 4;
        firstChair.roll = false;
        firstChair.material = "wood";

        System.out.println("This program is going to change that.");

        System.out.println();
        if (firstChair.roll) {
            System.out.println("Your chair has " + firstChair.numOfLegs + " legs, " + "is rolling," + " and " + "is made of " + firstChair.material + ".\n");
        } else {
            System.out.println("Your chair has " + firstChair.numOfLegs + " legs, " + "is not rolling," + " and " + "is made of " + firstChair.material + ".\n");
        }
    }
}


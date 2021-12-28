//Class: CSE 1321L
//Section:WJ1 JAVA
//Term: FALL2021
//Instructor: Maneesha Penmetsa
//Name: Kristin Brewer
//Lab#: 6B
//Pick a number between 1 and 1000


import java.util.Scanner;

public class Lab6B {
    public static void main(String[] args) {

        Scanner keyboardInput = new Scanner(System.in);

        //Initializing variables
        int secretNum;
        int numofTries = 0;
        float guess;

        System.out.print("Enter a number between 1 and 1000: ");
        secretNum = keyboardInput.nextInt();

        //Loop incrementing number of guesses generated
        do {
            numofTries++;
            guess = (float) (Math.round((Math.random() * 1000) + 1));
            System.out.println("My guess was " + (int)guess);

        //Loop comparing random number generated to user input
        } while (guess != secretNum);

        System.out.println();
        System.out.println("I guessed the number was " + secretNum + " and it only took me " + numofTries + " guesses");
    }
}
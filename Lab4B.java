//Class: CSE 1321L
//Section:WJ1 JAVA
//Term: Fall 2021
//Instructor: Maneesha Penmetsa
//Name: Kristin Brewer
//Lab#: 4B
//Do I have class today?

import java.util.Scanner;

public class Lab4B {
    public static void main(String[] args) {

        Scanner keyboardInput = new Scanner(System.in);

        System.out.print("Enter the day: ");
        String dayOfWeek = keyboardInput.next();

        if (dayOfWeek.equals ("Monday") || dayOfWeek.equals ("monday") ||dayOfWeek.equals ("Wednesday")||dayOfWeek.equals ("wednesday")) {
            System.out.println("I have class today!");}

        else if (dayOfWeek.equals ("Friday") || dayOfWeek.equals ("friday")) {
            System.out.println("It's Friday! Friday! Gotta get down on Friday!");}

        else {
            System.out.println("I should use this time to do my homework.");}
    }
}

//Class: CSE 1321L
//Section:WJ1 JAVA
//Term: FALL 2021
//Instructor: Maneesha Kumari Penmetsa
//Name: Kristin Brewer
//Lab#: 2A
//Madlib

import java.util.Scanner;

public class Lab2A { //MadLib asking the user for a name, an adverb, and an adjective
    public static void main (String[] args)
    {
        Scanner keyboardInput = new Scanner(System.in);

        //Prompting user, reading input, initializing variable
        System.out.print("Enter a name: ");
        String name = keyboardInput.nextLine();
        System.out.print("Enter another name: ");
        String secondName = keyboardInput.nextLine();
        System.out.print("Enter a verb: ");
        String verb = keyboardInput.nextLine();
        System.out.print("Enter an adverb: ");
        String adverb = keyboardInput.nextLine();

        //Output
        System.out.println("Once upon a time, there was a person named " + name + " who had a child named\n"
                + secondName + ". This child would " + verb + " " + adverb + " while singing to strangers.");
    }
}

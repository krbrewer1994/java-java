//Class: CSE 1321L
//Section:WJ1 JAVA
//Term: FALL 2021
//Instructor: Maneesha Penmetsa
//Name: Kristin Brewer
//Assignment#: 3C
//Club Sign-ups!

import java.util.Scanner;

public class Assignment3C {
    //Program to suggest KSU club options based on user preferences
    public static void main(String[] args) {

        Scanner keyboard_input = new Scanner(System.in);

        //Prompting user to enter indoor or outdoor preference to a school club, reading response, initializing variable
        System.out.print("[KSU Club Suggestions]\nDo you want an indoor or outdoor club?: ");
        String environment = keyboard_input.next();

        //If statement to determine out put based on user response indoor/outdoor

        //For indoor options
        if(environment.equals("Indoor")){
            System.out.print("How much are you willing to pay in dues?: ");
            double dues = keyboard_input.nextDouble();
            if(dues < 5){
                System.out.println("You could join the Chess club!");}
            else{
                System.out.println("You could join the Virtual Reality club!");}
        }

        //For outdoor option
        else if (environment.equals("Outdoor")){
            System.out.print("How much are you willing to pay in dues?: ");
            double dues = keyboard_input.nextDouble();
            if(dues < 5){
                System.out.println("You could join the Running club!");}
            else{
                System.out.println("You could join the Medieval Combat Sports club!");}
        }

        //If neither option is chosen
        else {
            System.out.println("Sorry, that’s not a valid option.");
        }
    }
}

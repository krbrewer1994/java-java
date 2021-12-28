//Class: CSE 1321L
//Section:WJ1 JAVA
//Term:FALL 2021
//Instructor:Maneesha Kumari Penmetsa
//Name: Kristin Brewer
//Assignment: 2A
//What time is it?

import java.util.Scanner;

public class Assignment2A {
    //Program asking user for seconds then displays results in hours, minutes, and seconds
    public static void main(String[] args) {

        Scanner keyboardInput = new Scanner(System.in);

        //Prompting user for input, read input, initialize variable
        System.out.print("How much time has passed (in seconds)?: ");
        int seconds = keyboardInput.nextInt();

        System.out.println("Now converting...");

        //Calculations
        int hoursLeft = (seconds - seconds%3600)/3600 ;
        int minutesLeft = (seconds%3600 -seconds%3600%60)/60;
        int secondsLeft = seconds%3600%60;


        //Output
        System.out.println(seconds + " seconds is " + hoursLeft + " hour(s), " + minutesLeft + " minute(s), "
                + secondsLeft + " second(s).");
    }
}

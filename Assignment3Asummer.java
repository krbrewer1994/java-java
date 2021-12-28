//Class: CSE 1321L
//Section:WJ1 JAVA
//Term: SUMMER2021
//Instructor: Kaleigh Kendrick
//Name: Kristin Brewer
//Assignment#: 3A
//Warm-up: You need to know these things when you're a king

import java.util.Scanner;

public class Assignment3Asummer {
    public static void main(String[] args) {

        Scanner keyboardInput = new Scanner(System.in);

        //Prompting user, reading input, initialize
        System.out.print("What kind of swallow?");
        String kindOfSwallow = keyboardInput.next();

        //Conditional statement for African
        if (kindOfSwallow.equals("African")) {
            System.out.print("Yes, it could grip it by the husk.");
        }
        //Conditional state for European or other
        if (kindOfSwallow.equals("European")) {
        System.out.print("A five-ounce bird could not carry a one-pound coconut."); }
        else {
            System.out.println("You really are not fit to be a king."); }
    }
}

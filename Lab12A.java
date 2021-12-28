//Class: CSE 1321L
//Section:WJ1 JAVA
//Term: FALL 2021
//Instructor: Enda Sullivan
//Name: Kristin Brewer
//Lab#: 12A
//Ok vs ok

import java.util.Scanner;

public class Lab12A
{
    public static void main(String[] args)
    {
        Scanner keyboardInput = new Scanner(System.in);

        //Initializing String variable
        String option;

        //Do while loop to print menu until user does not type in a variation of 'yes'
        do {
            System.out.print("Menu\n0 - Hello World\n1 - Goodbye Moon\n2 - Walking on Sunshine\n\nWhat would you like to do: ");
            int menuSelection = keyboardInput.nextInt();
            keyboardInput.nextLine();
            System.out.println();

            switch (menuSelection) {
                case 0:
                    System.out.println("Hello!\n");
                    break;
                case 1:
                    System.out.println("Ok, bye.\n");
                    break;
                case 2:
                    System.out.println("WHOA!\n");
                    break;
            }

            //Prompting user to rerun menu
            System.out.print("Type \"YES\" to rerun. ");
            option = keyboardInput.nextLine();
            System.out.println();

        }while (option.equalsIgnoreCase("yes"));

        //prints when user does not input a variation of 'yes'
        System.out.println("Program Ends");
    }
}

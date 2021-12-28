//Class: CSE 1321L
//Section:WJ1 JAVA
//Term:
//Instructor:
//Name: Kristin Brewer
//Assignment#: 3C
//Back in my Day!

import java.util.Scanner;

public class Assignment3Csummer {
    public static void main(String[] args) {

        Scanner keyboardInput = new Scanner(System.in);

        //Prompting first question
        System.out.print("It is a dark and stormy night. Do you want to take an umbrella? (Y/N): ");
        char firstChoice = keyboardInput.next().charAt(0);

        //Determining case after first question
        switch (firstChoice) {
            case 'Y':
            {
                System.out.print("Good - you have and umbrella.");
                System.out.println();
                System.out.println();
                System.out.print("You start to walk down a path and hear a scream. You realize that person screaming is " +
                        "YOU because you see a wolf! Do you fight with your umbrella or run? ((F)ight/(R)un): ");
                char secondChoiceUm = keyboardInput.next().charAt(0);
                System.out.println();

                //Determining case after second question
                switch (secondChoiceUm) {
                    case 'F': {
                        System.out.println("You take out your umbrella and jab it into the wolf's paw! It runs away and" +
                                " you live another day.");
                    }
                    break;
                    case 'R': {
                        System.out.println("You begin running so fast, the umbrella opens and you fly away like Mary" +
                                " Poppins. You're a little embarrassed, but you see the wolf fading off into the" +
                                " distance.");
                    }
                    break;
                }
                break;
            }
            case 'N': {
                System.out.print("You decided not to take an umbrella.");
                System.out.print("You start to walk down a path and hear a scream. You realize that person" +
                        " screaming is YOU because you see a wolf! Do you fight with your umbrella or run?" +
                        " ((F)ight/(R)un): ");
                char secondChoiceNoUm = keyboardInput.next().charAt(0);
                System.out.println();
                System.out.println();

                //Determining case after second question
                switch (secondChoiceNoUm) {
                    case 'F': {
                        System.out.println("You begin fighting the wolf only to realize you had just eaten a McGrease®" +
                                " meal earlier. You fall dead from rigorous exercise, having had a heart attack.");
                    }
                    break;
                    case 'R': {
                        System.out.println("Are you serious? You can't outrun a wolf! The wolf catches you" +
                                " and you are somewhat relieved because you don't have to worry about that" +
                                " Calculus exam...");
                    }
                    break;
                }

            }

        }
    }
}


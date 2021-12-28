//Class: CSE 1321L
//Section:WJ1 JAVA
//Term: FALL2021
//Instructor: Maneesha Penmetsa
//Name: Kristin Brewer
//Assignment#: 4A
//Let's Play Bunco!

import java.util.Scanner;
import java.util.Random;

public class Assignment4A {
    public static void main(String[] args) {

        Scanner keyboardInput = new Scanner(System.in);
        Random num_generator = new Random();

        int round_count = 1;
        char play = 'Y';
        char stop = 'N';
        int computer_score = 0;
        int player_score = 0;


        do {
            //Game welcome prompt
            System.out.println("Let's play Bunco!");
            for (int i = 0; i < 6; i++) {
                //Initializing play's dice rolls and computer's dice rolls
                int di1 = num_generator.nextInt(6) + 1;
                int di2 = num_generator.nextInt(6) + 1;

                //Printing first dice roll and adding up score
                System.out.println("Round " + (i + 1) + ": You rolled " + di1 + " and " + di2 + ".");
                player_score += getScore(di1, di2, i + 1);

                if (i != 5)
                    System.out.print("Your score is " + player_score + ". Do you want to stop?: ");
                else
                    System.out.println(" Your score is " + player_score + ". You've played all six rounds");
                if (i != 5) {
                    stop = keyboardInput.nextLine().charAt(0);
                    if (stop == 'Y') {
                        break;
                    }
                }

                int computer_di1 = num_generator.nextInt(6) + 1;
                int computer_di2 = num_generator.nextInt(6) + 1;
                computer_score += getScore(computer_di1, computer_di2, i + 1);
            }

            System.out.println();
            System.out.println("Okay, the computer's score is..." + computer_score + "!");
            if (player_score > computer_score)
                System.out.println("You win!");
            else
                System.out.println("Sorry, you lose.");
            System.out.println();
            System.out.print("Do you want to play again?: ");
            stop = keyboardInput.nextLine().charAt(0);
        }while (stop == 'Y');
        System.out.println("Game over...");

            }

    public static int getScore(int di1, int di2, int round_count){
        if (di1 == di2){
            if (di1 == round_count){
                return 21 + di1 + di2;
            } else {
                return 5 + di1 + di2;
            }
        }

        else if (di1 ==round_count || di2 == round_count){
            return 1 + di1 +di2;
        } else {
            return di1 +di2;
        }
    }

}

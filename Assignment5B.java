//Section:WJ1 JAVA
//Term: FALL 2021
//Instructor: Enda Sullivan
//Name: Kristin Brewer
//Assignment#: 5B
//Keeping Score Rock-Paper-Scissors

import java.util.Scanner;
import java.util.Random;

public class Assignment5B {
    //Program that creates a Rock-Paper-Scissors game that asks the user how many rounds and then randomly generates game items for that many number of times
    public static Scanner keyboardInput = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("How many games do you want to play?: ");
        int rounds = keyboardInput.nextInt();

        String[] game = game(rounds);

        System.out.println("Game over...");
        System.out.println();

        recap(rounds, game);

    }

    public static String[] game(int rounds){
        int player_choice_stored;
        Random random = new Random();
        String[] game = new String[rounds + 1];

        //Loop to increment each round
        for(int i = 1; i < rounds + 1; i++){
            System.out.print("Round " + i + ": What do you want to throw: ");
            String player_choice = keyboardInput.next();

            //Statement to assign number to player choice
            if (player_choice.equals("Rock"))       //Rock = 0
                player_choice_stored = 0;
            else if (player_choice.equals("Paper")) //Paper = 1
                player_choice_stored = 1;
            else
                player_choice_stored = 2;             //Scissors = 2

            int computer_choice = random.nextInt(rounds);

            //Loop to print computer choice and save winner to game array
            if(player_choice_stored == 0 && computer_choice == 1){
                System.out.println("Computer threw PAPER!");
                game[i] = "Computer won Round ";}
            else if(computer_choice == 0 && player_choice_stored == 1){
                System.out.println("Computer threw ROCK!");
                game[i] = "Player won Round ";}
            else if(player_choice_stored == 2 && computer_choice == 1){
                System.out.println("Computer threw PAPER!");
                game[i] = "Player won Round ";}
            else if(computer_choice == 2 && player_choice_stored == 1){
                System.out.println("Computer threw Scissors!");
                game[i] = "Computer won Round "; }
            else if(player_choice_stored == 0 && computer_choice == 2){
                System.out.println("Computer threw Scissors!");
                game[i] = "Player won Round ";}
            else if(player_choice_stored == 2 && computer_choice == 0){
                System.out.println("Computer threw ROCK!");
                game[i] = "Computer won Round ";}
            else{
                //Loop to print computer choice if choice is same as player
                if(computer_choice == 0)
                    System.out.println("Computer threw ROCK!");
                else if (computer_choice == 1)
                    System.out.println("Computer threw PAPER!");
                else
                    System.out.println("Computer threw Scissors!");
                game[i] = "Tied on Round ";}
        }

        return game;
    }

    //Method to print recap of winners array
    public static void recap(int rounds, String game[]){

        System.out.println("Here's the recap:");

        //Loop to print the winner of each round and round number
        for(int i = 1; i < rounds + 1; i++){
            System.out.println(game[i] + i);
        }
    }
}

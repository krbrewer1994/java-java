//Section:WJ1 JAVA
//Term: FALL 2021
//Instructor: Enda Sullivan
//Name: Kristin Brewer
//Assignment#: 5A
//Multiple Frequencies

import java.util.Scanner;
import java.util.Random;

public class Assignment5A {
    //This program calculates the frequency of a coin flip
    public static void main(String[] args) {

        Scanner keyboardInput = new Scanner(System.in);

        System.out.print("What's the highest number you want to generate?: ");
        int highest_num = keyboardInput.nextInt();

        System.out.print("How long of a number sequence do you want to generate?: ");
        int num_sequence = keyboardInput.nextInt();

        System.out.println("Okay, we’ll generate " + num_sequence + " numbers(s) ranging from 1 to " + highest_num + "!");

        int[] array1 = createNumberSequenceArray(highest_num, num_sequence);
        int[] array2 = createFrequencyArray(array1, num_sequence);

        printNumberSequence(array1);
        printFrequency(array2, highest_num);


    }

    //Method creates an array made up of random numbers between highest number inputed and 1
    public static int[] createNumberSequenceArray(int highest_num, int num_sequence){
        Random r = new Random();
        int[] array = new int[num_sequence];

        for(int i = 0; i < num_sequence; i++){
            array[i] = r.nextInt(highest_num) + 1;
        }
        return array;
    }

    //Method that prints the array number sequence
    public static void printNumberSequence(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + ", ");
        }
        return;
    }

    //Method that calculates array number element frequency
    public static int[] createFrequencyArray(int[] array, int num_sequence){
        int[] frequency = new int[num_sequence];

        for(int i = 0; i < num_sequence; i++){
            frequency[i] = 0;
        }

        for (int i = 0; i < num_sequence; i++) {
            frequency[array[i]]++;
        }
        return frequency;
    }

    //Method that prints the array number frequency in percentages
    public static void printFrequency(int[] arrayFrequency, int highest_num){
        System.out.println();
        System.out.println("Frequency: ");

        for (int i = 1; i <= highest_num ; i++)
        {
            if (arrayFrequency[i] >= 0) {
                System.out.println(i + " occurs " + (double)arrayFrequency[i]*10 + "% of the time");
            }
        }
        return;
    }
}

//Section:WJ1 JAVA
//Term: FALL 2021
//Instructor: Enda Sullivan
//Name: Kristin Brewer
//Assignment#: 6B
//Forwards and Backwards

import java.util.Random;
import java.util.Scanner;

public class Assignment6B {
    //Program that prompts user to choose menu options that sort an array in different ways
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        //Prompting user for array size, initializing two arrays, a temporary one and the main array
        System.out.print("How large should the array be? ");
        int array_size = input.nextInt();
        int[] array = new int[array_size];
        int[] temp_array = new int[array_size];

        //Prompts user to enter what largest number element that will be in main array
        System.out.print("What should be the highest number in the sequence? ");
        int largest_num = input.nextInt();
        System.out.println();

        //Loop to fill array with numbers 0 to largest element number given by user
        for (int i = 0; i < largest_num; i++){
            array[i] = random.nextInt(largest_num + 1);
            temp_array[i] = array[i];
        }

        //Printing initial array
        printArray(array);
        System.out.println();

        int choice = 0;

        while (choice != 4) {
            //Printing out menu
            System.out.print("[Options]\n" +
                    "1) Reset the array\n" +
                    "2) Sort (Smallest to Largest)\n" +
                    "3) Sort (Largest to Smallest)\n" +
                    "4)Quit\n" +
                    "Choice? ");
            choice = input.nextInt();
            System.out.println();

            //Switch to make menu choice
            switch (choice) {
                case 1:
                    System.out.println("Resetting the array: ");
                    for (int i = 0; i < array.length; i++){
                        array[i] = temp_array[i];}
                    printArray(array);//Reset Array
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Using Insertion Sort:");
                    s_to_L(array);
                    printArray(array);//Smallest to Largest
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Using Insertion Sort:");
                    L_to_s(array);
                    printArray(array);//Largest to Smallest
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Closing out...");//Quit
                    break;
            }
        }
    }

    //Method to sort array Smallest to Largest
    public static int[] s_to_L(int[] array){
        for (int i = 1; i< array.length; ++i){
            int key = array[i];
            int k = i - 1;

            while (k >= 0 && array[k] > key){
                array[k + 1] = array[k];
                k = k - 1;
            }
            array[k + 1] = key;
        }
        return array;
    }

    //Method to sort array Largest to Smallest
    public static int[] L_to_s(int[] array){
        for (int i = 0; i < array.length; i++){
            int max = i;
            for (int k = i +1; k < array.length; k++){
                if (array[k] > array[max])
                    max = k;
            }
            int temporary = array[max];
            array[max] = array[i];
            array[i] = temporary;
        }
        return array;
    }

    //Method to print array
    public  static void printArray(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }
}

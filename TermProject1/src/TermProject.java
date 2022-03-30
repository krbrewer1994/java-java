//Kristin Brewer
//SPRING 2022
//Discrete Computing
//Term Project
//Run Time Program JAVA

import java.util.Random;
import java.util.Scanner;

public class TermProject {
    public static void main(String[] args) {
        // Program that prompts user for number, creates and array for one number for array length
        // Then, creates and sorts 1000 arrays of num size for time
        int num_loops = 1000;

        Scanner scan = new Scanner(System.in);

        //Prompting user for number, reading the number, initializes variable
        System.out.println("Enter a number for array size: ");
        int array_size = scan.nextInt();
        System.out.println();

        //Initializes Array from user input
        selection_sort_average_time(array_size, num_loops);
        bubble_sort_average_time(array_size, num_loops);
    }

    public static void selection_sort_average_time(int array_size, int loops) {
        double running_time = 0;
        double total_time = 0;

        for (int i = 0; i < loops; i++) {
            // creation of thousand element array
            int[] array = new int[array_size];

            //Generate a random number in a specific range then add to array
            for (int j = 0; j < array_size; j++) {
                Random random = new Random();
                int random_element = random.nextInt(array_size *10) +1;
                array[j] = random_element;
            }

            // get time before start of sort
            long beginTime = System.currentTimeMillis();

            // printArray(array);

            selection_sort(array);

            // get time after sort
            long endTime = System.currentTimeMillis();


            total_time = total_time + endTime - beginTime;

            // printArray(array);
        }
        running_time = total_time / loops;
        System.out.println("Selection sort completed");

        System.out.println("Total time for the selection sort: " + total_time + " milli sec");
        System.out.println("Running time for the selection sort: " + running_time + " milli sec");
        System.out.println();
    }

    public static void bubble_sort_average_time(int array_size, int loops) {
        double running_time = 0;
        double total_time = 0;

        for (int i = 0; i < loops; i++) {
            // creation of thousand element array
            int[] array = new int[array_size];

            //Generate a random number in a specific range then add to array
            for (int j = 0; j < array_size; j++) {
                Random random = new Random();
                int random_element = random.nextInt(array_size *10) +1;
                array[j] = random_element;
            }

            // get time before start of sort
            long beginTime = System.currentTimeMillis();

            // printArray(arr);
            bubble_sort(array);

            // get time after sorting
            long endTime = System.currentTimeMillis();

            // adding time for each sorting
            total_time = total_time + endTime - beginTime;

            // printArray(array);
        }
        running_time = total_time / loops;
        System.out.println("Bubble sort completed");

        System.out.println("Total time for the bubble sort: " + total_time + " milli sec");
        System.out.println("Running time for the bubble sort: " + running_time + " milli sec");
    }

    //Method to print array
    public static void printArray ( int array[]){

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    //Method for Bubble sort
    public static void bubble_sort ( int array[]){
        for (int i = 0; i < array.length; i++) {
            boolean swapped = false;
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > (array[j + 1])) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    //Method for Selection sort
    public static void selection_sort ( int array[]){
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }

            }
        }
    }
}

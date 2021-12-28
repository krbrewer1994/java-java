//Section:WJ1 JAVA
//Term: FALL 2021
//Instructor: Enda Sullivan
//Name: Kristin Brewer
//Assignment#: 6A
//Linear Search vs. Binary Search

import java.util.Random;

public class Assignment6A {
    //This program creates and array with sequential numbers, computer selects a random target,
    // a binary and linear search are conducted to see how long each one takes
    public static void main(String[] args) {

        int [] array = new int[1000000];

        //Loop to fill array with numbers 0 to largest element number given by user
        for (int i = 0; i < 1000000; i++){
            array[i] = i + 1;
        }

        //Instantiating Random number generator and initializing target number
        Random random = new Random();
        int target = random.nextInt(999999) + 1;


        //Initializing methods to conduct searches
        int guesses = binarySearch(array, target);
        int loops = linearSearch(array, target);

        System.out.println("Comparing Linear Search and Binary Search: ");
        //Printing target number
        System.out.println("Our target is " + target);

        //Printing the loops of the linear search
        System.out.println("Linear Search: " + loops + " loop(s)");

        //Printing the guesses of the binary search
        System.out.println("Binary Search: " + guesses + " guess(es)");

        //If statement Comparing the loops to guesses and printing the highest number or tie
        if(guesses > loops){
            System.out.println("Linear Search is faster this time!");}
        else if (loops > guesses) {
            System.out.println("Binary Search is faster this time!");
        }else
            System.out.println("There was a tie!");
    }

    //Method to determine number of loops to find target in array with a linearSearch
    public static int linearSearch(int[] array, int target){
        //Loop through array linearly, incrementing loop number, returning if is found
        int loops = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] == target){
                return loops;}
            loops = target + 1;
        }
        return loops;
    }

    //Method to determine number of guesses to find target in array with a binarySearch
    public static int binarySearch(int[] array, int target){
        int guesses = 0;
        int left = 0;
        int right = array.length - 1;

        while( left <= right){

            int middle = (left + right)/ 2;
            if(target < array[middle]){
                guesses++;
                right = middle - 1;
            } else if( target > array[middle]){
                guesses++;
                left = middle + 1;
            }else
                return guesses;
        }
        return guesses;
    }

}

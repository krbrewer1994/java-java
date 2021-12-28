//Section:WJ1 JAVA
//Term: Fall 2021
//Instructor: Enda Sullivan
//Name: Kristin Brewer
//Lab#: 10B
//Warmup part2

import java.util.Scanner;

public class Lab8B {
    //This program creates two arrays that store 5 elements, user is able to full both arrays with different values,
    //then, data is added to each array by adding eac of the elements at each index and prints a new array
    public static void main(String[] args) {

        //Prompts user to enter 5 integers into two separate arrays
        System.out.println("Please enter 5 integers for the first array: ");
        //initiates method to create array 1
        int[] array1 = createArray();
        System.out.println("Please enter 5 integers for the second array: ");
        //initiates method to create array 2
        int[] array2 = createArray();
        System.out.print("The resulting sums are " );
        //initiates method to print the sum of both arrays
        sum(array1, array2);
    }

    //Method to create a 5 element array and print
    public static int[] createArray(){
        Scanner keyboardInput = new Scanner(System.in);
        int [] arr= new int[5];

        //Loop to label array instances and increment count
        for (int i = 0; i < arr.length; i++) {
            int displayNum = i + 1;
            System.out.print("Integer " + displayNum + ": ");
            arr[i] = keyboardInput.nextInt();
            }
        System.out.println();
        return arr;
    }

    //Method that adds the elements of two arrays together
    public static void sum(int a [], int b [])  {
        int sum;
        //Loop to add the elements of each array together and print
        for (int i=0; i < a.length -1; i++) {
            sum = a[i] + b[i];
            System.out.print(sum + "|");}
        int lastSum = a[4] + b[4];
        System.out.print(lastSum + "|");
        return;
    }
}

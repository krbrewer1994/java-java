//Class: CSE 1321L
//Section:WJ1 JAVA
//Term: FALL 2021
//Instructor: Enda Sullivan
//Name: Kristin Brewer
//Assignment#: 6A
//A new field of computer science: Small Data. Big Data.

import java.util.Scanner;

public class Assignment6ASummer {
    public static void main(String[] args) {

        int[] array1= new int[100];
        for (int i = 0; i < array1.length; i++) {
           array1[i] = -1;
        }
        fillArray(array1);
        printArray(array1);
        System.out.println("Min is: " + arrayMin(array1));
        System.out.println("Max is: " + arrayMax(array1));
        System.out.println("Sum is: " + arraySum(array1));
    }

    public static void fillArray(int[] array1) {

        Scanner keyboardInput= new Scanner(System.in);

        for ( int i = 0; i < array1.length; i++)
        {
            System.out.print("Enter a number or -1 to finish: ");
            int num = keyboardInput.nextInt();
            if (num == -1)
            {
                return;
            }
            array1[i] = num;
        }
    }

    public static void printArray(int[] array1) {
        System.out.print("|");
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != -1) {
                System.out.print(array1[i] + "|");
            }
            else {
                break;
            }
        }
        System.out.println();
    }

    public static int arrayMin(int[] array1)
    {
        int min = array1[0];
        for (int i = 1; i < array1.length; i++) {
            if (array1[i] == -1){
                break;
            }
            if (array1[i] < min) {
                min = array1[i];
            }
        }
        return min;
    }

    public static int arrayMax(int[] array1)
    {
        int max = array1[0];
        for (int i = 1; i < array1.length; i++) {
            if (array1[i] ==-1) {
                break;
            }
            if (array1[i] > max) {
                max = array1[i];
            }
        }
        return max;
    }

    public static int arraySum(int[] array1)
    {
        int sum = 0;
        for (int i = 0; i < array1.length; i++)
        {
            if(array1[i] == -1) {
                break;
            }
            sum = sum + array1[i];
        }
        return sum;
    }
}


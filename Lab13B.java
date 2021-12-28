//Section:WJ1 JAVA
//Term: Fall 2021
//Instructor: Enda Sullivan
//Name: Kristin Brewer
//Lab#: 13B
//more methods

import java.util.Scanner;

public class Lab13B {
    public static void main(String[] args) {

        Scanner keyboardInput = new Scanner(System.in);

        System.out.print("Please enter the number of rows: ");
        int row = keyboardInput.nextInt();

        System.out.print("Please enter the number of columns: ");
        int column =keyboardInput.nextInt();
        System.out.println();

        int area = row*column;

        System.out.println("I have " + row + " rows and " + column + " columns. " +
                "I need to fill-up " + area + " spaces.");
        System.out.println();

        System.out.println("The " + row + "x" + column + " array:");
        fillArray(row, column);
        printArray(fillArray(row,column));
        System.out.println();

        System.out.print("The sum of all the numbers in the " + row + "x" + column + " array: ");
        System.out.println(arraySum(fillArray(row,column)));
        System.out.println();

        System.out.print("The average of all the numbers in the " + row + "x" + column + " array: " );
        System.out.println(arrayAverage(arraySum(fillArray(row, column)), area));
    }

    public static int[][] fillArray(int row, int column) {
        int[][] array = new int[row][column];
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                count++;
                array[i][j] = count;
            }
        }
        return array;
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "|");
            }
            System.out.println();
        }
    }

    public static int arraySum(int[][] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++){
                sum = sum + array[i][j];
            }
        }
        return sum;
    }

    public static float arrayAverage(int sum, int area){
        float average = (float) sum/area;
        return average;
    }
}

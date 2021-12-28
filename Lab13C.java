//Section:WJ1 JAVA
//Term: Fall 2021
//Instructor: Enda Sullivan
//Name: Kristin Brewer
//Lab#: 13C
//2D or not 2D

import java.util.Scanner;

public class Lab13C {
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
        print2DArray(row, column);
        System.out.println();

        System.out.println("The " + row + "x" + column + " 2-D array flattened into a " + area + " cell 1-D array:");
        print1DArray(area);
    }

    public static int[][] print2DArray(int row, int column){
        int[][] array = new int[row][column];
        int count = 0;

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++) {
                count ++;
                array [i][j] = count;
                System.out.print(array[i][j] + "|");
            }
            System.out.println();
        }
        return array;
    }

    public static int[] print1DArray(int area){
        int[] array = new int[area];
        int count = 0;

        for (int i = 0; i < array.length; i++){
                count ++;
                array [i] = count;
                System.out.print(array[i] + "|");
            }
            System.out.println();
        return array;
    }
}

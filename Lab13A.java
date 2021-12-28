//Section:WJ1 JAVA
//Term: FALL 2021
//Instructor:Enda Sullivan
//Name: Kristin Brewer
//Lab#: 13A
//N by N

import java.util.Scanner;

public class Lab13A {
    //Program that asks the user for a row and column size for a 2D int array
    // that dynamically adapts the size of the array and fills the array with numbers ascending from 1 to n
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
        printArray(row, column);

    }

    public static int[][] printArray(int row, int column){
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
}

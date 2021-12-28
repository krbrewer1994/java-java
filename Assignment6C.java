//Section:WJ1 JAVA
//Term: FALL 2021
//Instructor: Enda Sullivan
//Name: Kristin Brewer
//Assignment#: 6C
//Minesweeper

import java.util.Random;
import java.util.Scanner;

public class Assignment6C {
    public static void main(String[] args) {

        Scanner keyboardInput = new Scanner(System.in);

        System.out.println("[Minesweeper - DOS Edition]\nWhat is the grid size? ");
        int size = keyboardInput.nextInt();

        //2D grill array
        char[][] array = new char[size][size];

        //Loop to fill game grid
        for(int i = 0; i < size; i++){
            for (int k = 0; k < size; k++) {
                array[i][k] = '?';
            }
        }

        Random random = new Random();

        //Array to store mine locations
        int[] mine_array = new int[size];

        //Loop to generate a random number for mine column array
        for (int i = 0; i < size; i++){
            mine_array[i] = random.nextInt(size);
        }

        int win = 1;
        int count = 0;

        while (true){
            printArray(array, size);//Print 2D array

            //Prompting user to enter location for the game
            System.out.print("Enter your X coordinate: ");
            int x = keyboardInput.nextInt();
            System.out.print("Enter your Y coordinate: ");
            int y = keyboardInput.nextInt();

            if (mine_array[y] == x){
                win = 0;
                array[x][y] = 'X';
                break;
            }

            count++;
            array[x][y] = '_';

            if (count == size){
                break;
            }

            System.out.println("");
        }

        printArray(array, size);

        if (win == 1){
            System.out.print("You win!");
        }else {
            System.out.print("Sorry, you hit a mine!");
        }

    }

    //Method to print array
    public static  void printArray(char[][] array, int size){
        for(int i = 0; i< size; i++){
            for (int k = 0; k < size; k++){
                System.out.print(array[i][k] + " ");
            }
            System.out.println("");
        }
    }
}

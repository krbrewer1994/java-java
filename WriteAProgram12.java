package src;

//Programming 1
//Exam 1
//Practice problems
//Write A Program Example

import java.util.Scanner;

public class WriteAProgram12 {
    public static void main(String[] args) {

        Scanner keyboardInput = new Scanner(System.in);

        System.out.print("Please enter a number between 1-10: ");
        int num = keyboardInput.nextInt();

        if (num < 1) {
            System.out.println("Too Low!");
        } else if (num > 10) {
            System.out.println("Too high!");
        } else if (num >= 2 || num <= 8) {
            System.out.println("I like this number");
        } else {
            System.out.println("Rock on, my friend -Rock on...");
        }

    }
}

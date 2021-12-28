package src;
//Programming 1
//Exam 1
//Practice problems
//Write A Program Example

import java.util.Scanner;

public class WriteAProgram9 {
    public static void main(String[] args) {

        Scanner keyboardInput = new Scanner(System.in);

        System.out.print("Please enter a number between 0-255: ");
        int num = keyboardInput.nextInt();

        int oldRangeMax = 255;
        int oldRangeMin = 0;
        double newRangeMax = 1.0;
        double newRangeMin = 0.0;

        double newNum = ((num - oldRangeMin)/(oldRangeMax-oldRangeMin)) * (newRangeMax-newRangeMin) + newRangeMin;

        System.out.println(newNum);
    }
}

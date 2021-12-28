package src;
//Programming 1
//Exam 1
//Practice problems
//Write A Program Example

import java.util.Scanner;

public class WriteAProgram1 {
    public static void main(String[] args) {

        Scanner keyboardInput = new Scanner(System.in);

        System.out.print("Enter day of the week: ");
        String day = keyboardInput.next();

        System.out.print("Enter a color: ");
        String color = keyboardInput.next();

        System.out.println("On " + day + "s we wear " + color + ".");

    }
}

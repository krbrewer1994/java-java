package src;
//Programming 1
//Exam 1
//Practice problems
//Write A Program Example

import java.util.Scanner;

public class WriteAProgram10 {
    public static void main(String[] args) {

        Scanner keyboardInput = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = keyboardInput.next();

        if (name.equals("I\'munique") || name.equals("Elizabreth")) {
            System.out.print("Why would your parents name you that?");
        } else {
            System.out.print("Well, hello!");
        }

    }
}

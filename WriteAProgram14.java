package src;

//Programming 1
//Exam 1
//Practice problems
//Write A Program Example

import java.util.Scanner;

public class WriteAProgram14 {
    public static void main(String[] args) {

        Scanner keyboardInput = new Scanner(System.in);

        System.out.print("Login name: ");
        String username = keyboardInput.next();

        System.out.print("Password: ");
        String password = keyboardInput.next();

        if (username.equals("Reaper") && password.equals("cowbell")) {
            System.out.println("We need more cowbell, baby!");
        } else {
            System.out.println("I don't know you. Try again later.");
        }
    }
}

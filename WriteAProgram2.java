package src;
//Programming 1
//Exam 1
//Practice problems
//Write A Program Example

import java.util.Scanner;

public class WriteAProgram2 {
    public static void main(String[] args) {

        Scanner keyboardInput = new Scanner(System.in);

        String passengerName;
        int numberOfCruises;

        System.out.print("Enter your name: ");
        passengerName = keyboardInput.nextLine();

        System.out.print("Enter how many times you have cruised before: ");
        numberOfCruises = keyboardInput.nextInt();

        while (numberOfCruises >= 1) {
            if (numberOfCruises == 1) {
                System.out.print("Welcome aboard! Please join us for free drinks on the Lido deck.");
                break;
            } else if (numberOfCruises >= 5) {
                System.out.print("Welcome back! Please join us for dinner and dancing in th Aft lounge tonight.");
                break;
            } else {
                System.out.print("Welcome back! We're glad to have you aboard.");
                break;
            }
        }

    }
}

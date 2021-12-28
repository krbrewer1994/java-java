package src;
//Programming 1
//Exam 1
//Practice problems
//Write A Program Example

import java.util.Scanner;

public class WriteAProgram5 {
    public static void main(String[] args) {

        Scanner keyboardInput = new Scanner(System.in);

        String passengerName;
        int flightHistory;

        System.out.print("Enter your name here: ");
        passengerName = keyboardInput.next();

        System.out.print("Enter the of times you have flown before: ");
        flightHistory = keyboardInput.nextInt();

        if (flightHistory== 0) {
            System.out.print("Welcome! We're so glad you're flying with us.");
        } else if (flightHistory >= 4) {
            System.out.print("Thank you for being a fight club member. Please enjoy the complementary beverages during our in-flight snack service.");
        } else {
            System.out.print("Welcome back! We're glad to have you flying with us today.");
        }

    }
}


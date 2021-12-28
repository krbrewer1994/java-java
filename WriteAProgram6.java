package src;
//Programming 1
//Exam 1
//Practice problems
//Write A Program Example

import java.util.Scanner;

public class WriteAProgram6 {
    public static void main(String[] args) {

        Scanner keyboardInput = new Scanner(System.in);

        String customerName;
        int rentalHistory;

        System.out.print("Enter your name here: ");
        customerName = keyboardInput.next();

        System.out.print("Enter the of times you have cruised before: ");
        rentalHistory = keyboardInput.nextInt();

        if (rentalHistory == 0) {
            System.out.print("Welcome! We're so glad you're driving with us.");
        } else if (rentalHistory >= 3) {
            System.out.print("Thank you for being a preferred customer. You'll find a prepaid gas card in the glove box.");
        } else {
            System.out.print("Welcome back! We're glad to have you driving with us today.");
        }

    }
}

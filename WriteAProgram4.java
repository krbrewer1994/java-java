package src;

//Programming 1
//Exam 1
//Practice problems
//Write A Program Example

import java.util.Scanner;

public class WriteAProgram4 {
    public static void main(String[] args) {

        Scanner keyboardInput = new Scanner(System.in);

        String guestName;
        int guestHistory;

        System.out.print("Enter your name here: ");
        guestName = keyboardInput.next();

        System.out.print("Enter the of times you have stayed at this hotel: ");
        guestHistory = keyboardInput.nextInt();

        if (guestHistory == 0) {
            System.out.print("Welcome! We're so glad you are staying with us.");
        } else if (guestHistory >= 10) {
            System.out.print("Thank you for being a vacation club member. Please enjoy the complementary gift basket we've left in your room.");
        } else {
            System.out.print("Welcome back! We're glad to have you staying with us today.");
        }

    }
}



package src;
//Programming 1
//Exam 1
//Practice problems
//Write A Program Example

import java.util.Scanner;

public class WriteAProgram3 {
    public static void main(String[] args) {

        Scanner keyboardInput = new Scanner(System.in);

        String guestName;
        int diningHistory;

        System.out.print("Enter your name here: ");
        guestName = keyboardInput.next();

        System.out.print("Enter the number of times you have dined at this restaurant before: ");
        diningHistory = keyboardInput.nextInt();

        if (diningHistory == 0) {
            System.out.print("Welcome! We're so glad you're dining with us.");}
        else if (diningHistory >= 6) {
            System.out.print("Thank you for being a dining club member Please enjoy complementary dessert");}
        else {
            System.out.print("Welcome back! We're glad to have you dining with us today.");
        }
    }
}

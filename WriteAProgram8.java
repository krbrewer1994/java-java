package src;
//Programming 1
//Exam 1
//Practice problems
//Write A Program Example

import java.util.Scanner;

public class WriteAProgram8 {
    public static void main(String[] args) {

        Scanner keyboardInput = new Scanner(System.in);

        System.out.print("Please enter GPA here: ");
        double gpa = keyboardInput.nextDouble();

        if (gpa == 4.0) {
            System.out.println("You're my hero!");}
        else if (gpa > 2.0) {
            System.out.println("You can graduate.");
        }
        else {
            System.out.println("Raise your GPA!");
        }

    }
}


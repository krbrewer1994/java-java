package src;
//Programming 1
//Exam 1
//Practice problems
//Thrown for a loop examples

import java.util.Scanner;

class ThrownForALoop1 {
    public static void main(String[] args) {

        Scanner keyboardInput = new Scanner(System.in);

        System.out.print("Enter dice roll number: ");
        int rollNum = keyboardInput.nextInt();

        if (rollNum ==7) {
            System.out.println("Congratulations, you've been robbed!");
        }
        else {
            System.out.println("Whew! That was close!");
        }

    }
}
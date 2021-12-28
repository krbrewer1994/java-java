package src;

//Programming 1
//Exam 1
//Practice problems
//Write A Program Example

import java.util.Scanner;

public class WriteAProgram11 {
    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);

        System.out.print("Enter the width: ");
        int width = sn.nextInt();

        System.out.print("Enter the length: ");
        int length = sn.nextInt();

        int p = width*2 + length*2;

        System.out.println("The perimeter of the rectangle is " + p + ".");
    }
}

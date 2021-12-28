package src;
//Programming 1
//Exam 1
//Practice problems
//Write A Program Example

import java.util.Scanner;

public class WriteAProgram13 {
    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);

        System.out.print("Enter the base: ");
        int b = sn.nextInt();

        System.out.print("Enter the height: ");
        int h = sn.nextInt();

        int a = (b*h)/2;

        System.out.println("The area of the triangle is " + a + ".");

    }
}

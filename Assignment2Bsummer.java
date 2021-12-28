// Class: CSE 1321L
// Section:WJ1 JAVA
// Term: SUMMER2021
// Instructor: Kaleigh Kendrick
// Name: Kristin Brewer
// Assignment2B
// Yardwork


import java.util.Scanner;

public class Assignment2Bsummer {
    public static void main(String[] args) {

        Scanner keyboardInput = new Scanner(System.in);

        //Prompting user, reading input, initializing
        System.out.println("Width: ");
        int w = keyboardInput.nextInt();
        System.out.println("Length: ");
        int l = keyboardInput.nextInt();
        System.out.println("Square feet per dot: ");
        int s = keyboardInput.nextInt();

        //Calculating Area and Square ft per dot
        int a = w * l;
        float perDot = (float) a / (float) s;

        //Output
        System.out.println("A yard of " + a + " square feet will take " + perDot + " dots to cut.");
    }
}
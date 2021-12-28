// Class: CSE 1321L
// Section:WJ1 JAVA
// Term:
// Instructor:
// Name: Kristin Brewer
// Assignment2C
// Can you still see the dots?

import java.util.Scanner;

public class Assignment2Csummer {
    public static void main(String[] args) {

        Scanner keyboardInput = new Scanner(System.in);

        System.out.println("Horizontal pixels: ");
        int h = keyboardInput.nextInt();

        System.out.println("Vertical pixels: ");
        int v = keyboardInput.nextInt();

        System.out.println("Diagonal length in inches: ");
        float d = keyboardInput.nextFloat();

        int diagonalPixels = (int) Math.sqrt((Math.pow(v,2)) + (Math.pow(h,2)));

        double pixelsPerInch = diagonalPixels/ d;

        System.out.println("Pixels per inch: " + (int)pixelsPerInch);
    }
}


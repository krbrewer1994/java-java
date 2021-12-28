//Class: CSE 1321L
//Section:WJ1 JAVA
//Term:FALL 2021
//Instructor:Maneesha Kumari Penmetsa
//Name: Kristin Brewer
//Assignment: 1A
// Red, Green, or Blue?

import java.util.Scanner;

public class Assignment1A {
    public static void main(String[] args) {

        Scanner keyboardInput = new Scanner(System.in);

        //Prompt, reading input, initialization
        System.out.print("Enter a red value (0-255): ");
        float red = keyboardInput.nextFloat();

        System.out.print("Enter a green value (0-255): ");
        float green = keyboardInput.nextFloat();

        System.out.print("Enter an blue value (0-100): ");
        float blue = keyboardInput.nextFloat();

        System.out.print("Enter an alpha value (0-100): ");
        float alpha = keyboardInput.nextFloat();


        //Calculations
        int oldMax = 255;
        int oldMin = 0;
        int oldMax1 = 100;
        int oldMin1 = 0;
        float newMax = 1.0f;
        float newMin = 0.0f;

        int oldRange1 = (oldMax -oldMin);
        float newRange = (newMax -newMin);
        float oldRange2 = (oldMax1 - oldMin1);

        float newRed = ((red -  oldMin)*newRange/oldRange1) + newMin;
        float redRounded = (float) (Math.round(newRed*1000.0)/1000.0);

        float newGreen = ((green -  oldMin)*newRange/oldRange1) + newMin;
        float greenRounded = (float) (Math.round(newGreen*1000.0)/1000.0);

        float newBlue = ((blue -  oldMin)*newRange/oldRange1) + newMin;
        float blueRounded = (float) (Math.round(newBlue*1000.0)/1000.0);

        float newAlpha = ((alpha -  oldMin)*newRange/oldRange2) + newMin;
        float alphaRounded = (float) (Math.round(newAlpha*1000.0)/1000.0);

        System.out.print("New color is red=" +  redRounded + ", green=" + greenRounded + ", blue=" + blueRounded +", alpha=" + alphaRounded);
    }
}

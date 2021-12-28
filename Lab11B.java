//Class: CSE 1321L
//Section:WJ1 JAVA
//Term: FALL 2021
//Instructor: Enda Sullivan
//Name: Kristin Brewer
//Lab#: 11B
//Rectangle Decision

import java.util.Scanner;

public class Lab11B //Prompts user to enter width and height of a rectangle//
{
    public static void main(String[] args)
    {
        Scanner keyboardInput = new Scanner(System.in);
        char again;

        do {
            System.out.print("Enter width: ");
            double width1 = keyboardInput.nextDouble();

            System.out.print("Enter height: ");
            double height1 = keyboardInput.nextDouble();

            if (isValid(width1, height1))
                System.out.println("This is a valid rectangle\nThe area is: " + Area(width1, height1) + "\nThe perimeter is: " + Perimeter(width1, height1) +"\n");
            else
                System.out.println("This is invalid rectangle\n");

            System.out.print("Do you want to enter another width and height (Y/N)? : ");
            again = keyboardInput.next().charAt(0);
            keyboardInput.nextLine();
            System.out.println();

        } while(again == 'Y');

        System.out.println("Program Ends");
    }

    //determines if rectangle is valid
    public static boolean isValid(double width1, double height1) {//returns true if width and height sum is greater than 30
        if (width1 + height1 > 30) {
            return true;
        } else {
            return false;
        }
    }

    //returns area if valid rectangle
    public static double Area ( double width, double height)
    {
        double area = width * height;
        return area;
    }

    //returns perimeter if valid rectangle
    public static double Perimeter ( double width, double height)
    {
        double perimeter = width*2 + height*2;
        return perimeter;
    }
}

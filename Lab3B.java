//Class: CSE 1321L
//Section:WJ1 JAVA
//Term:Fall 2021
//Instructor:Maneesha Kumari Penmetsa
//Name: Kristin Brewer
//Lab#: 2B
//GPA calculator

import java.util.Scanner;

public class Lab3B {
    public static void main (String[] args) {

        Scanner keyboardInput = new Scanner(System.in);

        //Prompt user, read input, initialize
        System.out.print("Course 1 hours: ");
        int firstCourse = keyboardInput.nextInt();
        System.out.print("Grade for course 1: ");
        int firstPoints = keyboardInput.nextInt();
        System.out.print("Course 2 hours: ");
        int secondCourse = keyboardInput.nextInt();
        System.out.print("Grade for course 2: ");
        int secondPoints = keyboardInput.nextInt();
        System.out.print("Course 3 hours: ");
        int thirdCourse = keyboardInput.nextInt();
        System.out.print("Grade for course 3: ");
        int thirdPoints = keyboardInput.nextInt();
        System.out.print("Course 4 hours: ");
        int forthCourse = keyboardInput.nextInt();
        System.out.print("Grade for course 4: ");
        int forthPoints = keyboardInput.nextInt();

        //Calculate
        float totalHours = firstCourse + secondCourse + thirdCourse + forthCourse;
        float totalQualityPoints = (firstCourse * firstPoints) + (secondCourse *
                secondPoints) + (thirdCourse * thirdPoints) + (forthPoints * forthCourse);
        float yourGpa = totalQualityPoints / totalHours;

        //Output
        System.out.println("Total hours is: " + totalHours);
        System.out.println("Total quality points is: " + totalQualityPoints);
        System.out.println("Your GPA for this semester is " + yourGpa);
    }
}




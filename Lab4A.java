//Class: CSE 1321L
//Section:WJ1 JAVA
//Term: Fall 2021
//Instructor: Maneesha Penmetsa
//Name: Kristin Brewer
//Lab#: 4A
//What is my grade?

import java.util.Scanner;

public class Lab4A {
    public static void main(String[] args) {

        Scanner keyboardInput = new Scanner(System.in);

// A = 98 - 100
// A+ = 95 - 97
// A- = 92 - 94
// B+ = 89 - 91
// B = 86 - 88
// B- = 83 - 85
// C+ = 80 - 82
// C = 77 - 79
// C- = 74 - 76
// D+ = 71 - 73
// D = 68 - 70
// D- = 65 - 67
// F = 0 - 64

        System.out.print("Enter the score of your exam: ");

        float examScore = keyboardInput.nextFloat();

        if (examScore >= 97.5 && examScore <= 100.0) {
            System.out.println("Letter grade is: A+");
        } else if (examScore >= 94.5 && examScore <= 97.4) {
            System.out.println("Letter grade is: A");
        } else if (examScore >= 91.5 && examScore <= 94.4) {
            System.out.println("Letter grade is: A-");
        } else if (examScore >= 88.5 && examScore <= 91.4) {
            System.out.println("Letter grade is: B+");
        } else if (examScore >= 85.5 && examScore <= 88.4) {
            System.out.println("Letter grade is: B");
        } else if (examScore >= 82.5 && examScore <= 85.4) {
            System.out.println("Letter grade is: B-");
        } else if (examScore >= 79.5 && examScore <= 82.4) {
            System.out.println("Letter grade is: C+");
        } else if (examScore >= 76.5  && examScore <= 79.4) {
            System.out.println("Letter grade is: C");
        } else if (examScore >= 73.5 && examScore <= 76.4) {
            System.out.println("Letter grade is: C-");
        } else if (examScore >= 70.5 && examScore <= 73.4) {
            System.out.println("Letter grade is: D+");
        } else if (examScore >= 67.5 && examScore <= 70.4) {
            System.out.println("Letter grade is: D");
        } else if (examScore >= 64.5 && examScore <= 67.4) {
            System.out.println("Letter grade is: D-");
        } else if (examScore >= 0.0 && examScore <= 64.4) {
            System.out.println("Letter grade is: F");
        } else {
                System.out.println("The number you entered is not in the range");
        }
    }
}






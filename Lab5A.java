//Class: CSE 1321L
//Section:WJ1 JAVA
//Term: FALL2021
//Instructor: Maneesha Penmetsa
//Name: Kristin Brewer
//Lab#: 5A
//Driving me Crazy! Nested if-statements

import java.util.Scanner;

public class Lab5A {
    //Program that determines user eligibility to buy a car
    public static void main(String[] args) {

        //Program to determine eligibility to buy a car
        Scanner keyboardInput = new Scanner(System.in);

        //First question
        System.out.print("Do you have a driving permit (Y/N)? ");
        String drivingPermit = keyboardInput.next();

        //If answer to first question is yes
        if (drivingPermit.equals("Y")) {
            //Second question
            System.out.print("Do you have a commercial driving license (Y/N)? ");
            String commercialLicense = keyboardInput.next();

            //If answer to second question is yes
            if (commercialLicense.equals("Y")) {
                System.out.println("Congratulations! You can purchase a vehicle, let\'s start talking options!");
            }

            //If answer to second question is no
            else {
                System.out.println("Commercial driving license is a prerequisite to purchase a vehicle!");
            }
        }

        //If answer to first question is no
        else {
            System.out.println("Driving permit is a prerequisite to purchase a vehicle!");
        }
    }
}



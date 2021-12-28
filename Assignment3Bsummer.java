//Class: CSE 1321L
//Section:WJ1 JAVA
//Term: FALL 2021
//Instructor: Enda Sullivan
//Name: Kristin Brewer
//Assignment#: 3B
//Going to Grad School!

import java.util.Scanner;

public class Assignment3Bsummer {
    public static void main(String[] args) {

        Scanner keyboardInput = new Scanner(System.in);

        //Prompt user, read input, initialize
        System.out.println("Major:");
        String major= keyboardInput.next();
        System.out.println("GPA:");
        float gpa= keyboardInput.nextFloat();

        //Conditional statements to determine CCSE eligibility
        if ((major.equals("CS") || major.equals("SWE") || major.equals("IT")|| major.equals("CGDD")) && (gpa >= 3.5))
                System.out.println("You can FastTrack.");
        else if (gpa >= 3.5)
            System.out.println("Great GPA but, apply using the regular application.");
        else if (major.equals("CS") || major.equals("SWE") || major.equals("IT") || major.equals("CGDD"))
            System.out.println("Correct major but, GPA needs to be higher.");
        else
            System.out.println("Talk to one of our advisors about whether grad school is for you.");
    }
}



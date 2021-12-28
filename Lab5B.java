//Class: CSE 1321L
//Section:WJ1 JAVA
//Term: FALL2021
//Instructor:Maneesha Penmetsa
//Name: Kristin Brewer
//Lab#: 5B
//Sensible Division using modulus function and switch statement

import java.util.Scanner;

public class Lab5B {
    public static void main(String[] args) {

        //Divisible by 2, 3, or 5?
        Scanner keyboardInput = new Scanner(System.in);

        //Prompting user to enter number, reads input, initializes variable
        System.out.print("Enter an integer: ");
        int x = keyboardInput.nextInt();

        //Switch statement determining divisibility
        switch (x%2) {
            case 0:
                System.out.println("This number is divisible by 2");
                break;
            default:
                switch (x%3) {
                    case 0:
                        System.out.println("This number is divisible by 3");
                        break;
                    default:
                        switch (x%5) {
                            case 0:
                                System.out.println("This number is divisible by 5" );
                                break;
                            default:
                                System.out.println("This number is undetermined.");
                        }
                }
        }
    }
}


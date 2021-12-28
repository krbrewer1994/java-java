//Class: CSE 1321L
//Section:WJ1 JAVA
//Term: FALL2021
//Instructor:
//Name: Kristin Brewer
//Assignment#: 4B
//Fiba-what?

import java.util.Scanner;

public class Assignment4BSummer {
    public static void main(String[] args) {

        Scanner keyboardInput = new Scanner(System.in);

        //Prompting user for values, reading values, initializing values
        System.out.println("Enter seed 1:");
        int seed1 = keyboardInput.nextInt();

        System.out.println("Enter seed 2:");
        int seed2 = keyboardInput.nextInt();

        System.out.println("Number of iterations:");
        int numIterations = keyboardInput.nextInt();

        System.out.print(seed1 + "," + seed2);

        //Loop condition adding previous two values until end of iteration input
        for (int i =2; i<numIterations + 2; i++) {
            int seed3 = seed1 + seed2;

            System.out.print("," + seed3);

            seed1 = seed2;
            seed2 = seed3;
        }
    }
}

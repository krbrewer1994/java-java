//Class: CSE 1321L
//Section:WJ1 JAVA
//Term: FALL2021
//Instructor:
//Name: Kristin Brewer
//Assignment#: 4C
//Triangle man, Triangle man. Nested loops

import java.util.Scanner;

public class Assignment4Csummer {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);

        System.out.println("Size:");
        int size = keyboardInput.nextInt();

        //Loop for rows
        for (int i = 1; i <= size; i++) {
            int p = 0;
            //Loop for blank columns
            for (int j = 1; j < i; j++)
            {
                System.out.print("  ");
            }
            //Loop for decrementing columns
            for (int j=i; j<=size; j++)
            {
                System.out.print(p++ + " ");
            }
            System.out.println();
        }
    }
}

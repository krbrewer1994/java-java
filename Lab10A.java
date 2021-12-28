//Section:WJ1 JAVA
//Term: FALL 2021
//Instructor: Enda Sullivan
//Name: Kristin Brewer
//Lab#: 10A
//Warm-up


import java.util.Scanner;

public class Lab10A {
    public static void main(String[] args) {

        Scanner keyboardInput = new Scanner(System.in);

        int [] array = new int[10];

        System.out.println("Please enter 10 numbers: ");
        for (int i = 0; i<=9; i++) {
            System.out.print("Integer " + (i+1) + ": ");
            array[i] =keyboardInput.nextInt();
        }

        System.out.print("What is the target number: ");
        int target = keyboardInput.nextInt();

        for (int i = 0; i < 10; i++) {
            if (array[i] == target) {
                System.out.println("The target is in the set.");
            return;}
        }
        System.out.println("The target is not in the set.");
    }

}

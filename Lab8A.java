//Section:WJ1 JAVA
//Term: FALL 2021
//Instructor: Enda Sullivan
//Name: Kristin Brewer
//Lab#: 10A
//Warmup

import java.util.Scanner;

public class Lab8A {
    public static void main(String[] args) {

        Scanner keyboardInput = new Scanner(System.in);

        int [] arr= new int[10];
        int sum = 0;

        System.out.println("Please enter 10 integers: ");

        for (int i = 0; i < arr.length ; i++) {
            int displayNum = i + 1;
            System.out.print("Integer " + displayNum + ": ");
            arr[i] = keyboardInput.nextInt();
            sum = sum + arr[i];
        }
         System.out.print("The sum is " + sum);
    }
}

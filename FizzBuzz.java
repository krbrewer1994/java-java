package src;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Number: ");
        int value = scan.nextInt();

        if ((value % 5 == 0) && (value % 3 == 0)) //Is the value divisible by 5 & 3?
            System.out.print("Fizz Buzz");
        else if (value % 5 == 0) //Is value divisible by 5?
            System.out.print("Fizz");
        else if (value % 3 == 0) //Is value divisible by 3?
            System.out.print("Buzz");
        else
            System.out.print(value);
    }
}

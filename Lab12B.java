//Class: CSE 1321L
//Section:WJ1 JAVA
//Term: FALL 2021
//Instructor: Enda Sullivan
//Name: Kristin Brewer
//Lab#: 12B
//Password

import java.util.Scanner;

public class Lab12B
{
    public static void main(String[] args) {

        Scanner keyboardInput = new Scanner(System.in);

        //Prompting user, reads input, initializes String variable
        System.out.print("Enter a password: ");
        String password = keyboardInput.next();

        //If else statement printing out message depended on valid or invalid password
        if (valid(password)) {
            System.out.println("Valid password\n");
        } else {
            System.out.println("Invalid password\n");
        }
        System.out.println("Program Ends");
    }

    //Method to check if password is valid
    //Must contain at least 8 char
    //Must contain 1 upper case letter
    //Must contain 1 digit
    //No restrictions for lowercase or special chars
    public static boolean valid(String password) {
        //8 Character minimum
        if (!(password.length() >= 8)) {
            return false;
        }

        //At least 1 uppercase letter
        if (true) {
            int count = 0;
            for (int i = 65; i <= 90; i++) {
                // type casting from ASCII table
                char c = (char) i;

                String str = Character.toString(c);
                if (password.contains(str)) {
                    count = 1;
                }
            }
            if (count == 0) {
                return false;
            }
        }

        //At least 1 digit
        if (true) {
            int count = 0;
            // check digits
            for (int i = 0; i <= 9; i++) {
                // to convert int to string
                String str = Integer.toString(i);
                if (password.contains(str)) {
                    count = 1;
                }
            }
            if (count == 0) {
                return false;
            }
        }
        // if all fails
        return true;
    }
}





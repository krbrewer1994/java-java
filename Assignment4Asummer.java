//Class: CSE 1321L
//Section:WJ1 JAVA
//Term: FALL2021
//Instructor:
//Name: Kristin Brewer
//Assignment#: 4A
//Warm-up Gimme a Cookie

import java.util.Scanner;

public class Assignment4Asummer
{
    public static void main(String[] args)
    {
        Scanner keyboardInput = new Scanner(System.in);
        String response;

        //Loop that continues until the word cookies is typed
        do {
            System.out.println("Gimme a cookie: ");
            response = keyboardInput.nextLine();
        }while (!response.equals("cookie"));

        System.out.println("Log out next time!");
    }
}

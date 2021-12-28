//Class: CSE 1321L
//Section:WJ1 JAVA
//Term: FALL2021
//Instructor: Maneesha Penmetsa
//Name: Kristin Brewer
//Assignment#: 4C
// Heads or Tails?

import java.util.Random;
import java.util.Scanner;

public class Assignment4C {
    public static void main(String[] args) {

        Scanner keyboardInput = new Scanner(System.in);
        Random random = new Random();

        int min = 0;
        int max = 0;
        int heads = 0;
        int tails = 0;

        System.out.print("How many times do you want to flip the coin?: ");
        int flips = keyboardInput.nextInt();

        for (int i = 0; i < flips; i++){
          double times = random.nextLong()*random.nextLong()*random.nextLong();

          if (times > 0.5)
              heads++;
          else
              tails++;
        }

        System.out.println("After flipping the coin " + flips + " time(s), we found that it lands on:");
        double heads_percent = heads/(flips*1.0);
        double tails_percent = tails/(flips*1.0);
        System.out.println("Heads - " + heads + " times (" + heads_percent + "%)");
        System.out.println("Tails - " + tails + " times (" + tails_percent + "%)");

        if(heads > tails){
            System.out.println("The coin lands on heads more often than tails!");
        }else if (tails > heads) {
            System.out.println("The coin lands on tails more often than heads!");}else {
            System.out.println("The coin is perfectly fair!");
        }
    }
}





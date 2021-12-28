package Assignment5B;

//Section:WJ1 JAVA
//Term: FALL 2021
//Instructor:
//Name: Kristin Brewer
//Assignment#: 5B
//Free flight to Europe
/*
import java.util.Scanner;

public class Assignment5B {
    public static void getUserChoice() {
        Scanner keyboardInput = new Scanner(System.in);
        int choice;

        System.out.println("Would you like to: ");
        System.out.println("1) Charge a purchase ");
        System.out.println("2) Make a payment ");
        System.out.println("3) See current balance ");
        System.out.println("4) Quit ");
        choice = keyboardInput.nextInt();
        System.out.println(choice);
    }

    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);

        int amount;
        CreditCard myCard = new CreditCard();
        int userChoice = -1;

        do {
            userChoice = getUserChoice()
            Switch(userChoice) {
                Case 1:System.out.print("Amount to charge: ");
                amount = keyboardInput.nextInt();
                myCard.charge(amount)
                break;
                Case 2:System.out.print("Amount to pay: ");
                amount = keyboardInput.nextInt();
                myCard.payment(amount);
                break;
                Case 3:myCard.currentBal();
                break;
                Default:
                System.out.println("Invalid selection, try again!");
                break;
            }

        }while (userChoice !=4)
    }
}

*/
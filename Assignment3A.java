//Class: CSE 1321L
//Section:WJ1 JAVA
//Term: FALL 2021
//Instructor:Maneesha Penmetsa
//Name: Kristin Brewer
//Assignment#: 3A
//Business Time!

import java.util.Scanner;

public class Assignment3A {
    //Program to handle sales of Scrappy plush dolls for a bookstore
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);

        //Variables
        double doll_cost = 2;
        double discount = .1;

        System.out.println("Welcome to the KSU Bookstore!");

        //Prompt if user wants to buy some Scappy dolls, read response, initialize variable choice
        System.out.print("Do you want to purchase Scrappy dolls?: ");
        String choice = keyboardInput.next();

        //Nested if statements prompting user for number of Scrappy dolls to buy, then printing appropriate statement
        if(choice.equals("No")){
            System.out.print("Have a nice day!");}
        else{
            System.out.print("How many Scrappy dolls do you want to buy?: ");
            int num_of_dolls = keyboardInput.nextInt();
            double cost = (doll_cost * num_of_dolls);

            //If user wants to purchase more than 5 a discount is applied
            if(num_of_dolls > 5){

                discount =  cost * discount;
                double bulk_discount_cost = cost - discount;
                System.out.print("You earned a 10% discount for buying in bulk!\n" + num_of_dolls +
                        " Scrappy dolls cost $" + bulk_discount_cost + "0. Thank you!");}

            //If user wants to purchase more that zero but less than five
            else if (num_of_dolls > 0){
                System.out.print( num_of_dolls + " Scrappy dolls cost $" + cost + "0. Thank you!");}
            else {
                System.out.print("Have a nice day!");
            }
        }
    }
}

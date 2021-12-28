//Class: CSE 1321L
//Section:WJ1 JAVA
//Term: FALL 2021
//Instructor: Maneesha Penmetsa
//Name: Kristin Brewer
//Assignment#: 3B
//Days of the Month

import java.util.Scanner;

public class Assignment3B {
    //Program that asks the user what numb month i is and tells them how many days there are in that month.
    public static void main(String[] args) {

        Scanner keyboardInput = new Scanner(System.in);

        //Prompting user for month of the year, reading response, initializing variable
        System.out.print("What month of the year is it?: ");
        int month_num = keyboardInput.nextInt();

        //Switch determining output base off of days of the month provided by user month input
        switch(month_num){
            case 1: System.out.print("That is the month of January.\nThat month has 31 days in it!");
                break;
            case 2: System.out.print("That is the month of February.\nWhat year is it?: ");
                int yr = keyboardInput.nextInt();
                if(yr%4 == 0){
                    System.out.println("In a leap year, that month has 29 days in it!");}
                else{
                    System.out.println("In a normal year, that month has 28 days in it!");}
                break;
            case 3: System.out.print("That is the month of March.\nThat month has 31 days in it!");
                break;
            case 4: System.out.print("That is the month of April.\nThat month has 30 days in it!");
                break;
            case 5: System.out.print("That is the month of May.\nThat month has 31 days in it!");
                break;
            case 6: System.out.print("That is the month of June.\nThat month has 30 days in it!");
                break;
            case 7: System.out.print("That is the month of July.\nThat month has 31 days in it!");
                break;
            case 8: System.out.print("That is the month of August.\nThat month has 31 days in it!");
                break;
            case 9: System.out.print("That is the month of September.\nThat month has 30 days in it!");
                break;
            case 10: System.out.print("That is the month of October.\nThat month has 31 days in it!");
                break;
            case 11: System.out.print("That is the month of November.\nThat month has 30 days in it!");
                break;
            case 12: System.out.print("That is the month of December.\nThat month has 31 days in it!");
                break;
        }
    }



}


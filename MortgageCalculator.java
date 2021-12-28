package src;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {

        int principal = (int) readNumber("Principal ($1k - $1M): ", 1000,1000000);
        float interestRate = (float) readNumber("Annual Interest Rate : ", 1,30);
        byte years = (byte) readNumber("Period (Years): ", 1, 30);

        System.out.println("Mortgage: " + calculateMortgage(interestRate, principal, years));
    }

    public static double readNumber(String prompt,double min, double max) {
        Scanner scan = new Scanner(System.in);

        System.out.print(prompt);
        double value = scan.nextDouble();
        if (value < min || value > max) {
            System.out.println("Enter a number between " + min + " and "+ max);}
        return value;
    }

    public static String calculateMortgage(float interestRate, int principal, byte years) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        double monthlyInterestRate = (interestRate/PERCENT)/MONTHS_IN_YEAR;
        double numberOfPayments = years * MONTHS_IN_YEAR;

        double result = principal * (monthlyInterestRate*(Math.pow((monthlyInterestRate + 1), numberOfPayments))/((Math.pow((monthlyInterestRate + 1), numberOfPayments)) - 1));;

        NumberFormat mortgage = NumberFormat.getCurrencyInstance();
        String mortgagePrint = mortgage.format(result);

        return mortgagePrint;
    }
}

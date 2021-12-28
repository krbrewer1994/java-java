package src.RefactoredMortgageCalculator;

public class MortgageCalculator {
    //Variables
    private final byte MONTHS_IN_YEAR = 12;
    private final byte PERCENT = 100;

    private int principal;
    private float annualInterest;
    private byte years;

    //Constructor
    public MortgageCalculator(int principal, float annualInterest, byte years){
        this.principal = principal;
        this.annualInterest = annualInterest;
        this.years = years;
    }

    //Method calculating mortgage
    public double calculate_mortgage(){
        float monthlyInterest = getMonthlyInterest();
        float numberOfPayments = getNumberOfPayments();

        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        return mortgage;
    }

    //Method calculating mortgage balance
    public double calculate_balance(short numberOfPaymentsMade){
        float monthlyInterest = getMonthlyInterest();
        float numberOfPayments = getNumberOfPayments();

        double balance = principal
                * (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        return balance;
    }

    public double[] getRemainingBalances(){
        double[] balances = new double[getNumberOfPayments()];
        for (short month = 1; month <= balances.length; month++) {
            balances[month - 1]= calculate_balance(month);
            }
        return balances;
    }


    private float getMonthlyInterest() {
        return annualInterest / PERCENT / MONTHS_IN_YEAR;
    }

    private int getNumberOfPayments() {
        return years * MONTHS_IN_YEAR;
    }
}

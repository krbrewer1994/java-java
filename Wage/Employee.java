package src.Wage;

public class Employee {
    //Variables
    private int base_salary;
    private int hourly_rate;

    public static int number_of_employees;

    //Constructor
    public Employee(int base_salary, int hourly_rate){
        setBase_salary(base_salary);
        setHourly_rate(hourly_rate);
        number_of_employees++;
    }

    //Constructor overloaded
    public Employee(int base_salary){
        this(base_salary, 0);
    }

    public static void print_num_of_employees(){
        System.out.println(number_of_employees);
    }

    //Method that calculates employee wage
    public int calculate_wage(int extra_hours){
    return base_salary + (hourly_rate * extra_hours);}

    //Overloaded  method for calculate wage
    public int calculate_wage(){
        return calculate_wage(0);}

    //Getters and Setters for Base Salary
    private int getBase_salary() {
        return base_salary;
    }

    private void setBase_salary(int base_salary) {
        if (base_salary <= 0)
            throw new IllegalArgumentException("Salary cannot be 0 or less");
        this.base_salary = base_salary;
    }

    //Getters and Setters for Hourly rate
    private int getHourly_rate() {
        return hourly_rate;
    }

    private void setHourly_rate(int hourly_rate) {
        if (hourly_rate < 0){
            throw new IllegalArgumentException("Hourly rate can not be 0 or negative.");
        }
        this.hourly_rate = hourly_rate;
    }
}

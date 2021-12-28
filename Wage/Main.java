package src.Wage;

public class Main {
    public static void main(String[] args){
        var employee = new Employee(500_000, 20);
        Employee.print_num_of_employees();
        int wage = employee.calculate_wage();
        System.out.println(wage);
    }
}

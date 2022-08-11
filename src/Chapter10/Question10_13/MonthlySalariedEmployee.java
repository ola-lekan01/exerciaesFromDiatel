package Chapter10.Question10_13;

import Chapter10.Question10_13.Employee;
import Chapter8.Date.Date;

public class MonthlySalariedEmployee extends Employee {
    private double salary;

    public MonthlySalariedEmployee(String firstName, String lastName, String socialSecurityNumber, Date birthDate, double salary){
        super(firstName, lastName, socialSecurityNumber, birthDate);

        if(salary < 0.0)
            throw new IllegalArgumentException("Weekly Salary must be greater than 0.0");
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double getPaymentAmount(){
        return getSalary();
    }
    @Override
    public String toString(){
        return String.format("%sEarnings: %.2f%n" , super.toString(), getSalary());
    }
}

package Chapter10.Question10_13;

import Chapter10.Question10_13.Employee;
import Chapter8.Date.Date;

public class HourlyEmployee extends Employee {
    private double wage;
    private double hours;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, Date birthDate, double hours, double wage){
        super(firstName, lastName, socialSecurityNumber, birthDate);

        if(wage < 0.0)
            throw new IllegalArgumentException("Hourly Wage must be greater than 0.0");

        if(hours <= 0.0 || hours >= 168.0)
            throw new IllegalArgumentException("Hour must be greater than 0.0 Hours or less than 168 Hours");
        this.wage = wage;
        this.hours = hours;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        if(wage < 0.0)
            throw new IllegalArgumentException("Hourly Wage must be greater than 0.0");
        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        if(hours <= 0.0 || hours >= 168.0)
            throw new IllegalArgumentException("Hours worked must be greater than 0.0 Hours or less than 168 Hours");
        this.hours = hours;
    }

    @Override
    public double getPaymentAmount(){
        if (getHours() <= 40)
            return getHours() * getHours();
        else
            return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
    }
    @Override
    public String toString(){
        return String.format("%sHours Worked: %.2f%nWages Per Hour: %.2f%nEarnings: %.2f%n" , super.toString(), getHours(), getWage(), getPaymentAmount());
    }
}

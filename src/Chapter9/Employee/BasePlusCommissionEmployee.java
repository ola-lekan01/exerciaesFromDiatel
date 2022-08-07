package Chapter9.Employee;

import Chapter8.Date.Date;

public class BasePlusCommissionEmployee extends CommissionEmployee{
    private static double baseSalary;

    public BasePlusCommissionEmployee(String fName, String lName, int social_Security_Number, Date birthDate, Date hireDate, double grossSales, double commissionRate, double baseSalary) {
        super(fName, lName, social_Security_Number, birthDate, hireDate, grossSales, commissionRate);
        BasePlusCommissionEmployee.baseSalary = baseSalary;
    }

    public static void setBaseSalary(double baseSalary) {
        if (baseSalary < 0.0)
            throw new IllegalArgumentException(
                    "Base salary must be >= 0.0");
        BasePlusCommissionEmployee.baseSalary = baseSalary;
    }

    public static double getBaseSalary() {
        return baseSalary;
    }

    public static double earnings() {
        return baseSalary + (CommissionEmployee.earnings());
    }

    public String toString(){
        return String.format("%sBase Salary: %.2f%nEarnings: %.2f%n", super.toString(), baseSalary , earnings());
    }
}

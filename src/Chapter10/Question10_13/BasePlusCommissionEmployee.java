package Chapter10.Question10_13;

import Chapter8.Date.Date;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee(String fName, String lName, String socialSecurityNumber, Date birthDate, double grossSales, double commissionRate, double baseSalary) {
        super(fName, lName, socialSecurityNumber, birthDate, grossSales, commissionRate);

        if (baseSalary < 0.0)
            throw new IllegalArgumentException(
                    "Base salary must be >= 0.0");
        this.baseSalary = baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0.0)
            throw new IllegalArgumentException(
                    "Base salary must be >= 0.0");
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double getPaymentAmount() {
        return baseSalary + super.getPaymentAmount();
    }

    public String toString(){
        return String.format("%sBase Salary: %.2f%nEarnings: %.2f%n", super.toString(), baseSalary , getPaymentAmount());
    }
}

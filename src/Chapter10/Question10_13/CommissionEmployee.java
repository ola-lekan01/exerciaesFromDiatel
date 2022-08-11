package Chapter10.Question10_13;

import Chapter10.Question10_13.Employee;
import Chapter8.Date.Date;

public class CommissionEmployee extends Employee {
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String fName, String lName, String socialSecurityNumber, Date birthDate, double grossSales, double commissionRate) {
        super(fName, lName, socialSecurityNumber, birthDate);
        if (grossSales < 0.0)
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        if (commissionRate <= 0.0 || commissionRate >= 1.0)
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");

        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        if (grossSales < 0.0)
            throw new IllegalArgumentException("Gross sales must be greater than or equal to 0.0");
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        if (commissionRate <= 0.0 || commissionRate >= 1.0)
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        this.commissionRate = commissionRate;
    }

    @Override
    public double getPaymentAmount() {
        return getCommissionRate() * getGrossSales();
    }

    @Override
    public String toString (){
        return String.format("%sGrossSales: %.2f%nCommission Rate: %.2f%nEarnings: %.2f%n" , super.toString(), grossSales, commissionRate, getPaymentAmount());
    }
}

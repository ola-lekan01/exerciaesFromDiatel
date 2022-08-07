package Chapter9.Employee;

import Chapter8.Date.Date;

public class CommissionEmployee extends Employee{
    private static double grossSales;
    private static double commissionRate;

    public CommissionEmployee(String fName, String lName, int social_Security_Number, Date birthDate, Date hireDate, double grossSales, double commissionRate) {
        super(fName, lName, social_Security_Number, birthDate, hireDate);
        if (grossSales < 0.0)
           throw new IllegalArgumentException("Gross sales must be >= 0.0");
        if (commissionRate <= 0.0 || commissionRate >= 1.0)
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");

        CommissionEmployee.grossSales = grossSales;
        CommissionEmployee.commissionRate = commissionRate;
    }

    @Override
    public String toString (){
        return String.format("%sGrossSales: %.2f%nCommission Rate: %.2f%nEarnings: %.2f%n" , super.toString(), grossSales, commissionRate, earnings());
    }

    public static double earnings() {
        return commissionRate * grossSales;
    }
}

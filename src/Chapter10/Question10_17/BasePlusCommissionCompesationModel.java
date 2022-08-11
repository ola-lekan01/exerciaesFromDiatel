package Chapter10.Question10_17;

public class BasePlusCommissionCompesationModel extends CommisionCompesationModel{
    private double baseSalary;

    public BasePlusCommissionCompesationModel(double commissionRate, double grossSales, double baseSalary) {
        super(commissionRate, grossSales);
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

    @Override
    public double earnings() {
        return super.earnings() + getBaseSalary();
    }

    public String toString(){
        return String.format("%sBase Salary: %.2f%nEarnings: %.2f%n", super.toString(), baseSalary , earnings());
    }
}

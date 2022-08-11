package Chapter10.Question10_17;

public class CommisionCompesationModel extends Employee{
    private double commissionRate;
    private double grossSales;

    public CommisionCompesationModel(String firstName, String lastName, String social_Security_Number, CompensationModel compensationModel, double grossSales, double commissionRate ) {
        super(firstName, lastName, social_Security_Number, compensationModel);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    @Override
    public double earnings() {
        return getCommissionRate() * getGrossSales();
    }
    @Override
    public String toString (){
        return String.format("%sGrossSales: %.2f%nCommission Rate: %.2f%nEarnings: %.2f%n" , super.toString(), grossSales, commissionRate, earnings());
    }
}

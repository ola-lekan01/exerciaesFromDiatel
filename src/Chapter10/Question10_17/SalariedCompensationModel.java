package Chapter10.Question10_17;

public class SalariedCompensationModel implements CompensationModel {

    private final double weeklySalary;

    public SalariedCompensationModel(double weeklySalary) {
        if(weeklySalary < 0.0)
            throw new IllegalArgumentException("Weekly Salary must be greater than 0.0");
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    @Override
    public double earnings() {
        return getWeeklySalary();
    }
    @Override
    public String toString(){
        return String.format("%sEarnings: %.2f%n" , super.toString(), earnings());
    }
}

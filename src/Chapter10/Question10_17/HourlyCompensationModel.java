package Chapter10.Question10_17;

public class HourlyCompensationModel implements CompensationModel {
    private double wage;
    private double hour;

    public HourlyCompensationModel(double wage, double hour) {
        if(hour <= 0.0 || hour >= 168.0)
            throw new IllegalArgumentException("Hours worked must be greater than 0.0 Hours or less than 168 Hours");
        this.hour = hour;
        if(wage < 0.0)
            throw new IllegalArgumentException("Hourly Wage must be greater than 0.0");

        this.wage = wage;
        this.hour = hour;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        if(hour <= 0.0 || hour >= 168.0)
            throw new IllegalArgumentException("Hours worked must be greater than 0.0 Hours or less than 168 Hours");
        this.hour = hour;
    }
    @Override
    public double earnings() {
        if (getHour() <= 40)
            return getHour() * getHour();
        else
            return 40 * getWage() + (getHour() - 40) * getWage() * 1.5;
    }
}

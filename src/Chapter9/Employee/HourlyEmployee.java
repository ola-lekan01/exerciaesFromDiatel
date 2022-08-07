package Chapter9.Employee;

import Chapter8.Date.Date;

public class HourlyEmployee extends Employee{
    private static double hour;
    private static double wage;
    private static double earnings;
    public HourlyEmployee(String fName, String lName, int social_Security_Number, Date birthDate, Date hireDate, double hour, double wage) {
        super(fName, lName, social_Security_Number, birthDate, hireDate );
        if (hour > 0 && hour <= 168){
        HourlyEmployee.hour = hour;
        }

        if(wage > 0) {
            HourlyEmployee.wage = wage;}
    }

    public static double getHour() {
        return hour;
    }

    public static void setHour(double hour) throws Exception {
        if (hour > 0 && hour <= 168){
            HourlyEmployee.hour = hour;
        }
        else throw new Exception("Hours Worked Must be Between 0 and 168");
    }

    public static double getWage() {
        return wage;
    }

    public static void setWage(double wage) throws Exception{
        if(wage > 0) {
            HourlyEmployee.wage = wage;}
        else throw new Exception("Wage must be greater than Zero");
    }

    public static double earnings(){
        if(getHour() <= 40){
        return earnings = getWage() * getHour();}

        else return getWage() * 40 + (getHour() - 40) *  getWage() * 1.5;
    }

    public String toString (){
        return String.format("%sHours Worked: %.2f%nWage: %.2f%nEarnings: %.2f%n" ,super.toString(), hour, wage, earnings());
    }

}

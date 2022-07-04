package chapter3;

import java.util.Calendar;

public class HeartRateTest {

    Calendar cal = Calendar.getInstance();

    private String fName;
    private String lName;
    private int dayOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;
    private int Age;
    private int maxHeartRate;

    public HeartRateTest(String fName , String lName , int dayOfBirth , int monthOfBirth , int yearOfBirth)
    {   this.fName = fName;
        this.lName = lName;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(int dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public void setMonthOfBirth(int monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public void setAge(int Age){
        this.Age = Age;
    }

    public int getAge(){
        this.Age = Age;
        return yearOfBirth - cal.get(Calendar.YEAR);
    }

    public int maxHeartRate(int Age){
        this.maxHeartRate = maxHeartRate;
        return 220 - Age;
    }

    public double BMI(double maxHeartRate){

        return maxHeartRate * 0.85;
    }


}

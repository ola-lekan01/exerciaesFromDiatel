package chapter3;

public class HealthProfile {

// Declaration of Attributes

    private String fName;
    private String lName;
    private String gender;
    private int yearOfBirth;
    private int monthOfBirth;
    private int dayOfBirth;
    private double height;
    private double weight;


//Health Profile Constructor with its Parameters

    public HealthProfile(String fName , String lName , String gender , int yearOfBirth , int monthOfBirth , int dayOfBirth , double height , double weight)

    {
        this.fName = fName;
        this.lName = lName;
        this.gender = gender;
        this.yearOfBirth = yearOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.dayOfBirth = dayOfBirth;
        this.height = height;
        this.weight = weight;

    }

    // To Set the First Name
    public void setfName(String fName) {
        this.fName = fName;
    }

    // To get the First Name
    public String getfName() {
        return fName;
    }

    // To Set the Last Name
    public void setlName(String lName) {
        this.lName = lName;
    }

    // To get the Last Name
    public String getlName() {
        return lName;
    }

    // To Set the Gender Name
    public void setgender(String gender) {
        this.gender = gender;
    }

    // To get the Gender Name
    public String getgender() {
        return gender;
    }

    // To Set the Year of Birth
    public void setyearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    // To get the Year of Birth
    public int getyearOfBirth() {
        return yearOfBirth;
    }


    // To Set the Month of Birth
    public void setmonthOfBirth(int monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }

    // To get the Month of Birth
    public int getmonthOfBirth() {
        return monthOfBirth;
    }

    // To Set the Day of Birth
    public void setdayOfBirth(int dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    // To get the Day of Birth
    public int getdayOfBirth() {
        return dayOfBirth;
    }

    // To Calculate Age
    public int age() {
        return (2022 - yearOfBirth);
    }

    // To Set the Height Name
    public void setheight(double height) {
        this.height = height;
    }

    // To get the Height Name
    public double getheight() {
        return height;
    }

    // To Set the Weight
    public void setweight(double weight) {
        this.weight = weight;
    }

    // To get the Weight Name
    public double getweight() {
        return weight;
    }

//To calculate Maximum Heart Rate

    public String heartRate() {
        return "Your Maximum Heart Rate is" + (220 - age()); }

//To calculate Body Mass Index

    public String bodyMassIndex() {
        return "Your Body Mass index" + ((weight * 0.45359237) / ((height * 0.0254) * (height * 0.0254)));

    }

}

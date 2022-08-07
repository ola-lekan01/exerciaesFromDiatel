package Chapter9.Employee;

import Chapter8.Date.Date;

public class Employee {
    private static String fName, lName, birthDate, hireDate;
    private static int social_Security_Number;

    public Employee(String fName, String lName, int social_Security_Number, Date birthDate, Date hireDate){
        Employee.fName = fName;
        Employee.lName = lName;
        Employee.social_Security_Number = social_Security_Number;
        Employee.birthDate = String.valueOf(birthDate);
        Employee.hireDate = String.valueOf(hireDate);
    }

    public static String getfName() {
        return fName;
    }

    public static String getlName() {
        return lName;
    }

    public static int getSocial_Security_Number() {
        return social_Security_Number;
    }


    public String toString (){
        return String.format("First Name: %s%nLast Name: %s%nSocial Security Number: %d%nBirthDate: %s%nHireDate: %s%n" , fName, lName, social_Security_Number, birthDate, hireDate);
    }

}

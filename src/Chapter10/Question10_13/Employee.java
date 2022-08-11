package Chapter10.Question10_13;

import Chapter10.Question10_16.Payable;
import Chapter8.Date.Date;

public abstract class Employee implements Payable {
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    private final String birthDate;

    public Employee(String firstName, String lastName, String socialSecurityNumber, Date birthDate){
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.birthDate = String.valueOf(birthDate);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public String getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString(){
        return String.format("FirstName: %s%nLastName: %s%nSocial Security Number: %s%nBirth Date: %s%n", getFirstName(), getLastName(), getSocialSecurityNumber(), birthDate);
    }

}

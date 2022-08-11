package Chapter10.Question10_17;

public class Employee implements CompensationModel{

    private final String firstName;
    private final String lastName;
    private final String social_Security_Number;
    private CompensationModel compensationModel;

    public Employee(String firstName, String lastName, String social_Security_Number, CompensationModel compensationModel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.social_Security_Number = social_Security_Number;
        this.compensationModel = compensationModel;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocial_Security_Number() {
        return social_Security_Number;
    }

    public CompensationModel getCompensationModel() {
        return compensationModel;
    }

    public void setCompensationModel(CompensationModel compensationModel) {
        this.compensationModel = compensationModel;
    }

    @Override
    public double earnings() {
        return compensationModel.earnings();
    }

    public String toString(){
        return String.format("First Name: %sLast Name:%sSocial Security Number:%s", getFirstName(), getLastName(),getSocial_Security_Number());
    }
}

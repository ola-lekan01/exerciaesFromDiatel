package Chapter9.Employee;

import Chapter8.Date.Date;

public class MainClass {
    public static void main(String[] args) throws Exception {
        Date birthDate = new Date(7,10,2020);
        Date hireDate = new Date(5, 5, 2010);
        Employee employee = new Employee("John", "Rossy", 222_56_3453, birthDate, hireDate);
        System.out.println("Employee Details");
        System.out.println(employee);

        BasePlusCommissionEmployee basePlusCommissionEmployee
                = new BasePlusCommissionEmployee("Base" , "Commission Employee" , 223_45_345, birthDate, hireDate, 2000, 0.5, 3000 );
        System.out.println("Base Commission Employee");
        System.out.println(basePlusCommissionEmployee);


        HourlyEmployee hourlyEmployee =
                new HourlyEmployee("Hourly" , "Employee", 345_34_353, birthDate, hireDate, 100, 250);
        System.out.println("Hourly Employee");
        System.out.println(hourlyEmployee);
    }
}

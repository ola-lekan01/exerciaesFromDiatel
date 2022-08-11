package Chapter10.Question10_16;

import Chapter10.Question10_13.*;
import Chapter10.Question10_15.PieceWorker;
import Chapter8.Date.Date;

public class payAbleInterfaceTest {
    public static void main(String[] args) {

        Date mattDate = new Date(10 ,6, 1994);
        Date danDate = new Date(10 ,11, 1980);
        Date samDate = new Date(3 ,5, 2000);
        Date brianDate = new Date(15 ,8, 2002);
        Date gateDate = new Date(16 ,10, 1992);
        Date newDate = new Date(13 ,10, 1995);

        Employee[] employees = new Employee[6];

        MonthlySalariedEmployee monthlySalariedEmployeeMatt = new MonthlySalariedEmployee("Matt" , "JohnNew", "222_32_8448" , mattDate, 25_000);
        MonthlySalariedEmployee monthlySalariedEmployeeDan = new MonthlySalariedEmployee("Dan" , "Banks", "222_32_8448" , danDate, 25_000);
        BasePlusCommissionEmployee basePlusCommissionEmployeeSam = new BasePlusCommissionEmployee("Sam" , "Base", "234_34_3432", samDate, 10_000, 0.5, 5_000);
        HourlyEmployee hourlyEmployeeBrian = new HourlyEmployee("Brian", "Lakes", "223_23_9384", brianDate, 120, 1250 );
        CommissionEmployee commissionEmployeeGate = new CommissionEmployee("Gate" , "James", "229_384_3434", gateDate, 15_000, 0.8);
        PieceWorker pieceWorkerHope = new PieceWorker("New", "Great", "345_56_8364",  newDate,400, 65);

        employees[0] = monthlySalariedEmployeeMatt;
        employees[1] = monthlySalariedEmployeeDan;
        employees[2] = basePlusCommissionEmployeeSam;
        employees[3] = hourlyEmployeeBrian;
        employees[4] = commissionEmployeeGate;
        employees[5] = pieceWorkerHope;

        for(Employee currentEmployee : employees){
            System.out.println("This worker is a " + currentEmployee.getClass().getSimpleName());
            System.out.printf("%s", currentEmployee);

            if (currentEmployee instanceof BasePlusCommissionEmployee employee)
            { employee.setBaseSalary(1.10 * employee.getBaseSalary());
                System.out.printf("The new Base Salary with 10%% increase is: %.2f%n%n", employee.getBaseSalary());
            }
            System.out.printf("Earned: %.2f%n%n", currentEmployee.getPaymentAmount());
        }
    }
}

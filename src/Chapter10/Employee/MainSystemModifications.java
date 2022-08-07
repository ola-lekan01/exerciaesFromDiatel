package Chapter10.Employee;

import Chapter8.Date.Date;

public class MainSystemModifications {
    public static void main(String[] args) throws Exception {
        Date johnDate = new Date(30 ,6, 1994);
        Date bankeDate = new Date(10 ,5, 1980);
        Date jamesDate = new Date(3 ,3, 2000);
        Date kelDate = new Date(13 ,12, 2002);
        Date lakesDate = new Date(16 ,11, 1992);
        Date hopeDate = new Date(13 ,8, 1995);

        Employee [] employees = new Employee[6];

        MonthlySalariedEmployee monthlySalariedEmployeeJohn = new MonthlySalariedEmployee("John" , "JohnNew", "222_32_8448" , johnDate, 25_000);
        MonthlySalariedEmployee monthlySalariedEmployeeBanke = new MonthlySalariedEmployee("Banke" , "Banks", "222_32_8448" , bankeDate, 25_000);
        BasePlusCommissionEmployee basePlusCommissionEmployeeKelz = new BasePlusCommissionEmployee("Kelz" , "BaseKelz", "234_34_3432", kelDate, 10_000, 0.5, 5_000);
        HourlyEmployee hourlyEmployeeLakes = new HourlyEmployee("Lakers", "Lakes", "223_23_9384", lakesDate, 120, 1250 );
        CommissionEmployee commissionEmployeeJames = new CommissionEmployee("James" , "James", "229_384_3434", jamesDate, 15_000, 0.8);
        PieceWorker pieceWorkerHope = new PieceWorker("Hope", "Great", "345_56_8364",  hopeDate,400, 65);

        employees[0] = monthlySalariedEmployeeJohn;
        employees[1] = basePlusCommissionEmployeeKelz;
        employees[2] = monthlySalariedEmployeeBanke;
        employees[3] = hourlyEmployeeLakes;
        employees[4] = commissionEmployeeJames;
        employees[5] = pieceWorkerHope;


        for(Employee currentEmployee : employees){
            System.out.println("This worker is a " + currentEmployee.getClass().getSimpleName());
            System.out.println(currentEmployee);
        }

    }
}

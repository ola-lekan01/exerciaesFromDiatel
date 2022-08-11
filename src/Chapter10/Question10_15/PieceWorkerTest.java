package Chapter10.Question10_15;

import Chapter10.Question10_13.Employee;
import Chapter8.Date.Date;

public class PieceWorkerTest {
    public static void main(String[] args) throws Exception {
        Date johnDate = new Date(30 ,6, 1994);
        Date bankeDate = new Date(10 ,5, 1980);
        Date jamesDate = new Date(3 ,3, 2000);
        Date lakesDate = new Date(16 ,11, 1992);
        Date hopeDate = new Date(13 ,8, 1995);

        Employee[] employees = new Employee[6];


        PieceWorker pieceWorkerHope = new PieceWorker("Hope", "Great", "335_52_8398",  hopeDate,400, 15);
        PieceWorker pieceWorkerJohn = new PieceWorker("John", "NewJohn", "356_36_8364",  hopeDate,40, 25);
        PieceWorker pieceWorkerBanke = new PieceWorker("Hope", "Great", "295_46_8364",  hopeDate,30, 50);
        PieceWorker pieceWorkerLakes = new PieceWorker("Hope", "Great", "195_56_8434",  hopeDate,20, 45);
        PieceWorker pieceWorkerJames = new PieceWorker("Hope", "Great", "645_36_8494",  hopeDate,54, 35);

        employees[0] = pieceWorkerBanke;
        employees[1] = pieceWorkerHope;
        employees[2] = pieceWorkerHope;
        employees[3] = pieceWorkerLakes;
        employees[4] = pieceWorkerJohn;
        employees[5] = pieceWorkerHope;


        for(Employee currentEmployee : employees){
            System.out.println("This worker is a " + currentEmployee.getClass().getSimpleName());
            System.out.println(currentEmployee);
        }
    }
}

package Chapter10.Question10_17;

public class CompensationModelTest {
    public static void main(String[] args) {
        Employee employee = new Employee("Kelz", "Wellz", "223_343_8374", new SalariedCompensationModel(2000));
        Employee employee1 = new Employee("Temmy", "Tells", "658_373_7364", new HourlyCompensationModel(400, 10));
        Employee employee2 = new Employee("Grace", "Grace", "673_837_7836", new BasePlusCommissionCompesationModel(0.5, 400, 300));
//        Employee employee3 = new Employee("Lekan" , "Lakes", "673_736_8736", c);

        System.out.println(employee);
        System.out.println(employee1);
        System.out.println(employee2);
    }
}

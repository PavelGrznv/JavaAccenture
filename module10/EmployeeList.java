import java.util.ArrayList;
import java.util.List;

public class EmployeeList {

    public static void main(String[] args) {
        Employee pavlo = new Employee("Pavlo", 21, "QA Engineer", "Onlyplay", 1200.0);
        Employee anna = new Employee("Anna", 26, "Developer", "Meta", 2600.0);
        Employee katerina = new Employee("Katerina", 29, "Designer", "Google", 1900.0);
        Employee vlad = new Employee("Vlad", 31, "Team Lead", "IBM", 3200.0);
        Employee ivan = new Employee("Ivan", 25, "Analyst", "DataArt", 2200.0);

        List<Employee> empList = new ArrayList<>();
        empList.add(pavlo);
        empList.add(anna);
        empList.add(katerina);
        empList.add(vlad);
        empList.add(ivan);

        System.out.println("The Employee whose salary is the highest is: "
                + Employee.getHighestPaidEmp(empList));
    }
}

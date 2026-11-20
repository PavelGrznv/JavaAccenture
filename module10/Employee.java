import java.util.List;

public class Employee extends Person {
    private String jobTitle;
    private String company;
    private double salary;

    public Employee() {
    }

    public Employee(String name, int age, String jobTitle, String company, double salary) {
        setName(name);
        setAge(age);
        this.jobTitle = jobTitle;
        this.company = company;
        this.salary = salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void introduce() {
        System.out.println("My name is " + getName() + " and I am " + getAge() + " years old");
        System.out.println("I am work as " + jobTitle + " in " + company
                + " and my salary is " + salary);
    }

public static String getHighestPaidEmp(List<Employee> employees) {
    if (employees.isEmpty()) {
        throw new IllegalArgumentException("Employee list is empty");
    }

    Employee highestPaid = employees.get(0);

    for (Employee employee : employees) {
        if (employee.getSalary() > highestPaid.getSalary()) {
            highestPaid = employee;
        }
    }

    return highestPaid.getName();
}

}
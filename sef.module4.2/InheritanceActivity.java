public class InheritanceActivity {
    public static void main(String[] args) {
        Person_I myPerson = new Person_I();
        myPerson.setName("Jane Doe");
        myPerson.setAge(22);

        System.out.println("-----------------------------");

        Employee_I myEmployee = new Employee_I();
        myEmployee.setSalary(12345.00);
        myEmployee.setTitle("Senior Developer");
        myEmployee.setAge(66);
        myEmployee.setName("John Doe");

        System.out.println("-----------------------------");

        System.out.println("Employee's Name is   : " + myEmployee.getName());
        System.out.println("Employee's Age is    : " + myEmployee.getAge());
        System.out.println("Employee's Title is  : " + myEmployee.getTitle());
        System.out.println("Employee's Salary is : " + myEmployee.getSalary());

        System.out.println("-----------------------------");

        System.out.println("Person's Name is    : " + myPerson.getName());
        System.out.println("Person's Age is     : " + myPerson.getAge());
    }
}
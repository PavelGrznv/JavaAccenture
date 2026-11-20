public class AbstractActivity {
    public static void main(String[] args) {
        Employee employee = new Employee("Pavlo", 21, "Junior QA Engineer", "Onlyplay", 1200.0);
        employee.introduce();

        Students student = new Students();
        student.setSchoolName("Vilniaus Gediminas Technikos Universitetas");
        student.introduce();
    }
}
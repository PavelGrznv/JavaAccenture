public class CustomExceptionActivityTest {

    public static void main(String[] args) {
        CustomExceptionActivityTest activity = new CustomExceptionActivityTest();
        String[] namesToTest = {"John", "Jane", "Peter"};

        for (String name : namesToTest) {
            System.out.println("Checking user: " + name);

            try {
                activity.validateUser(name);
            } catch (CustomExceptionActivity e) {
                System.out.println(e.getMessage());
            }
        }
    }

    void validateUser(String name) throws CustomExceptionActivity {
        String[] validUsers = {"John", "Mike", "Peter", "Parker"};
        int flag = 0;

        for (String validUser : validUsers) {
            if (validUser.equals(name)) {
                flag = 1;
                break;
            }
        }

        if (flag == 0) {
            throw new CustomExceptionActivity();
        }

        System.out.println("Welcome to Payroll program");
    }
}
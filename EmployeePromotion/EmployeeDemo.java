public class EmployeeDemo {

    public static void main(String[] args) {

        SeniorDeveloper employee = new SeniorDeveloper();

        employee.setName("Sushmitha");
        employee.setEmployeeId(101);
        employee.setProgrammingLanguage("Java");
        employee.setExperience(5);

        employee.displayEmployeeDetails();
        employee.displayDeveloperDetails();
        employee.displaySeniorDetails();

    }

}
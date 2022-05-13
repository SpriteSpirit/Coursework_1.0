public class Main
{
    public static void main(String[] args)
    {
        Employee employer;
        employer = new Employee();
        employer.addNameToList("John");
        employer.setFirstName("John");
        employer.setLastName("Martins");
        employer.setPatronymic("P.");
        employer.setDepartment(2);
        employer.setSalary(72000.6f);

        Employee employer2;
        employer2 = new Employee();
        employer.addNameToList("Kate");
        employer.setFirstName("Kate");
        employer.setLastName("Stevens");
        employer.setPatronymic("G.");
        employer.setDepartment(3);
        employer.setSalary(63000.1f);

        employer.getEmployeesCount();
        employer.EmployeesCount();



    }
}

@SuppressWarnings("ALL")
public class Main {


    public static void allEmploees(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static void minSalary(Employee[] employees) {
        int minSalary = employees[0].getSalary();
        String employer = "";
        for (Employee employee: employees) {
            if (minSalary > employee.getSalary()) {
                minSalary = employee.getSalary();
                employer = employee.getFirstName() + " " + employee.getLastName() + " " + employee.getPatronymic();
            }
        }
        System.out.println("Employer's minimum salary: " + minSalary + "$ is " + employer);
    }

    public static void maxSalary(Employee[] employees) {
        int maxSalary = employees[0].getSalary();
        String employer = "";
        for (Employee employee: employees) {
            if (maxSalary < employee.getSalary()) {
                maxSalary = employee.getSalary();
                employer = employee.getFirstName() + " " + employee.getLastName() + " " + employee.getPatronymic();
            }
        }
        System.out.println("Employer's maximum salary: " + maxSalary + "$ " + employer);
    }

    public static int sumEmployeesSalaries(Employee[] employees) {
        int sum = 0;
        for (Employee employee: employees) {
           sum += employee.getSalary();
        }
        System.out.println("Total summary salaries for all stuff in month: " + sum + "$");
        return sum;
    }

    public static void averageSalary(Employee[] employees) {
        // int sum = sumEmployeesSalaries(employees); // из-за вызова функции здесь - в консоль дублируется sout
        int sum = 0;
        for (Employee employee: employees) {
            sum += employee.getSalary();
        }
        int average = sum / employees.length;
        System.out.println("Average salary: " + average + "$");
    }

    public static void countEmployees(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println("Companie's employees: " + employee.getFirstName() + " " + employee.getLastName() + " " + employee.getPatronymic());
        }
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Kate", "Middleton", "D.", 2, 1520);
        employees[1] = new Employee("Peter", "Johnson", "P.", 3, 1200);
        employees[2] = new Employee("Samuel", "Jackson", "K.", 2, 1707);
        employees[3] = new Employee("Kevin", "Stilton", "S.", 1, 1009);
        employees[4] = new Employee("Monika", "Geller", "L.", 2, 1503);
        employees[5] = new Employee("Karen", "Watson", "T.", 1, 1007);
        employees[6] = new Employee("Chandlen", "Bing", "A.", 3, 2001);
        employees[7] = new Employee("Tedd", "Rogers", "Y.", 4, 1305);
        employees[8] = new Employee("Patricia", "Anderson", "C.", 5, 1908);
        employees[9] = new Employee("Joane", "Wilson", "B.", 5, 1357);

        allEmploees(employees);
        minSalary(employees);
        maxSalary(employees);
        sumEmployeesSalaries(employees);
        averageSalary(employees);
        countEmployees(employees);

    }
}
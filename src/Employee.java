
public class Employee {
    // Статичные константы:
    private final int id;
    private String firstName;
    private String lastName;
    private String patronymic;
    private int department;
    private int salary;
    private static int count;

  /*  static { // инициализатор
        firstName = new String[]{"Karen", "John", "Phil", "Greg", "Monika"};
        lastNames = new String[]{"Smith", "Wilson", "Johnson", "Peterson", "Geller"};
        patronymics = new String[]{"B.", "T.", "S.", "L.", "C."};
        department = new int[]{1, 2, 3, 4, 5};
        salaries = new float[]{5000.0f, 7000.0f, 3000.0f, 3500.0f, 4000.0f};
        ids = new int[5];
        count = 0;
    }
*/

    public Employee(String firstName, String lastName, String patronymic, int department, int salary) {
        this.id = getEmployeesCount();
        count++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.department = department;
        this.salary = salary;
    }

    /*public void addNameToList(String firstName) {
        this.firstName = firstName;
        this.employees = new Employee[10];
    } */

    // геттеры и сеттеры
    // firstName
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // lastName
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // patronymic
    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    // department
    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    // salary
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    /*
    public float getEmployeesSalary() {
        float employeesSalary = 0.0f;
        for (Employee employee : this.employees) {
            employeesSalary += employee.getSalary();
        }
        return employeesSalary;
    }

    public float setEmployeesSalary(float employeesSalary) {
        for (Employee employee : this.employees) {
            employee.setSalary(employeesSalary);
        }
        return employeesSalary;
    }
*/
    // id count

    public int getId() {
        return id;
    }

    public static int getEmployeesCount() {
        return count;// this.employees.length;
    }
/*
    public void EmployeesCount() {
        for (Employee employee : this.employees) {
            count++;
            id = count;
            System.out.println(id + " " + firstName + " " + lastName + " " + patronymic + " " + department + " " + salary);

        }
    }


     Метод, возвращающий ссылку на работника по фамилии и имени.

    public Employee getEmployeeByName(String lastName, String firstName) {
        for (Employee employee : this.employees) {
            if (employee.getFirstName().equals(firstName) && employee.getLastName().equals(lastName)) {
                return employee;
            }
        }
        return null;
    }
*/


   @Override
    public String toString() {
        return " ID number: " + id +
                " Full Name: "  + firstName + " " + lastName + " " + patronymic + " " +
                " Department: " + department +
                " Salary: " + salary + "$";
    }

    /*
     * Метод, возвращающий массив работников отдела.
     *
     * @return массив работников отдела.

    public Employee[] getEmployees() {
        Employee[] resultEmployees = new Employee[this.employees.length];
        System.arraycopy(this.employees, 0, resultEmployees, 0, this.employees.length);
        return resultEmployees;
    }

*/
}
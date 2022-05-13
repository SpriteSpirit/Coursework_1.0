
public class Employee {
    // Статичные константы:
    private static int id;
    private static String firstName;
    private static String lastName;
    private static String patronymic;
    private static int department;
    private static float salary;
    private static int count;
    private Employee[] employees;

    static { // инициализатор
       /* firstName = new String[]{"Karen", "John", "Phil", "Greg", "Monika"};
        lastNames = new String[]{"Smith", "Wilson", "Johnson", "Peterson", "Geller"};
        patronymics = new String[]{"B.", "T.", "S.", "L.", "C."};
        department = new int[]{1, 2, 3, 4, 5};
        salaries = new float[]{5000.0f, 7000.0f, 3000.0f, 3500.0f, 4000.0f};
        ids = new int[5];
        count = 0;*/
    }

    public Employee() {

    }

    public Employee(int id, String firstName, String lastName, String patronymic, int department, float salary) {
        Employee.id = id;
        Employee.firstName = firstName;
        Employee.lastName = lastName;
        Employee.patronymic = patronymic;
        Employee.department = department;
        Employee.salary = salary;
    }

    public void listEmployee(Employee[] employees) {
        this.employees = employees;
    }

    public void addNameToList(String firstName) {
        Employee.firstName = firstName;
        this.employees = new Employee[10];
    }

    // геттеры и сеттеры
    // firstName
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        Employee.firstName = firstName;
    }

    // lastName
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        Employee.lastName = lastName;
    }

    // patronymic
    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        Employee.patronymic = patronymic;
    }

    // department
    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        Employee.department = department;
    }

    // salary
    private float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        Employee.salary = salary;
    }

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

    // id count
    public int getEmployeesCount() {
        return this.employees.length;
    }

    public void EmployeesCount() {
        for (Employee employee : this.employees) {
            count++;
            id = count;
            System.out.println(id + " " + firstName + " " + lastName + " " + patronymic + " " + department + " " + salary);

        }
    }

    /**
     * Метод, возвращающий ссылку на работника по фамилии и имени.
     *
     * @param lastName  фамилия.
     * @param firstName имя.
     * @return ссылка на работника.
     */
    public Employee getEmployeeByName(String lastName, String firstName) {
        for (Employee employee : this.employees) {
            if (employee.getFirstName().equals(firstName) && employee.getLastName().equals(lastName)) {
                return employee;
            }
        }
        return null;
    }




   /* @Override
    public String toString() {
        return id + ": " + ;
    }*/

    /**
     * Метод, возвращающий массив работников отдела.
     *
     * @return массив работников отдела.
     */
    public Employee[] getEmployees() {
        Employee[] resultEmployees = new Employee[this.employees.length];
        System.arraycopy(this.employees, 0, resultEmployees, 0, this.employees.length);
        return resultEmployees;
    }


}
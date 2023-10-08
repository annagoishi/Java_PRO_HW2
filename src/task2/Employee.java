package task2;
//Создайте классы Сотрудник, Директор, Департамент и Организация.
// Создайте необходимые поля в каждом классе.
// Какие виды отношений будут между указанными классами?
public class Employee extends Department {
    private String firstName;
    private String lastName;
    private int employeeId;
    private double salary;

    public Employee(String organizationName, String departmentName, float departmentId, String firstName, String lastName, int employeeId, double salary) {
        super(organizationName, departmentName, departmentId);
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

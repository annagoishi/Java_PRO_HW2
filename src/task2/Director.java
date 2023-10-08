package task2;

import java.time.LocalDate;

public class Director extends Employee {
private LocalDate startOfPost;

    public Director(String organizationName, String departmentName, float departmentId, String firstName, String lastName, int employeeId, double salary, LocalDate startOfPost) {
        super(organizationName, departmentName, departmentId, firstName, lastName, employeeId, salary);
        this.startOfPost = startOfPost;
    }

    public LocalDate getStartOfPost() {
        return startOfPost;
    }

    public void setStartOfPost(LocalDate startOfPost) {
        this.startOfPost = startOfPost;
    }
}

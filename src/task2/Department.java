package task2;

public class Department extends Organization {
    private String departmentName;
    private float departmentId;

    public Department(String organizationName, String departmentName, float departmentId) {
        super(organizationName);
        this.departmentName = departmentName;
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public float getDepartmentId() {
        return departmentId;
    }
}

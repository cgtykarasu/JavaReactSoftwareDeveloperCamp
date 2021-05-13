package day03inheritanceHw;

public class Instructor extends User {

    private String department;

    public Instructor(String fName, String lName, String email, String username, String password, String department) {
        super(fName, lName, email, username, password);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}

package day03inheritanceHw;

public class Student extends User {

    private String school;
    private String department;

    public Student(String fName, String lName, String email, String username, String password, String school, String department) {
        super(fName, lName, email, username, password);
        this.school = school;
        this.department = department;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}

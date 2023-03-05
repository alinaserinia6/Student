public class Student {
    private String firstname;
    private String lastname;
    private String id;
    private double grade;
    public Student(String firstname, String lastname, String id) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.id = id;
        grade = 0;
    }

    public void printStudentInfo() {
        System.out.println(firstname + " " + lastname + "\nID: " + id + "\nGRADE: " + grade);
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getId() {
        return id;
    }

    public double getGrade() {
        return grade;
    }
}
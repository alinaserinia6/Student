public class Lab{
    private Student[] students;
    private String teacherName;
    private String dayOfWeek;
    private int maxSize;
    private int currentSize;
    private double avgGrade;
    private int index;

    public Lab(String teacherName, String dayOfWeek, int maxSize) {
        this.teacherName = teacherName;
        this.dayOfWeek = dayOfWeek;
        this.maxSize = maxSize;
        students = new Student[maxSize];
        index = 0;
    }

    public void printLabInfo() {
        System.out.println("techerName: " + teacherName + "\ndayOfWeek: " + dayOfWeek + "\nmaxSize: " + maxSize);
        for (int i = 0; i < index; i++) {
            students[i].printStudentInfo();
        }
    }

    void calAvg() {
        double res = 0;
        for (int i = 0; i < index; i++) {
            res += students[i].getGrade();
        }
        res /= index;
        System.out.println(res);
    }
    void enrollStudent(Student x) {
        students[index] = x;
        index++;
    }

    public Student[] getStudents() {
        return students;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public int getCurrentSize() {
        return currentSize;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public void setCurrentSize(int currentSize) {
        this.currentSize = currentSize;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }
}
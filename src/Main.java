public class Main {
    public static void main(String[] args) {
        Student std1 = new Student("ali", "naseri", "40131053");
        Student std2 = new Student("amir", "shahabi", "40131024");

        std1.setGrade(18);
        std2.setGrade(17.5);

        std1.printStudentInfo();
        std2.printStudentInfo();

        Lab x = new Lab("Mr.Smith", "Monday", 30);
        x.enrollStudent(std1);
        x.enrollStudent(std2);
        x.printLabInfo();
        x.calAvg();
    }
}
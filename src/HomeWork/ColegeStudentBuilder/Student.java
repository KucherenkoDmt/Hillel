package HomeWork.ColegeStudentBuilder;

public class Student extends Person {
    private int studentId = 0;
    private double gradeAverage = 0;
    private String properties="Defolt";

    Student(String name) {
        super(name);
    }

    public double getGradeAverage() {
        return gradeAverage;
    }
    public int getStudentId() {
        return studentId;
    }
    public String getProperties() {
        return properties;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
}

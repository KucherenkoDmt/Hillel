package Lectures.ExtendsCollege;

public class Student extends Person {
    private int studentId = 0;
    private double gradeAverage = 0;
    private String properties="Defolt";

    Student(String name, int age, char gender, int studentId, double gradeAverage, String properties) {
        super(name, age, gender);
        this.gradeAverage = gradeAverage;
        this.properties = properties;
        this.studentId = studentId;
        setType("student");
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

    @Override
    public String toString() {
        return super.toString() + "my Id " + studentId + ", my gradeAverage " + gradeAverage + ",y propertias " + properties;
    }

    @Override
    public boolean equals(Object o) {
        Student student = (Student) o;
        return super.equals(o)&&(gradeAverage==((Student) o).gradeAverage)&&(properties.equals(((Student) o).properties));
    }
}

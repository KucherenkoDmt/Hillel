package Lectures.ExtendsCollege;

public class Teacher extends Person {
    private int salary =0;
    private String subject ="Defolt";

    Teacher(String name, int age, char gender, int salary, String subject) {
        super(name, age, gender);
        this.salary=salary;
        this.subject=subject;
        setType("teacher");
    }

    @Override
    public String toString() {
        return super.toString()+ ", my salary is "+ salary + ", my subject is "+ subject;
    }

}

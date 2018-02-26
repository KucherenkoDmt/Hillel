package HomeWork.ColegeStudentBuilder;

public class Class {
    public static void main(String[] args) {
        CollegeStudent student = new CollegeStudent.CollegeStudentBuilder("Dmitrii Kucherenko")
                .withCollegeName(" ")
                .withAge(25)
                .withGender("male")
                .build();
        System.out.println(student.getCollegeName());
        //student.setAge(4);
        student.setStudentId(46);
        System.out.println(student.getName());
    }
}

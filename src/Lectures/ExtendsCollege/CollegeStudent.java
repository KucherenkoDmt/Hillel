package Lectures.ExtendsCollege;

public class CollegeStudent extends Student{
      private   int lavel = 0;
      private   String major="Defolt";

    private CollegeStudent(String name, int age, char gender, int studentId, double gradeAverage, String properties, int lavel, String major) {
        super(name, age, gender, studentId, gradeAverage, properties);
        this.lavel=lavel;
        this.major=major;
        setType("college student");
    }
   /* CollegeStudent(){
        this.lavel = 10;
        this.major="Defolt2";}*/

    public String toString() {
        return super.toString()+" my lavel "+ lavel + " my major "+ major;
    }
   // public static CollegeStudentBuilder(){}
}
// сделеть colegestudent билдер и url билдер
// нужно загуглить патерн билдер
// build возвращяет обьект коледж студент
// методы with Age аналог сетеров

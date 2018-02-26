package HomeWork.ColegeStudentBuilder;

public class Person {
    private int age = 18;
    private String name = "Default";
    private String gender = "Male";

    private Person() {
    }
public Person(String name){
        this.name=name;
}
    public String getGender() {
        return gender;
    }

    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}

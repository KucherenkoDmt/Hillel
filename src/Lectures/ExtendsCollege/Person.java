package Lectures.ExtendsCollege;

public class Person {
   private String name="Defolt";
   private int age=0;
   private char gender = 'd';
   private String type = "";

   Person(String name, int age, char gender){
       this.name=name;
       this.age=age;
       this.gender=gender;
       setType("person");
   }
  // Person(String name, int age, char gender){}

    public void setType(String type) {
        this.type = type;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public char getGender() {
        return gender;
    }
    public int getAge() {
        return age;
    }
    public String getType() {
        return type;
    }

    @Override
    public String toString() {
       return "I am a " + type + " "+ name + " ,my age is "+age+" ,my gander is "+gender;
    }

    public boolean equals(Object o){
       Person person = (Person) o;
       if(!name.equals(person.name)) return false;
       if(age !=person.age) return false;
       else return (gender == person.gender) ;
    }
}

package Lectures.Lecture14InerClass;

public class Person {
    int num;
    int bylder;
    String person;
    public PersonBillder getPersonBillder() {
        return new PersonBillder(this.bylder,this.person);
    }
    public class PersonBillder {
        int bylder;
        String person;
        PersonBillder(int bylder, String person){
            this.bylder=bylder;
            this.person=person;
        }
        void go() {        }
    }
}

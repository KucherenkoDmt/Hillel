package Lectures.Lecture14InerClass;

public class Outer {
    public static void main(String[] args) {
        Outer.Nested_Demo nested = new Outer.Nested_Demo();
        Nested_Demo nested_demo = new Nested_Demo();
        nested_demo.go();
        Person person = new Person();
        person.getPersonBillder();
    }
    private static class Nested_Demo{
        public void go() {
        }
    }
}

package Lectures.Lacture11AbstractClass;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Animal[] animals = {new Cat(), new Dog()};

        System.out.println(animals[0]);
        animals[0].makeVoice();
        animals[1].makeVoice();
    }
}

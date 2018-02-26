package Lectures.Lecture7OOP;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("zaporogets", 77,"yellow");
        Car car2 = new Car("tavria", 7,"red");
        Car car3 = new Car();
        System.out.println(car1.toString());
        System.out.println(car2.toString());

        car3.setColor("blue");
        car3.setModel("bmw");
        car3.setYear(3);
        System.out.println(car3.toString());
    }
}

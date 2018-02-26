package Lectures.Lecture4.Lecture7OOP;

public class BicycleDemo {
    public static void main(String[] args) {
        Bicycle bike1 = new Bicycle();
        Bicycle bike2 = new Bicycle();

        bike1.changeSpeed(10);
        bike1.changeGear(2);

        bike2.changeSpeed(20);
        bike2.changeGear(5);

        System.out.println(bike1.toString());
        System.out.println(bike2.toString());

        Bicycle bike3 = new Bicycle(20,1);
        Bicycle bike4 = new Bicycle();
        System.out.println("Bike #3"+ bike3.toString());
        System.out.println("Bike #4"+ bike4.toString());
    }
}


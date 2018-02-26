package Lectures.Lecture4.Lecture7OOP;

public class Bicycle {

    Bicycle(){}

    Bicycle(int initialSpeed, int initialGear){
        gear=initialGear;
        speed=initialSpeed;
    }
    private int speed = 0;
    private int gear = 1;

    public int getSpeed() {
        return speed;
    }
    public int getGear() {
        return gear;
    }

    void changeSpeed(int newValue){
        speed = newValue;
        System.out.println(speed);
    }
    void changeGear(int newValue){
        gear = newValue;
        System.out.println(gear);
    }
    public String toString(){
        return "My speed is: " + speed + " My gear is: " + gear;
    }
}


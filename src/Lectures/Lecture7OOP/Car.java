package Lectures.Lecture7OOP;

public class Car {
    Car(){}

    Car(String model, int year, String color){
        this.model=model;
        this.year=year;
        this.color=color;
    }
    String model = "porshe";
    int year = 5;
    String color = "red";

    public int getYear() {
        return year;
    }
    public String getColor() {
        return color;
    }
    public String getModel() {
        return model;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public String toString(){
        return "Car name: " + model + " year: " + year + " color of car: " + color;
    }
}

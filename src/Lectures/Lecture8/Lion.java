package Lectures.Lecture8;

public class Lion extends Animal {
    private String name = "Lion";


    public String showName() {
        return super.getName();

    }


    public Lion(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}

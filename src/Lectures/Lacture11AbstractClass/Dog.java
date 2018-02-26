package Lectures.Lacture11AbstractClass;

public class Dog extends Animal {
     String voise="Gav Gav";

   /* public Dog(String name){
        this.name=name;
    }*/

    @Override
    public void name() {
        super.name="Dog";
        System.out.println(name);
    }

    @Override
    public void makeVoice() {
        System.out.println("Gav Gav");
    }
}

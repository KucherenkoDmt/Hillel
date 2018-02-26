package Lectures.StaticCounter;

public class Counter {
    public static int counter = 1;

    public void increase() {
        counter++;
    }

    public static int getCounter() {
        return ++counter;
    }
    public static int plus(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
     //  Counter с1 = new Counter();
        System.out.println(Counter.plus(Counter.getCounter(),Counter.getCounter()));
      }
}

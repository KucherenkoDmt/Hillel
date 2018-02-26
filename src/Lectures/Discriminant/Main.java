package Lectures.Discriminant;

import javafx.util.Pair;

public class Main {
    public static void main(String[] args) {

        Discriminant discParams = new Discriminant(1, 2, -10);
        Discriminant discDefolt = new Discriminant();

        Pair p = discParams.getRoots();
        Pair p1 = discDefolt.getRoots();


        System.out.println("First root:"+ p.getKey());
        System.out.println("Second root:"+ p.getValue());

        System.out.println("First root:"+ p1.getKey());
        System.out.println("Second root:"+ p1.getValue());

    }
}

package Lectures.Discriminant;

import javafx.util.Pair;

public class Discriminant {
    private int a, b, c;

    public Discriminant() {
        a = 1;
        b = 1;
        c = 1;
        //  System.out.println("" + (a + b + c));
    }

    public Discriminant(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public Pair getRoots() {
        Pair roots;
        if (a != 0) {
            double disc = getDisc(a, b, c);
            roots = getRootsOnDisc(disc);
        } else {
            roots = getSimpleEquationRoot(b, c);
        }
        return roots;
    }

    private Pair getSimpleEquationRoot(int b, int c) {
        if (b != 0) {
            double root = c / -b;
            return new Pair(root, root);
        } else {
            return new Pair(null, null);
        }
    }

   /* public Pair getRoots() {
        double disc = getDisc(a, b, c);
        Pair roots = getRootsOnDisc(disc);
        return roots;
    }*/

    private double getDisc(int a, int b, int c) {
        return b * b - 4 * a * c;
    }


    private Pair getRootsOnDisc(double disc) {
        Pair<Double, Double> pair = null;

        double root1;
        double root2;
        if (disc > 0) {
            root1 = (-b + Math.sqrt(disc)) / 2 * a;
            root2 = (-b - Math.sqrt(disc)) / 2 * a;
            pair = new Pair<>(root1, root2);
        } else if (disc == 0) {
            root1 = (-b + Math.sqrt(disc)) / 2 * a;
            pair = new Pair<>(root1, root1);
        } else if (disc < 0) {
            pair = new Pair<>(null, null);
        }
        return pair;
    }
}

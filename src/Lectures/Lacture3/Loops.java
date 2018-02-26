package Lectures.Lecture4.Lacture3;

public class Loops {
    public static void main(String[] args) {
        //  simpleWhileLoop(6);
        // simpleForLoop(18);
        //   simpleDoWhileLoop(5);
        // break1(6);
        task(5, 7);
    }

    public static void simpleWhileLoop(int numberOfInt) {
        int i = 0;
        while (numberOfInt < i) {
            System.out.println(i);
            i++;
        }
    }

    public static void simpleForLoop(int numberOfIner) {
        System.out.println("Starting for loop");
        for (int i = 0; i < numberOfIner; i++) {
            System.out.println(i);
        }
    }

    public static void simpleDoWhileLoop(int numberOfInt) {
        int i = 0;
        System.out.println("Starting for loop");
        do {
            System.out.println(i);
            i++;
        } while (i < numberOfInt);
    }

    public static void break1(int num) {
        for (int i = 0; i < num; i++) {
            if (i == 3) {
                break;
            }
            System.out.println(i);
        }
    }

    public static void task(int weight, int height) {
        for (int i = 0; i < weight; i++) {
            if(i%2==0) System.out.print("#");
            if(i%2!=0) System.out.print(" #");
            for (int j = 1; j < height; j += 2) {
                System.out.print(" #");
            }

            System.out.println();
        }
    }
}


package HomeWork.HomeTasks1_6;

public class HomeWork3 {
    public static void main(String[] args) {
        printNumberWordSwitch();
        printNumberWord1();
        printNumberWord2();
        compresionValue();
        theEquation();
        magnitude();
        detemineDivides();
        square();

    }

    // 3
    public static void printNumberWordSwitch() {
        int number = 0;
        switch (number) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Foure");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            default:
                System.out.println("Wrong number");
                break;
        }
    }

    public static void printNumberWord1() {
        int day = 5;
        if (day == 1) System.out.println("Monday");
        else if (day == 2) System.out.println("Thusday");
        else if (day == 3) System.out.println("Wednesday");
        else if (day == 4) System.out.println("Thursday");
        else if (day == 5) System.out.println("Frieday");
        else if (day == 6) System.out.println("Saturday");
        else if (day == 7) System.out.println("Sunday");
        else System.out.println("Not a valid day");
    }

    public static void printNumberWord2() {
        int day = 5;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Thusday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Frieday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Not a valid day");
                break;
        }
    }

    // 6 задание
    public static void compresionValue() {
        int x = 3;
        int y = 4;
        System.out.println("The value " + ((x > y) ? x : y) + " has the greatest value");

    }

    public static void theEquation() {
        double a = 0;
        double b = 2;
        if (a == 0 || b == 0) {
            System.out.println("a и b не должны равнятся нулю");
        } else {
            double x;
            x = -(b) / a;
            System.out.println(x);
        }
    }

    public static void detemineDivides() {
        int a = 3, b = 4;
        if (a % b == 0) {
            System.out.println("Число а делится на число б без остатка");
        } else {
            System.out.println("Число а не делится на число б без остатка");
        }
    }

    public static void magnitude() {
        int a = 2;
        int b = -7;
        if (Math.abs(a) > Math.abs(b)) {
            System.out.println("Number " + a + " is bigger");
        } else System.out.println("Number " + b + " is bigger");

    }

    public static void square() {
        int n = 5;
        double x = Math.sqrt(n);
        if (n % x == 0) {
            System.out.println("корень числа n целое число");
        } else
            System.out.println("корень числа n со знаком после запятой");
    }

}




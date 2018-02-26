package HomeWork.HomeTasks1_6;

import java.util.ArrayList;
import java.util.List;

public class HomeWork4Part2 {
    public static void main(String[] args) {
        decytichnoeVdvoichnoe2(100);
        decytichnoeVdvoichnoe3(100);
        //  decytichnoeVdvoichnoe1(100);
        //  minMass();
        //  sortOfMass();
        //  isPalindrome("ttnt");
        //  revers("word");
        //  fibonachi(0,1,20);
    }

    public static void decytichnoeVdvoichnoe1(int number) {
        System.out.println(Integer.toBinaryString(number));
    }

    public static void decytichnoeVdvoichnoe2(int number) {
        List<Integer> mass = new ArrayList<>();
        List<Integer> resalt = new ArrayList<>();
        mass.add(number);
        while (true) {
            resalt.add(0, number % 2);
            number = number / 2;
            if (number == 1) {
                resalt.add(0, number);
                break;
            }
        }
        for (int i = 0; i < resalt.size(); i++) {
            System.out.print(resalt.get(i));
        }
        System.out.println("");
    }

    public static void decytichnoeVdvoichnoe3(int number) {
        String s = "";
        int i = 0;
        while (true) {
            i = number % 2;
            s = i + s;
            number = number / 2;
            if (number == 1) {
                s = i + s;
                break;
            }
        }
        System.out.print(s);
    }

    public static void minMass() {
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }
        int min = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min)
                min = numbers[i];
            else continue;
        }
        System.out.println(min);
    }

    public static void sortOfMass() {
        int[] num = {1, 34, 35, 23, 32, 2999, 1, 0, 024, -123, 1, 1};
        for (int i = 0; i < num.length; i++) {
            int x = num[i];
            for (int j = i - 1; j >= 0; j--) {
                int leftNumber = num[j];
                if (x < leftNumber) {
                    num[j + 1] = leftNumber;
                    num[j] = x;
                } else {
                    break;
                }
            }
        }
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }

    public static String reverseString(String s) {
        String r = "";
        for (int i = s.length() - 1; i >= 0; --i)
            r += s.charAt(i);
        return r;


    }

    public static Boolean isPalindrome(String s) {
        if (s.equals(reverseString(s))) {
            System.out.println("Полиндром");
        } else {
            System.out.println("Не полиндром");
        }
        return s.equals(reverseString(s));

    }

    public static void revers(String w) {
        String rev = "";
        for (int i = w.length() - 1; i >= 0; i--) {
            rev += w.charAt(i);
        }
        System.out.println(rev);
    }

    public static void fibonachi(int n1, int n2, int last) {
        int[] fib = new int[last + 2];
        fib[0] = n1;
        fib[1] = n2;
        if (n1 == 0 && n2 == 1) {
            for (int i = 0; i < last; i++) {
                fib[i + 2] = fib[i] + fib[i + 1];
                System.out.println(fib[i]);
            }

        } else {
            System.out.println("Числа фи,оначи должны начинатся с 0 и 1");
        }

    }
}

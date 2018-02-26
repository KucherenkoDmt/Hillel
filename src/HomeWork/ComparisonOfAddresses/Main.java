package HomeWork.ComparisonOfAddresses;

public class Main {
    public static void main(String[] args) {
        Addres a = new Addres(null, "", 0, null, 0);
        Person person1 = new Person("", 2, 34, a);
        Person person2 = new Person("a", 2, 34, a);
        System.out.println(person1.equals(person2));

        Addres a1 = new Addres("", "", 0, null, 0);
        Addres a2 = a.duplicate();


        System.out.println(a.toString());
        System.out.println(a1.toString());
        System.out.println(person1.toString());
        System.out.println(a2.toString());
        System.out.println(person1.equals(person2));

    }
}

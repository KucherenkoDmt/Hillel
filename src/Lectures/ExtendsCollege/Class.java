package Lectures.ExtendsCollege;

public class Class {
    public static void main(String[] args) {
        Person[] person = new Person[10];
        person[0] = new Teacher("Vasya", 21, 'm', 5000, "Java");
        person[1] = new Person("Ivan", 34, 'm');
        person[4] = new Person("Ivan", 34, 'm');
        person[2] = new Student("Sara", 18, 'w', 342767, 23.23, "halavshitsa");
        person[5] = new Student("Sara", 18, 'w', 342767, 23.23, "halavshitsa");
      //  person[3] = new CollegeStudent("Sara2", 18, 'w', 342767, 23.23, "halavshitsa", 23, "maor");
        person[6] = new Student("Sar", 18, 'w', 342767, 23.23, "halavshitsa");

        System.out.println(person[2].equals(person[6]));
        System.out.println(person[1].equals(person[4]));
        System.out.println(person[0].toString());
        System.out.println(person[1].toString());
        System.out.println(person[2].toString());
        System.out.println(person[3].toString());

       /* Person p1 = new Person("Nick", 32, 'm');
        //Person p2 = new Student("a", 23, 'f', 32432, 1.2, "34");
        //Person p7 = new Teacher("Sara", 34, 'w',2000,"Engligh");
        Person p8 = new CollegeStudent();
        System.out.println(p1.toString());
        System.out.println(p8.toString());*/


    }
}

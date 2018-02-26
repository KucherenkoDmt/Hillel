package Lectures.Lecture14InerClass;

public class My_class {
    public static void main(String[] args) {
        Person p = new Person();
        Person.PersonBillder personBillder = p.getPersonBillder();
        p.getPersonBillder();
        System.out.println(p.getPersonBillder());
        personBillder.go();

        // Person.PersonBillder p2 = p.getPersonBillder();
      //   Person.PersonBillder p3 = new Person().new PersonBillder();
       // TestInner outer = new TestInner();
        TestInner.InnerTestInner inner = new TestInner().new InnerTestInner();
         System.out.println(inner.getTest2());

    }
}

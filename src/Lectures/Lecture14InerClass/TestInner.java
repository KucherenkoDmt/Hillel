package Lectures.Lecture14InerClass;

public class TestInner {
    private int test = 10;
    public InnerTestInner getInnerTestInner(){
        return new InnerTestInner();
    }
    class InnerTestInner{
       private int test2 = test;

        public int getTest2() {
            return test2;
        }
    }
}

package Lectures.ElementBase;

public class Main {

   public static void main(String[] args) {

       String browser = TestManagerConfiguation.getInstance().getTestBrowser();
       String env = TestManagerConfiguation.getInstance().getTestEnv();

      // System.out.println(System.getenv("testBrowser"));
       System.out.println(browser);
       System.out.println(env);
       System.out.println(System.getenv());
   }
}

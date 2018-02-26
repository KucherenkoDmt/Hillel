package Lectures.Lecture4.Lacture3;

public class Statements {
   public static void test(){
       int a=35;
       if(a<18){
           System.out.println("Поздравяем, вы школьник");
           System.out.println("Скидка -50%");
       }
       else if(a>=18 && a<55){
           if(a==35){
               System.out.println("Вам 35 лет");}
               else{

           System.out.println("скидки нет");
           System.out.println("Поздравяем, Dfv щвершанолетний");}

           }
              else {
           System.out.println("поздравляем скидка 35%");
       }
    }
    public static void testSwitch(){
       int a =34;
       switch (a){
           case 18:
               System.out.println("Поздравяем, вы совершеннолетний");
               break;
           case 17:
               System.out.println("вы, не совершеннолетний");
               break;
           default:
               System.out.println("тебе не 17 и 18");
       }
    }
    public  static void ternay(){
        int age=55;
        String massage= age<18 ? "Поздравяем, вы школьник" :
                (age>=18 && age<55)?"Поздравяем, вы совершеннолетний" :
                        "поздравляем сидка 35";
        System.out.println(massage);

    }


    public static void main(String[] args) {
            ternay();
    }
}

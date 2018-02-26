package HomeWork.HomeTasks1_6;

public class HomeWork4 {
    public static void main(String[] args) {
       treugolnik(7,7);
      // kvadrat(7);
       treugolnik2(7);
     //  zet(8);
    }
    public static void treugolnik(int length, int width){
        for (int i = 0; i < length; i++) {
            System.out.print("#");
            for (int j = 1 ; j < width; j++) {
                System.out.print("#");
                 }
                 width--;
            System.out.println();
        }
    }
    public static void treugolnik2(int length){
        for (int i = 0; i < length; i++) {
            System.out.print("#");
            for (int j = 0 ; j < i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    public static void kvadrat (int length){
        for (int i = 0; i < length; i++) {
            System.out.print("#");
            if (i == 0 || i == length-1) {
                for (int j = 1; j < length-1; j++) {
                    System.out.print("#");
                }
            } else {
                for (int j = 1; j < length-1; j++)
                    System.out.print(" ");
            }

            System.out.print("#");
            System.out.println();
        }
}
    public static void zet (int length){
        int place=length-1;
        for (int i = 0; i < length; i++) {
             if (i == 0 || i == length-1) {
                for (int j = 0; j < length; j++){
                    System.out.print("#");}}
             else {
                   for (int j = 0; j < length; j++){
                    if(j==place){
                        System.out.print("#");}
                       System.out.print(" ");}
            }
            place--;
            System.out.println();
        }
    }
    }







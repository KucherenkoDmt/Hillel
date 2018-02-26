package HomeWork.HomeTasks1_6;

import java.util.Random;

public class HomeWork6String {
    public static void main(String[] args) {
        getRandomNumericString("Alfanumeric", 10);

    }
    public static void getRandomNumericString(String type, int length){
    String n = "Numeric";
    String a = "Alfa";
    String m = "Alfanumeric";
    if (type.equals(n)){
        System.out.println( Numeric(length));}
    else if (type.equals(a)){
        System.out.println( Alfa(length)); }
    else if (type.equals(m)){
        System.out.println( AlfaNumeric(length));}
    }


    public static String Numeric(int length){
        Random r = new Random();
        String str = "";
        String numChars = "0123456789";
        for (int i = 0; i < length; i++) {
            int random = r.nextInt(numChars.length());
            str += numChars.charAt(random);
        }
        return str;
    }
    public static String Alfa(int length){
        Random r = new Random();
        String str = "";
        String numChars = "abcdefrmlt";
        for (int i = 0; i < length; i++) {
            int random = r.nextInt(numChars.length());
            str += numChars.charAt(random);
        }
        return str;
    }
    public static String AlfaNumeric(int length){
        Random r = new Random();
        String str = "";
        String numChars = "abcdefrmlt0123456789";
        for (int i = 0; i < length; i++) {
            int random = r.nextInt(numChars.length());
            str += numChars.charAt(random);
        }
        return str;
    }

}

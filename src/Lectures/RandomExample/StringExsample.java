package Lectures.Lecture4.String6Lecture;

import java.util.Random;

public class StringExsample {
    public static void main(String[] args) {
        System.out.println(getRandomNumeric(10));
        System.out.println(getRandomString("word"));

        /* если тип alfa вернуть пароль из букв
        если тип numeric вернуть пароль из цифр
        если тип alfanumeric вернуть пароль из букв и цифр
         */
    }
    public static String getRandomNumericString(String type, int length){

        return "";
    }
    public static String getRandomString(String word){
        Random r = new Random();
        String str = "";
        for (int i = 0; i < word.length(); i++) {
            int random = r.nextInt(word.length()-1);
            str += word.charAt(random);
        }
        return str;
    }

    public static String getRandomNumeric(int length){
        Random r = new Random();
        String str = "";
        String numChars = "0123456789";
        for (int i = 0; i < length; i++) {
            int random = r.nextInt(numChars.length()-1);
            str += numChars.charAt(random);
        }

        return str;
    }


    public static void stringExsample(){
        String hello = "hello";
        String hello2 = "hello";
        hello = hello.concat(" moto"); // hello += moto ;
        hello += " the best";
        hello = hello + " realy";
        hello2 = null;
        System.out.println(hello);
        System.out.println(hello2);
    }

}

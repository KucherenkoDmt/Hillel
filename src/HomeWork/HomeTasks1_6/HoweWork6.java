package HomeWork.HomeTasks1_6;


import java.util.Random;

public class HoweWork6 {
    public static void main(String[] args) {
        System.out.println(changeFirstSymbolToUp("word"));
        System.out.println(countLatters("Some random text fg dfg dgf dfgfd gdg dfg df dfg try yui", 'f'));
        System.out.println(countWords("Some random text fg dfg dgf dfgfd gdg dfg df dfg try yui"));
        countWordsOfEachLength("Some random text fg dfg dgf dfgfd gdg dfg df dfg try yui e g");
        System.out.println(remuveLatter("some text some text."));
        System.out.println(productCode("AX6BYU56UX6CV6BNT7NM"));
        squareWordPatterns("help");
    }

    public static String changeFirstSymbolToUp(String w) {
        String str = "";
        for (int i = 0; i < w.length(); i++) {
            if (i == 0) {
                str = str + Character.toUpperCase(w.charAt(i));
            }
            if (i > 0) {
                str = str + Character.toLowerCase(w.charAt(i));
            }
        }
        return str;
    }

    public static int countLatters(String str, char s) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == s) {
                count++;
            }
        }
        return count;
    }

    public static int countWords(String text) {
        String[] array = text.split(" ");
        return array.length;
    }

    public static void countWordsOfEachLength(String text) {
        for (int i = 1; i < 8; i++) {
            System.out.println("Слов длиной " + i + " : " + countWordsOfText(text, i));
        }
    }

    public static int countWordsOfText(String text, int wordLength) {
        String[] array = text.split(" ");
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i].length() == wordLength) {
                sum++;
            }
        }
        return sum;
    }

    public static String remuveLatter(String text) {
        char t = 't';
        String r = "";
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != t) {
                r += text.charAt(i);
            }
        }
        return r;
    }

    public static int productCode(String code) {
        code = code.replaceAll("\\D", "");
        int[] n = new int[6];
        for (int i = 0; i < code.length(); i++) {
            n[i] = Integer.parseInt(String.valueOf(code.charAt(i)));
        }
        int[] m = new int[6];
        for (int i = 0; i < n.length - 1; i = i + 2) {
            m[i] = (n[i] * 10) + (n[i + 1]);
        }
        return m[0] * m[2] * m[4];
    }

    public static void squareWordPatterns(String word) {
        Random r = new Random();
        char str;
        for (int i = 0; i < word.length(); i++) {
            int random = r.nextInt(word.length());
            str = word.charAt(random);
            System.out.print(str);
            for (int j = 0; j < word.length() - 1; j++) {
                int random2 = r.nextInt(word.length());
                System.out.print(word.charAt(random2));
            }
            System.out.println("");
        }


    }
}
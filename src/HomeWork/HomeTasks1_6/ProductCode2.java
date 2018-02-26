package HomeWork.HomeTasks1_6;

public class ProductCode2 {
    public static void main(String[] args) {
        System.out.println(productCode("AX6BYU56UX6CV6BNT7NM 287430"));
        System.out.println(validateString("AX6BYU56UX6CV6BNT7NM 287430"));
    }
    public static boolean validateString(String text){
        String[] parts = text.split(" ");
        String firstPart = (""+productCode(parts[0]));
        String secPart = parts[1];
        return firstPart.equals(secPart);
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
}

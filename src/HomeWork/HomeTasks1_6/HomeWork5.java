package HomeWork.HomeTasks1_6;

public class HomeWork5 {
    public static void main(String[] args) {
        // System.out.println(fToC(37));
        // System.out.println(kilometersToMeters(3.41));
        //  System.out.println(kilogramsToPounds(4.2));
        System.out.println(binToHex("10111001"));
        System.out.println(decToBin(42));
        System.out.println(hexTodec("b9"));

    }

    public static double cToK(int tempC) {
        return tempC - 273;
    }

    public static double kToC(int tempK) {
        return tempK + 273;
    }

    public static double cToF(int tempC) {
        return 1.8 * tempC + 32;
    }

    public static double fToC(int tempF) {
        return 0.55 * (tempF - 32);
    }

    public static double meterToInches(double meter) {
        return meter * 39.37;
    }

    public static double inchesToMeters(double inches) {
        return inches * 0.0254;
    }

    public static double milesToKilometres(double miles) {
        return miles * 1.60934;
    }

    public static double kilometersToMeters(double kilometers) {
        return kilometers * 1000;
    }

    public static double poundsToKilograms(double pounds) {
        return pounds * 0.4535;
    }

    public static double kilogramsToPounds(double kilogram) {
        return kilogram * 2.204;
    }

    public static String decToBin(int number) {
        return Integer.toBinaryString(number);
    }

    public static int binToDec(String number) {
        return Integer.parseInt(number, 2);
    }

    public static String decToHex(int number) {
        return Integer.toHexString(number);
    }

    public static String binToHex(String number) {
        return decToHex(binToDec(number));
    }

    public static int hexTodec(String number) {
        return Integer.parseInt(number, 16);
    }
}

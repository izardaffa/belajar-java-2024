public class typeCasting {
    public static void main(String[] args) {
        // Autocast (small to large): byte -> short -> char -> int -> long -> float -> double
        // Manualcast (large to small)

        int intNumber = 9;
        double doubleNumber = intNumber;

        System.out.println(intNumber);
        System.out.println(doubleNumber);

        double doubleNumber2 = 6;
        int intNumber2 = (int) doubleNumber2;   // Cara type casting manual

        System.out.println(doubleNumber2);
        System.out.println(intNumber2);
    }
}

public class ifElse {
    public static void main(String[] args) {
        int x = 20;
        int y = 7;

        // if
        if (x > y) {
            System.out.println(x + " lebih besar dari " + y);
        }

        // if else
        int time = 14;
        if ((time >= 5) && (time <= 8)) {
            System.out.println("Ohayou!");
        } else if ((time >= 12) && (time <= 17)) {
            System.out.println("Konnichiwa!");
        } else if ((time >= 18) && (time <= 24)) {
            System.out.println("Konbanwa!");
        } else {
            System.out.println("Nani sore?");
        }

        // ternary operator
        String status = (time > 8) && (time < 17 ) ? "Toko Buka" : "Toko Tutup";
        System.out.println(status);
    }
}

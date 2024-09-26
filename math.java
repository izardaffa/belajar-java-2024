public class math {
    public static void main(String[] args) {
        int x = 20;
        int y = 10;
        int z = 25;

        System.out.println(Math.max(x, y)); // output 20
        System.out.println(Math.min(x, y)); // output 10
        System.out.println(Math.sqrt(z)); // output 5.0
        System.out.println(Math.abs(-z)); // output 25
        System.out.println(Math.random()); // generate angka random, 0.0 sampai 1.0
        System.out.println((int)(Math.random() * 101)); // generate angka random, 0 sampai 100

        // ini belum seberapa, masih banyak method Math selain yg diatas (baca docs)
    }
}

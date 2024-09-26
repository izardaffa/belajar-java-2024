public class forLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        // gunakan for loop jika jumlah loop sudah diketahui

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println(i + "." + j);
            }
        }
    }
}

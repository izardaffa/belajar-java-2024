public class breakContinue {
    public static void main(String[] args) {
        // break untuk menghentikan perulangan di tengah proses
        System.out.println("Break:");
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }

        // continue untuk men-skip satu/beberapa proses pada saat perulangan
        System.out.println("Continue:");
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }
    }
}

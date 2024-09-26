import java.util.Arrays;

public class myArray {
    public static void main(String[] args) {
        String[] nijigasaki = {"Ayumu", "Kasumi", "Setsuna", "Karin", "Emma", "Shizuku", "Kanata", "Ai", "Rina"};

        System.out.println(Arrays.toString(nijigasaki));
        System.out.println(nijigasaki.length);

        String[][] nijigasakiUnit = {
            {"Ayumu", "Shizuku", "Setsuna"},
            {"Karin", "Ai"},
            {"Kasumi", "Emma", "Kanata", "Rina"}
        };

        for (int i = 0; i < nijigasakiUnit.length; i++) {
            System.out.println("---");
            for (int j = 0; j < nijigasakiUnit[i].length; j++) {
                System.out.println(nijigasakiUnit[i][j]);
            }
            System.out.println("---");
        }
    }
}

public class string {
    public static void main(String[] args) {
        String myGirl = "Kazusa";

        System.out.println(myGirl);
        System.out.println(myGirl.length());

        System.out.println(myGirl.toUpperCase());
        System.out.println(myGirl.toLowerCase());
        
        System.out.println(myGirl.indexOf("z"));

        // ini belum seberapa, masih banyak method String selain yg diatas (baca docs)

        String firstName = "Kazusa";
        String lastName = "Kyouyama";

        System.out.println(firstName + " " + lastName);
    }
}

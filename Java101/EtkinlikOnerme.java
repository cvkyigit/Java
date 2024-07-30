import java.util.Scanner;

public class EtkinlikOnerme {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);

        /*
        Koşullar :
        * Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
        * Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
        * Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
        * Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
         */

        int heat;

        System.out.print("Santigrat Cinsinden Bir Sıcaklık Giriniz: ");
        heat = oku.nextInt();

        if (heat < 5) {
            System.out.println("Kayak Etkinliğini Yapabilirsiniz. ");
        } else if (heat >= 5 && heat < 15) {
            System.out.println("Sinema Etkinliğini Yapabilirsiniz. ");
        } else if (heat >= 15 && heat < 25) {
            System.out.println("Piknik Etkinliğini Yapabilirsiniz. ");
        } else {
            System.out.println("Yüzme Etkinliğini Yapabilirsiniz. ");
        }
    }
}

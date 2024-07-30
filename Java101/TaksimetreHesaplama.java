import java.util.Scanner;

public class TaksimetreHesaplama {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);

        /*
        - Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran program.
        * Taksimetre KM başına 2.20 TL tutmaktadır.
        * Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
        * Taksimetre açılış ücreti 10 TL'dir.
        */

        int km;
        double perKM = 2.20, StartPrice = 10, total;

        System.out.print("KM Cinsinden Bir Mesafe Giriniz: ");
        km = oku.nextInt();

        total = (km * perKM);
        total += StartPrice;

        total = (total < 20) ? 20 : total;
        System.out.println("Toplam Tutar: " + total);
    }
}

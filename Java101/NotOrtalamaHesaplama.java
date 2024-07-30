import java.util.Scanner;

public class NotOrtalamaHesaplama {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);

        int Matematik, Fizik, Kimya, Biyoloji, Geometri, Turkce;

        System.out.print("Matematik notunuzu giriniz: ");
        Matematik = oku.nextInt();

        System.out.print("Fizik notunuzu giriniz: ");
        Fizik = oku.nextInt();

        System.out.print("Kimya notunuzu giriniz: ");
        Kimya = oku.nextInt();

        System.out.print("Biyoloji notunuzu giriniz: ");
        Biyoloji = oku.nextInt();

        System.out.print("Geometri notunuzu giriniz: ");
        Geometri = oku.nextInt();

        System.out.print("Turkce notunuzu giriniz: ");
        Turkce = oku.nextInt();

        double sonuc = (Matematik + Fizik + Kimya + Biyoloji + Geometri + Turkce) / 6.0;
        System.out.println("Ortalamanız: " + sonuc);
    }
}

import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);

        int Matematik, Fizik, Kimya, Turkce, Muzik;

        System.out.print("Matematik notunuzu giriniz: ");
        Matematik = oku.nextInt();

        System.out.print("Fizik notunuzu giriniz: ");
        Fizik = oku.nextInt();

        System.out.print("Kimya notunuzu giriniz: ");
        Kimya = oku.nextInt();

        System.out.print("Türkçe notunuzu giriniz: ");
        Turkce = oku.nextInt();

        System.out.print("Müzik notunuzu giriniz: ");
        Muzik = oku.nextInt();

        double ort = (Matematik + Fizik + Kimya + Turkce + Muzik) / 5;

        if (ort <= 55) {
            System.out.println("Sınıfta Kaldınız! ");
            System.out.println("Ortalamanız: " + ort);
        } else {
            System.out.println("Tebrikler Sınıfı Geçtiniz.");
            System.out.println("Ortalamanız: " + ort);
        }
    }
}

import java.util.Scanner;

public class KDVHesaplama {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);

        double tutar, KDVOran = 0.18, KDVTutar, KDVliTutar;
        System.out.println("Ücret Tutarınızı Giriniz: ");
        tutar = oku.nextDouble();

        KDVTutar = tutar * KDVOran;
        KDVliTutar = tutar + KDVTutar;

        System.out.println("KDV'siz Tutar: " + tutar);
        System.out.println("KDV Oranı: " + KDVOran);
        System.out.println("KDV Tutarı: " + KDVTutar);
        System.out.println("KDV'li Tutar: " + KDVliTutar);
    }
}

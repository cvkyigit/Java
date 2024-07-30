import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);

        /*
        Java ile kullanıcıdan alınan sayılarla hesap makinesi yapan program.
        */

        int sayi1, sayi2, secim;

        System.out.print("1. Sayıyı Giriniz: ");
        sayi1 = oku.nextInt();

        System.out.print("2. Sayıyı Giriniz: ");
        sayi2 = oku.nextInt();

        System.out.println("1-) Toplama\n2-) Çıkarma\n3-) Çarpma\n4-) Bölme");
        System.out.print("Lütfen Seçim Yapınız: ");
        secim = oku.nextInt();

        switch (secim) {
            case 1:
                System.out.println("Toplama: " + (sayi1 + sayi2));
                break;
            case 2:
                System.out.println("Çıkarma: " + (sayi1 - sayi2));
                break;
            case 3:
                System.out.println("Çarpma: " + (sayi1 * sayi2));
                break;
            case 4:
                System.out.println("Bölme: " + (sayi1 / sayi2));
                break;
            default:
                System.out.println("Hatalı Bir Seçim Yaptınız!");
        }
    }
}

import java.util.Scanner;

public class CiftSayiBulma {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);

        /*
        Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan program
        */

        int sayi;

        System.out.print("Bir Sayı Giriniz: ");
        sayi = oku.nextInt();

        for (int i = 0; i < sayi; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}

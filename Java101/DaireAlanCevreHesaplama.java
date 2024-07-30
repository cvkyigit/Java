import java.util.Scanner;

public class DaireAlanCevreHesaplama {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);

        /*
        - Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan program.
        * Alan Formülü : π * r * r;
        * Çevre Formülü : 2 * π * r;
        */

        int r;
        double pi = 3.14;

        System.out.print("Dairenin Yarı Çapını Giriniz: ");
        r = oku.nextInt();

        double alan = pi * r * r;
        double cevre = 2 * pi * r;

        System.out.println("Dairenin Alanı: " + alan);
        System.out.println("Dairenin Çevresi: " + cevre);
    }
}

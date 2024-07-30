import java.util.Scanner;

public class HipotenusBulma {
    public static void main(String[] args) {

        // Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan program.
        // Üçgenin Hipotenüsü: a2 = b2 + c2

        Scanner oku = new Scanner(System.in);

        int a, b;
        double c;

        System.out.print("1. Kenarı Giriniz: ");
        a = oku.nextInt();

        System.out.print("2. Kenarı Giriniz: ");
        b = oku.nextInt();

        c = Math.sqrt((a*a)+(b*b));
        System.out.print("Hipotenüs: " + c);
    }
}

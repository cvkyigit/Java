import java.util.Scanner;

public class VKIHesaplama {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);

        /*
        - Vücut Kitle İndeksi Hesaplama
        * Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
        * Kilo (kg) / Boy(m) * Boy(m)
        */

        System.out.print("Kilonuzu Giriniz: ");
        double Kilo = oku.nextDouble();

        System.out.print("Boyunuzu Giriniz: ");
        double Boy = oku.nextDouble();


        double vki = Kilo / (Boy * Boy);
        System.out.println("Vücut Kitle İndeksiniz: " + vki);
    }
}

import java.util.Scanner;

public class ArtikYilHesaplama {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);

        System.out.print("Bir Yıl Giriniz: ");
        int year = oku.nextInt();

        if (year % 100 == 0) {
            if (year % 400 == 0) {
                System.out.println("Bu Yıl Artık Yıldır.");
            }
            else {
                System.out.println("Bu Yıl Artık Yıl Değildir.");
            }
        }
        else if (year % 4 == 0)
        {
            System.out.println("Bu Yıl Artık Yıldır");
        }
        else
        {
            System.out.println("Bu Yıl Artık Yıl Değildir");
        }
    }
}

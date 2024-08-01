import java.util.Scanner;

public class CinZodyagi {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);

        /*
        Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.

        Doğum Tarihi %12 = 0 ➜ Maymum
        Doğum Tarihi %12 = 1 ➜ Horoz
        Doğum Tarihi %12 = 2 ➜ Köpek
        Doğum Tarihi %12 = 3 ➜ Domuz
        Doğum Tarihi %12 = 4 ➜ Fare
        Doğum Tarihi %12 = 5 ➜ Öküz
        Doğum Tarihi %12 = 6 ➜ Kaplan
        Doğum Tarihi %12 = 7 ➜ Tavşan
        Doğum Tarihi %12 = 8 ➜ Ejderha
        Doğum Tarihi %12 = 9 ➜ Yılan
        Doğum Tarihi %12 = 10 ➜ At
        Doğum Tarihi %12 = 11 ➜ Koyun
        */

        System.out.print("Doğum Tarihinizin Yıl Kısmını Giriniz: ");
        int DogumTarih = oku.nextInt();

        if (DogumTarih % 12 == 0)
        {
            System.out.println("Çin Zodyak Burcunuz: MAYMUN");
        }
        else if (DogumTarih % 12 == 1)
        {
            System.out.println("Çin Zodyak Burcunuz: HOROZ");
        }
        else if (DogumTarih % 12 == 2)
        {
            System.out.println("Çin Zodyak Burcunuz: KÖPEK");
        }
        else if (DogumTarih % 12 == 3)
        {
            System.out.println("Çin Zodyak Burcunuz: DOMUZ");
        }
        else if (DogumTarih % 12 == 4)
        {
            System.out.println("Çin Zodyak Burcunuz: FARE");
        }
        else if (DogumTarih % 12 == 5)
        {
            System.out.println("Çin Zodyak Burcunuz: ÖKÜZ");
        }
        else if (DogumTarih % 12 == 6)
        {
            System.out.println("Çin Zodyak Burcunuz: KAPLAN");
        }
        else if (DogumTarih % 12 == 7)
        {
            System.out.println("Çin Zodyak Burcunuz: TAVŞAN");
        }
        else if (DogumTarih % 12 == 8)
        {
            System.out.println("Çin Zodyak Burcunuz: EJDERHA");
        }
        else if (DogumTarih % 12 == 9)
        {
            System.out.println("Çin Zodyak Burcunuz: YILAN");
        }
        else if (DogumTarih % 12 == 10)
        {
            System.out.println("Çin Zodyak Burcunuz: AT");
        }
        else if (DogumTarih % 12 == 11)
        {
            System.out.println("Çin Zodyak Burcunuz: KOYUN");
        }
        else
        {
            System.out.println("Hatalı Bir Giriş Yaptınız!");
        }
    }
}

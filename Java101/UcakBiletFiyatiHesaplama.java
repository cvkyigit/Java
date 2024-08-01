import java.util.Scanner;

public class UcakBiletFiyatiHesaplama {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);

        /*
        Uçak Bileti Fiyatı Hesaplama
        Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın.
        Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın.
        Mesafe başına ücret 0,10 TL / km olarak alın.
        İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın.

        Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
        Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
        Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
        Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
        Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
        */

        int km, yas, ucustip;
        double tutar, topTutar, indTutar, indYas, indGidisDonus;

        System.out.print("Mesafeyi KM cinsinden giriniz: ");
        km = oku.nextInt();
        System.out.print("Yaşınızı Giriniz: ");
        yas = oku.nextInt();
        System.out.print("Yolculuk tipi seçiçiniz:\n(1-Tek Yön, 2-Gidiş Dönüş):");
        ucustip = oku.nextInt();

        if (km > 0 && yas > 0 || (ucustip == 1 && ucustip == 2))
        {
            tutar = km * 0.10;

            if (yas < 12)
            {
                indYas = tutar * 0.50;
                indTutar = tutar * indYas;
                indGidisDonus = ucustip == 2 ? indTutar * 0.20 : 0;
                topTutar = (indTutar - indGidisDonus) * ucustip;
                System.out.println("Tutar : " + topTutar);
            }
            else if (yas > 12 || yas < 24)
            {
                indYas = tutar * 0.10;
                indTutar = tutar - indYas;
                indGidisDonus = ucustip == 2 ? indTutar * 0.20 : 0;
                topTutar = (indTutar - indGidisDonus) * ucustip;
                System.out.print("Tutar : " + topTutar);
            }
            else if (yas > 24 || yas < 65)
            {
                indGidisDonus = ucustip == 2 ? tutar * 0.20 : 0;
                topTutar = (tutar - indGidisDonus) * ucustip;
                System.out.print("Tutar : " + topTutar);
            }
            else
            {
                indYas = tutar * 0.30;
                indTutar = tutar - indYas;
                indGidisDonus = ucustip == 2 ? indTutar * 0.20 : 0;
                topTutar = (indTutar - indGidisDonus) * ucustip;
                System.out.print("Tutar : " + topTutar);
            }
        }
        else
        {
            System.out.println("Hatalı Bir Veri Girdiniz! ");
        }
    }
}

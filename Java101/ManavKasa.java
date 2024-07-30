import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);

        /*
        Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran program.

        Meyveler ve KG Fiyatları
        * Armut : 2,14 TL
        * Elma : 3,67 TL
        * Domates : 1,11 TL
        * Muz: 0,95 TL
        * Patlıcan : 5,00 TL
        */

        double armut, elma, domates, muz, patlican;
        double armutKG = 2.14, elmaKG = 3.67, domatesKG = 1.11, muzKG = 0.95, patlicanKG = 5;

        System.out.print("Armut KG: ");
        armut = oku.nextDouble();

        System.out.print("Elma KG: ");
        elma = oku.nextDouble();

        System.out.print("Domates KG: ");
        domates = oku.nextDouble();

        System.out.print("Muz KG: ");
        muz = oku.nextDouble();

        System.out.print("Patlican KG: ");
        patlican = oku.nextDouble();

        double toplam = ((armutKG * armut) + (elmaKG * elma) + (domatesKG * domates) + (muzKG * muz) + (patlicanKG * patlican));
        System.out.println("Toplam Tutar: " +toplam);
    }
}

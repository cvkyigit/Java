import java.util.Scanner;

public class SayılariSiralama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
        Girilen 3 sayıyı "küçükten büyüğe" sıralayan program.
         */

        int sayi1, sayi2, sayi3;

        System.out.print("1. Sayıyı Giriniz: ");
        sayi1 = input.nextInt();

        System.out.print("2. Sayıyı Giriniz: ");
        sayi2 = input.nextInt();

        System.out.print("3. Sayıyı Giriniz: ");
        sayi3 = input.nextInt();

        if ((sayi1 > sayi2) && (sayi1 > sayi3)){
            if (sayi2 > sayi3){
                System.out.println("Sıralama: " + sayi1 + ">" + sayi2 + ">" + sayi3);
            } else {
                System.out.println("Sıralama: " + sayi1 + ">" + sayi3 + ">" + sayi2);
            }
        } else if ((sayi2 > sayi1) && (sayi2 > sayi3)) {
            if (sayi1 > sayi3){
                System.out.println("Sıralama: " + sayi2 + ">" + sayi1 + ">" + sayi3);
            } else {
                System.out.println("Sıralama: " + sayi2 + ">" + sayi3 + ">" + sayi1);
            }
        } else if ((sayi3> sayi1) && (sayi3 > sayi2)) {
            if (sayi1 > sayi2){
                System.out.println("Sıralama: " + sayi3 + ">" + sayi1 + ">" + sayi2);
            } else {
                System.out.println("Sıralama: " + sayi3 + ">" + sayi2 + ">" + sayi1);
            }
        }
    }
}

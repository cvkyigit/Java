import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);

        int Password1, Password2;
        String UserName;

        System.out.print("Kullanıcı Adınız: ");
        UserName = oku.nextLine();

        System.out.print("Şifrenizi Giriniz: ");
        Password1 = oku.nextInt();

        System.out.print("Şifrenizi Doğrulamak için Tekrar Giriniz: ");
        Password2 = oku.nextInt();

        if (Password1 == Password2) {
            System.out.println("Şifreniz Başarılı Bir Şekilde Oluşturuldu. ");
        }
        else
        {
            System.out.println("Şifrenizi Mi Unuttunuz ? Yeni Şifre Oluşturmak için 1'e Çıkış Yapmak için 2'ye basınız. ");
            int decide = oku.nextInt();

            switch (decide) {
                case 1:
                    System.out.println("Yeni Şifrenizi Oluşturunuz: ");
                    int NewPassword = oku.nextInt();

                    if (Password1 == NewPassword) {
                        System.out.println("Şifreleriniz Birbiri ile Uyuşmamaktadır.");
                    }
                    else
                    {
                        System.out.println("Şifreniz Başarılı Bir Şekilde Oluşturulmuştur.");
                    }
                    break;
                case 2:
                    System.out.println("Çıkış Yapınız. ");
                    break;
                default:
            }
        }
    }
}

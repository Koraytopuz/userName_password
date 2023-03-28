import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String userName,password,sifirlama,yenisifre;
        Scanner inp=new Scanner(System.in);
        System.out.print("Kullanıcı Adı: ");
        userName=inp.nextLine();
        System.out.print("Şifre: ");
        password= inp.nextLine();
        if (userName.equals("patika")||password.equals("java123")){
            System.out.println("Giriş Başarılı!");
        }else {
            System.out.println("Bilgileriniz Yanlış");
            System.out.println("Şifreniz Sıfırlansın mı?");
            sifirlama= inp.nextLine();
            if (sifirlama.equals("evet"))
            {
                System.out.println("Yeni Şifre: ");
            }
            yenisifre= inp.nextLine();
            if (yenisifre.equals("java123"))
            {
                System.out.println("Şifre eski şifreyle aynı olamaz,lütfen tekrar şifre girin.");
            }else {
                System.out.println("Şifre Başarılı Şekilde Oluşturuldu.");
            }
        }

    }
}
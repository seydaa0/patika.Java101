//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String userName, password, secim;
        String a = "patika", b = "Java123";

        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı adınız : ");
        userName = inp.nextLine();

        System.out.print("Şifreniz : ");
        password = inp.nextLine();

        if(userName.equals(a) && password.equals(b)){
            System.out.print("Giriş yaptınız ! ");
        }else{
            System.out.print("Bilgileriniz yanlış !  \n Şifre değiştirmek için = 1 \n Çıkış yapmak için = 2  ");
            secim = inp.nextLine();

            if(secim.equals("1")){
                System.out.print("Yeni şifreniz : ");
                String c = inp.nextLine();

                if(c.equals(b)){
                    System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                }else{
                    System.out.print("Şifre oluşturuldu.");
                    b=c;
                }


            }else{
                System.out.print("Çıkış yapılıyor...");
            }
        }



    }
}
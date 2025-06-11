import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a;
        Scanner inp = new Scanner(System.in);

        System.out.print("Sayı giriniz:");
        a = inp.nextInt();

        int toplam = 0, adet = 0;

        for (int i = 0; i<=a; i++){
            if(i % 3==0 || i % 4==0){
              toplam += i;
              adet++;
            }

        }
        double ortalama = (double) toplam / adet;
        System.out.println(ortalama);
    }
}
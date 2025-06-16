import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n;

        System.out.print("Kaç Tane Sayı Gireceksiniz : ");
        int a = input.nextInt();

        System.out.println("1. Sayıyı giriniz : ");
        n1 = input.nextInt();

        int min = n1, max = n1;

        for(int i = 2; i<=a; i++ ){
            System.out.println(i + ". Sayıyı giriniz : ");
            n = input.nextInt();

            if(n>max) max = n;
            if(n<min)  min = n;

        }
        System.out.println("En büyük sayı : " + max);
        System.out.print("En küçük sayı : " + min);
    }
}
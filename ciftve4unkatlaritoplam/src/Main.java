//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n;
        int toplam = 0;
        Scanner input = new Scanner(System.in);
    do {
        System.out.print("Sayı giriniz:");
        n =input.nextInt();
        if (n%4==0){
        toplam += n;
        }
    }while(n%2 ==0);
    System.out.println("toplam:" + toplam);
    }
}
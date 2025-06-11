//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a;
        Scanner input= new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        a=input.nextInt();

        for(int i = 1; i<=a; i*=4 ) {
            System.out.println( i);
        }
        for(int i = 1; i<=a; i*=5 ) {
            System.out.println( i);
        }
    }
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    int km;
    double perKm = 2.20, total=10;

    Scanner input = new Scanner(System.in);
    System.out.print("Mesafeyi Km cinsinden giriniz:");
    km = input.nextInt();

    total += (km *perKm);

    total = (total < 20) ? 20 : total;
    System.out.print("Toplam Tutar:" + total);
    }
}
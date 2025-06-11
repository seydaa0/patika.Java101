//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r , a;
        double pi = 3.14;

        System.out.print("Dairenin yarıçapı:");
        r = input.nextInt();

        System.out.print("Merkez açısı:");
        a = input.nextInt();

        double alan = (pi*(r*r)*a)/360;

        System.out.print("Daire diliminin alanı:" + alan);
    }
}
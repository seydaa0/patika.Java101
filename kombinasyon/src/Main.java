//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Eleman sayısı(n):");
    int n = input.nextInt();
    System.out.print("Seçim sayısı(r):");
    int r = input.nextInt();
    long toplam = 1;
    long toplam2 = 1;
    long toplam3 = 1;

    for(int i=1; i<=n; i++){
         toplam = toplam * i;
     }
    for(int i=1; i<=r; i++){
         toplam2 = toplam2 * i;
    }
    for(int i=1; i<=(n-r); i++){
        toplam3 = toplam3 * i;
    }
    long c = toplam/ (toplam2*toplam3);
    System.out.print("C(n,r)=" + c );
    }
}
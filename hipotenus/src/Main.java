//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    System.out.println("1. kenarın uzunluğu:");
     int a = input.nextInt();

     System.out.println("2. kenarın uzunluğu:");
     int b = input.nextInt();

     System.out.println("3. kenarın uzunluğu:");
     int c = input.nextInt();

     int u = (a+b+c)/2 ;

     double alan = Math.sqrt(u * (u-a)* (u-b) * (u-c));

     System.out.println("Üçgenin alanı:" + alan);

    }
}
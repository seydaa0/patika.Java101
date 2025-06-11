//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);
        System.out.print("Sıcaklık giriniz : ");
        heat = input.nextInt();

        if (heat <= 5) {
            System.out.print("Kayak yapabilirsiniz.");
        } else if (heat > 5 && heat <= 15) {
            System.out.print("Sinemaya gidebilirsiniz.");
        }else if(heat <= 25 && heat>15){
            System.out.print("Piknik yapabilirsiniz.");
        }else if(heat > 25){
            System.out.print("Yüzmeye gidebilirsiniz.");
        }

    }
}
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, number2, toplam = 0 ;

        System.out.print("Sayı giriniz : ");
        number = input.nextInt();

        while (number != 0){
            number2 = number % 10;
            number /= 10;
            toplam += number2;

        }
        System.out.print("Basamak sayıları toplamı : " + toplam);

    }
}
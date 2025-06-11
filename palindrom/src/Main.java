//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    static boolean isPalindrom(int number){
        int temp = number , reservenumber = 0 ,lastnumber;
        while(temp != 0){
            lastnumber = temp % 10;
            reservenumber = (reservenumber * 10) + lastnumber;
            temp /= 10;
        }
        if(number == reservenumber){
            System.out.print("Palindrom sayıdır!");
        }else
        {
            System.out.print("Palindrom sayı değildir!");
        }
        return number == reservenumber;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz:");
        int n = input.nextInt();
        System.out.println("---------------");
        isPalindrom(n);


    }
}
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz : ");
        int n = input.nextInt();
        int b = 0;

        for(int i=1; i<n; i++){
             if(n % i == 0){
                 b += i;
             }


        }
        if(b == n){
            System.out.print(n + " mükemmel  sayıdır ! ");
        }else{
            System.out.print(n + " mükemmel sayı değildir.");
        }
    }
}
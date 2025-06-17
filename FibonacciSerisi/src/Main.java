import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Eleman sayısını yazınız : ");
        int n = input.nextInt();
        int a = 0;
        int b = 1;
        int c;

        for(int i = 1; i<=n; i++){
            c = a + b;
            System.out.print( c + ", ");

            a=b;
            b=c;

        }


    }
}
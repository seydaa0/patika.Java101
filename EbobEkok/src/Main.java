import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("n1 Sayısnını giriniz : ");
        int n1 = input.nextInt();

        System.out.print("n2 Sayısını giriniz : ");
        int n2 = input.nextInt();

        int ebob=1;
        int i = 1;


        while(i<=n1){
            if(n1%i==0 && n2%i==0)
            {
                ebob=i;
            }
            i++;

        }
        int ekok = (n1*n2)/ebob;

        System.out.println("Ebob :" + ebob);
        System.out.println("Ekok :" + ekok);

    }
}
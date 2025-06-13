import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int yil;
        boolean isError = false;

        System.out.print("Yıl giriniz : ");
        yil = input.nextInt();

        if(yil % 100 == 0){
            if(yil % 400 == 0){
                isError = true;
            }

        }else if(yil % 4 == 0 ){
            isError = true;

        }
        if(isError){
            System.out.print(yil + " bir artık yıldır ! ");
        }else{
            System.out.print(yil + " bir artık yıl değildir ! ");
        }

    }
}
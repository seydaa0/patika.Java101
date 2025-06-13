import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int yas, km, tip;
        double tutar, yasInd, indTutar=1 , gidisDonus, toplam=1;
        Scanner input = new Scanner(System.in);
        boolean isError = false;

        System.out.print("Mesafeyi km türünden giriniz : ");
        km = input.nextInt();

        System.out.print("Yaşınızı giriniz : ");
        yas = input.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ) : ");
        tip = input.nextInt();

        if(km>0) {
            tutar = km * 0.10;
            if (yas > 0) {
                if (yas < 12) {
                    yasInd = tutar * 0.50;
                    indTutar = tutar - yasInd;
                }else if(yas>12 && yas<24){
                    yasInd = tutar * 0.10;
                    indTutar = tutar - yasInd;
                }else if(yas>65){
                    yasInd = tutar* 0.30;
                    indTutar = tutar - yasInd;
                }else{
                    indTutar = tutar;
                }

            } else {
                isError = true;
            }
        }else{
            isError = true;
        }
        if(tip == 1){
            toplam = indTutar;
        }else if(tip == 2){
            gidisDonus = indTutar * 0.20;
            toplam = (indTutar - gidisDonus) * 2;

        }else{
            isError = true;
        }
        if(isError){
            System.out.print("Hatalı Veri Girdiniz ! ");
        }else{
            System.out.print(toplam);
        }

    }
}
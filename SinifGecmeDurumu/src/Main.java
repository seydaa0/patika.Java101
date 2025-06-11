//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik;

    Scanner input = new Scanner(System.in);

    System.out.print("Matematik notunuz : ");
    mat = input.nextInt();

    System.out.print("Fizik notunuz : ");
    fizik = input.nextInt();

    System.out.print("Türkçe notunuz : ");
    turkce = input.nextInt();

    System.out.print("Kimya notunuz : ");
    kimya = input.nextInt();

    System.out.print("Müzik notunuz : ");
    muzik = input.nextInt();

    double avarage = 0;
    int ders = 0;

    if(mat>0 && mat<100){
        avarage += mat;
        ders ++ ;
    }
    if(fizik>0 && fizik<100){
            avarage += fizik;
            ders ++ ;
    }
    if(turkce>0 && turkce<100){
            avarage += turkce;
            ders ++ ;
    }
    if(kimya>0 && kimya<100){
            avarage += kimya;
            ders ++ ;
    }
    if(muzik>0 && muzik<100) {
            avarage += muzik;
            ders++;
    }

    double ortalama = avarage / ders ;
    if( ortalama<= 55){
        System.out.print("Sınıfta kaldınız, Seneye görüşmek üzere ! ");
    }else{
        System.out.print("Tebrikler, sınıf geçtiniz ! ");
    }
    System.out.println("Ortalamanız : " + ortalama);

    }
}
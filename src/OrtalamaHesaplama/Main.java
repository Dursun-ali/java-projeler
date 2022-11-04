package OrtalamaHesaplama;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int matematik,fizik,kimya,türkçe,tarih,müzik;

        Scanner klavye=new Scanner(System.in);
        System.out.println("matematik notunuzu giriniz : ");
        matematik= klavye.nextInt();

        System.out.println("fizik notunuzu giriniz : ");
        fizik=klavye.nextInt();

        System.out.println("kimya notunuzu giriniz : ");
        kimya= klavye.nextInt();

        System.out.println("Türkçe notunuzu giriniz : ");
        türkçe= klavye.nextInt();

        System.out.println("Tarih notunuzu giriniz : ");
        tarih= klavye.nextInt();

        System.out.println("Müzik notunuzu giriniz : ");
        müzik= klavye.nextInt();

        double sonuc= (matematik+fizik+kimya+türkçe+tarih+müzik)/6;

        System.out.println("derslerın ortalaması "+sonuc);

        System.out.println();

        if (sonuc >= 60){
            System.out.println("Sınıf GEÇTİ ");
        }
        else System.out.println("snıf KALDI ");

    }
}


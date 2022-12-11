
import java.util.Scanner;

public class BoyOrtalama {
    public static void main(String args[]){

        Scanner kullanici = new Scanner(System.in);

        int erkekToplam = 0, kadinToplam = 0;
        int erkekSayi = 0, kadinSayi = 0;
        int boy;

        System.out.println("Sınıf mevcudunu giriniz: ");
        int sinifMevcudu = kullanici.nextInt();

        for(int i = 1; i <= sinifMevcudu; i++){
            System.out.println("Cinsiyetinizi giriniz (Erkek = 'E', Kadın = 'K'): ");
            String cinsiyet = kullanici.next();

            if(cinsiyet.equals("E")){
                System.out.println("Boyunuz cm cinsinden giriniz: ");
                boy = kullanici.nextInt();
                erkekToplam += boy;
                erkekSayi++;
            }
            else if(cinsiyet.equals("K")){
                System.out.println("Boyunuz cm cinsinden giriniz: ");
                boy = kullanici.nextInt();
                kadinToplam += boy;
                kadinSayi++;
            }
            else{
                System.out.println("Hatalı bir giriş yaptınız! Programı tekrar çalıştırın.");
                break;
            }
        }

        int erkekOrtalama = erkekToplam / erkekSayi;
        int kadinOrtalama = kadinToplam / kadinSayi;
        int genelOrtalama = (erkekToplam + kadinToplam) / sinifMevcudu;

        System.out.println("Sınıftaki erkeklerin boy ortalaması " + erkekOrtalama + " cm");
        System.out.println("Sınıftaki kadınların boy ortalaması " + kadinOrtalama + " cm");
        System.out.println("Sınıfın genel boy ortalaması " + genelOrtalama + " cm");

    }
}

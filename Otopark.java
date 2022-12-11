
import java.util.Scanner;

public class Otopark {
    public static void main(String[] args){

        Scanner kullanici = new Scanner(System.in);

        System.out.println("Otopark kapasitesini giriniz:");

        int kapasite = kullanici.nextInt();

        String[] araclar = new String[kapasite];

        for (int i = 0; i < kapasite; i++){
            araclar[i] = "Boş";
            System.out.println((i+1) + ". Alandaki araç -> " + araclar[i]);
        }

        int dongu = 1;
        while (dongu > 0){
            System.out.println("Otoparka giriş işlemi için -> 1\nOtoparktan çıkış işlemi için -> 2");
            int tercih = kullanici.nextInt();

            switch(tercih) {
                case 1: System.out.println("Kaç adet araç girişi yapılacak?");
                int giris_sayisi = kullanici.nextInt();
                for (int i = 0; i < giris_sayisi; i++){
                    System.out.println("Hangi alana araç girişi yapılacak?\n1-" + kapasite + " arasında seçim yapabilirsiniz.");
                    int alan_tercih = kullanici.nextInt();
                    System.out.println("Araç girişi yapabilirsiniz:");
                    araclar[alan_tercih-1] = kullanici.next();
                }
                break;

                case 2: System.out.println("Kaç adet araç çıkışı yapılacak?");
                int cikis_sayisi = kullanici.nextInt();
                for (int i = 0; i < cikis_sayisi; i++){
                    System.out.println("Hangi alandan çıkış yapılacak?\n1-" + kapasite + " arasında seçim yapabilirsiniz.");
                    int alan_tercih = kullanici.nextInt();
                    System.out.println("Çıkış işlemini yapabilirsiniz.\nÇıkış yapılan alanları 'Boş' olarak doldurunuz.");
                    araclar[alan_tercih-1] = kullanici.next();
                }
                break;
            }

            System.out.println("Otopark durumunu görmek için '0' ı tuşlayın.");
            int durum = kullanici.nextInt();
            if (durum == 0){
                for(int i = 0; i < kapasite; i++){
                    System.out.println((i+1) + ". Alandaki araç -> " + araclar[i]);
                }
            }
            else
                System.out.println("Hatalı giriş yapıldı! Tekrar deneyiniz.");
        }


    }
}

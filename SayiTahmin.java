
import java.util.Scanner;

public class SayiTahmin {
    public static void main(String[] args){

        Scanner kullanici = new Scanner(System.in);



        int random = (int)(Math.random() * 30);
        System.out.println("Random sayı oluşturuldu. Sayı 0-30 arasında.");

        int hak = 3;

        while (hak > 0){
            System.out.println("Tahmin yapınız:");
            int tahmin = kullanici.nextInt();

            if (tahmin == random){
                System.out.println("Tebrikler sayıyı bildiniz!\n" +
                        "Kalan hakkınız -> " + hak);
                break;
            }
            else{
                hak--;
                System.out.println("Yanlış tahmin\n" +
                        "Kalan hakkınız -> " + hak);
            }

            if(hak == 0){
                System.out.println("Random sayıyı bilemediniz!\n" +
                        "Random sayı -> " + random);
            }
        }


    }
}

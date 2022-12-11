
import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args){

        Scanner kullanici = new Scanner(System.in);

        System.out.println("1. Sayıyı giriniz:");
        int sayi1 = kullanici.nextInt();
        System.out.println("2. Sayıyı giriniz:");
        int sayi2 = kullanici.nextInt();

        int toplama = sayi1 + sayi2;
        int cikarma = sayi1 - sayi2;
        int bolme = sayi1 / sayi2;
        int carpma = sayi1 * sayi2;

        System.out.println("Toplama işlemi için -> 1" +
                "\nÇıkarma işlemi için -> 2" +
                "\nBölme işlemi için -> 3" +
                "\nÇarpma işlemi için -> 4");

        int tercih = kullanici.nextInt();

        switch (tercih){
            case 1: System.out.println(toplama); break;
            case 2: System.out.println(cikarma); break;
            case 3: System.out.println(bolme); break;
            case 4: System.out.println(carpma); break;
            default: System.out.println("Hatalı giriş yapıldı.");
        }

    }
}

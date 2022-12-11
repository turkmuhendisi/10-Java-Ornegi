
import java.util.Scanner;

public class Gunler {
    public static void main(String[] args){

        Scanner kullanici = new Scanner(System.in);

        System.out.println("Haftanın kaçıncı günündesiniz?\n" +
                "Pazartesi -> 1\n" +
                "Salı -> 2\n" +
                "Çarşamba -> 3\n" +
                "Perşembe -> 4\n" +
                "Cuma -> 5\n" +
                "Cumartesi -> 6\n" +
                "Pazar -> 7");

        int gun = kullanici.nextInt();

        switch (gun){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5: System.out.println("Gün -> " + gun + "\nHafta içi"); break;
            case 6:
            case 7: System.out.println("Gün -> " + gun+ "\nHafta sonu"); break;
            default: System.out.println("Hatalı giriş yapıldı!");
        }



    }
}


import java.util.Scanner;

public class Alancevre {
    public static void main(String args[]){

        Scanner kullanici = new Scanner(System.in);

        final float PI = 3.14f;

        System.out.println("Yarıçapı cm cinsinden giriniz");
        int yaricap = kullanici.nextInt();

        System.out.println("Alan hesabı için 1\nÇevre hesabı için 2' yi tuşlayın.");
        int tercih = kullanici.nextInt();

        float alan = PI * yaricap * yaricap;
        float cevre = 2 * PI * yaricap;

        switch (tercih){
            case 1: System.out.println(yaricap + " cm yarıçaplı dairenin alanı " + alan + " cm"); break;
            case 2: System.out.println(yaricap + " cm yarıçaplı dairenin çevresi " + cevre + " cm"); break;
            default: System.out.println("Hatalı giriş yapıldı!");
        }


    }
}

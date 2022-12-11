
import java.util.Scanner;

public class VKI {
    public static void main(String args[]){

        Scanner kullanici = new Scanner(System.in);

        System.out.println("Boyunuzu metre cinsinden giriniz");
        float boy = kullanici.nextFloat();

        System.out.println("Kilonuzu KG cinsinden giriniz");
        float kilo = kullanici.nextFloat();

        float vki = kilo / (boy * boy);

        if(vki >= 25){
            System.out.println("VKİ -> " + vki + "\nKilolu");
        }
        else if((vki < 25) && (vki >= 20)){
            System.out.println("VKİ -> " + vki + "\nNormal");
        }
        else{
            System.out.println("VKİ -> "+ vki + "\nZayıf");
        }


    }
}

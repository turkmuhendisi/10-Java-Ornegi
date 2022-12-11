
import java.util.Scanner;

public class KanPh {
    public static void main(String[] args){

        Scanner kullanici = new Scanner(System.in);

        System.out.println("Kanınızın ph değerini giriniz:");
        float ph = kullanici.nextFloat();

        if((ph >= 7.35) && (ph <= 7.45)){
            System.out.println("Kanınızın ph değeri -> " + ph + "\nKanınızın ph değeri normal.");
        }
        else if (ph < 7.35){
            System.out.println("Kanınızın ph değeri düşük.");
        }
        else if (ph > 7.45){
            System.out.println("Kanınızın ph değeri yüksek.");
        }

    }
}

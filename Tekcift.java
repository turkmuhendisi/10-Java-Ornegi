
import java.util.Scanner;

public class Tekcift {
    public static void main(String args[]){

        Scanner kullanici = new Scanner(System.in);

        int sayi = kullanici.nextInt();

        if(sayi % 2 == 0){
            System.out.println(sayi + " Çift");
        }
        else{
            System.out.println(sayi + " Tek");
        }

    }
}

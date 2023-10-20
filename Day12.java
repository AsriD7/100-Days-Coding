package day12;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double harga;
        System.out.print("masukkan harga = ");
        harga = input.nextInt();
        if (harga >= 1000000){
            System.out.println("Dapat diskon 20%");
            double diskon = 20 * harga/100;
            harga = harga - diskon;
        }else if (harga >= 500000){
            System.out.println("Dapat diskon 10%");
            double diskon = 10 * harga/100;
            harga-=diskon;
        }else if (harga >= 200000){
            System.out.println("Dapat diskon 5%");
            double diskon = 5 * harga/100;
            harga-=diskon;
        }else {
            System.out.println("Anda tidak dapat diskon");
        }
            
        System.out.println("Harga yg harus anda bayar = "+harga);
    }
    
}

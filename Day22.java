package Day22;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hasil, angka;
        
        System.out.print("Masukkan angka = ");
        angka = input.nextInt();
        hasil = angka % 2;
        String k = hasil == 0?"Genap":"Ganjil";
        System.out.println("Hasilnya = "+k);
    }
    
}

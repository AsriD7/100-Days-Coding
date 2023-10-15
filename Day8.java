package y16;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        int gajip, gajil, lembur, gajib, gajilt;
        gajil = 55000;
        System.out.print("Masukkan gaji pokok : ");
        gajip = masuk.nextInt();
        System.out.print("Lama lembur/jam : ");
        lembur = masuk.nextInt();
        gajilt = 55000 * lembur;
        System.out.println("gaji lembur total : "+gajilt);
        gajib = gajip + gajilt;
        System.out.println("Gaji bersih anda : Rp"+gajib);
        
        
    }
    
}

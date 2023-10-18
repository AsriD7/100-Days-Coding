package y10;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama, alamat, pajak;
        int gaji;
        System.out.println("[====Nama Karyawan====]");
        System.out.print("\nNama\t : ");
        nama = input.nextLine();
        System.out.print("Alamat\t : ");
        alamat = input.nextLine();
        System.out.print("Gaji\t : Rp. ");
        gaji = input.nextInt();
        pajak = gaji >= 5000000? "Kena pajak 10%":
        gaji >= 3000000? "Kena pajak 5%":"Tidak kena pajak";
        System.out.println("Pajak\t : "+pajak);
        System.out.println("\n==================");
        
    }
    
}

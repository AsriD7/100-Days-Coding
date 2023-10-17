package y17;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama, ttl, alamat;
        int tgl, bl, tahun;
        System.out.print("Nama\t\t : ");
        nama = input.nextLine();
        System.out.print("Alamat\t\t : ");
        alamat = input.nextLine();
        System.out.print("Tempat Lahir\t : ");
        ttl = input.nextLine();
        System.out.print("Tanggal Lahir\t : ");
        tgl = input.nextInt();
        System.out.print("Bulan Lahir\t : ");
        bl = input.nextInt();
        System.out.print("Tahun\t\t : ");
        tahun = input.nextInt();
        System.out.println("===========================");
        System.out.println("Nama\t : "+nama);
        System.out.println("TTL\t : "+ttl+" "+tgl+'/'+bl+'/'+tahun);
        
      
    }
}

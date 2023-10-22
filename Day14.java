package Day14;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan, a1=0, a2, pj, pg, pk;
        double pb=0;
        System.out.println("===Kalkulator===\n");
        System.out.println("1. Penjumlahan\n2. Pengurangan\n3. Perkalian\n4. Pembagian");
        System.out.print("Operasi = ");
        pilihan = input.nextInt();
        if (pilihan == 1){
            System.out.print("\nmasukkan angka : ");
            a1 = input.nextInt();
            System.out.print("masukkan angka : ");
            a2 = input.nextInt();
            pj = a1 + a2;
            System.out.println(a1+" + "+a2+" = "+pj);
        }else if (pilihan == 2){
            System.out.print("\nmasukkan angka : ");
            a1 = input.nextInt();
            System.out.print("masukkan angka : ");
            a2 = input.nextInt();
            pg = a1 - a2;
            System.out.println(a1+" - "+a2+" = "+pg);
        }else if (pilihan == 3){
            System.out.print("\nmasukkan angka : ");
            a1 = input.nextInt();
            System.out.print("masukkan angka : ");
            a2 = input.nextInt();
            pk = a1 * a2;
            System.out.println(a1+" x "+a2+" = "+pk);
        }else if (pilihan == 4){
            System.out.print("\nmasukkan angka : ");
            a1 = input.nextInt();
            System.out.print("masukkan angka : ");
            a2 = input.nextInt();
            pb = a1 / a2;
            System.out.println(a1+" : "+a2+" = "+pb);
        
        }else{ 
            System.out.print("Salah memasukkan");
            
        }
        
    }
    
}

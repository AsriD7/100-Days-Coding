package Day25;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan batas angka : ");
        int a = sc.nextInt();
        for(int i=0;i<a;i++){
            System.out.print("masukkan angka :");
            int angka = sc.nextInt();
            if(angka==0){
                System.out.println("netral");
            }else if(angka%2==0){
                System.out.println("genap");
            }else{
                System.out.println("ganjil");
            }
        }
        System.out.println("\n================");
    }
}

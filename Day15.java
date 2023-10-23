package Day15;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nilai;
        String hasil;
        System.out.print("masukkan nilai : ");
        nilai = input.nextInt();
        hasil = nilai > 10 ? "salah" :
        nilai >= 9 ? "Baik sekali":
        nilai >= 7 ? "Baik" :
        nilai >= 5 ? "cukup":
        nilai >= 1 ? "kurang":"salah";
        System.out.println("nilai anda : "+ hasil);
       
    }
    
}

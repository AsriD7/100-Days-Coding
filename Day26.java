package Day26;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan a: ");
        int a = input.nextInt();
        System.out.print("Masukkan b: ");
        int b = input.nextInt();
        if(a < b){
            for(int i = a; i <= b; i++){
                System.out.print(i+" ");
            }
        }else{
            for(int i = b; i <= a; i++){
                System.out.print(i+" ");
            }
            }
     }
}

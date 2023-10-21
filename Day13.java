package Day13;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double L, a, t, h; 
        System.out.print("Alas = ");
        a = input.nextDouble();
        System.out.print("Tinggi = ");
        t = input.nextDouble();
        L = 0.5 * ( a * t );
        h = a * t;
        System.out.println("L = 0.5 x ( a x t )");
        System.out.println("L = 0.5 x "+"( "+a+" x "+t+" )");
        System.out.println("L = 0.5 x "+"( "+h+" )");
        System.out.println("L = "+L+" cm²");
        
    }
    
}

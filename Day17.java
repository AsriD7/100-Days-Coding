package Day17;

public class Main {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        // Operator AND (&&)
        boolean hasilAnd = a && b;
        System.out.println("a && b = " + hasilAnd);

        // Operator OR (||)
        boolean hasilOr = a || b;
        System.out.println("a || b = " + hasilOr);

        // Operator NOT (!)
        boolean hasilNotA = !a;
        System.out.println("!a = " + hasilNotA);

        boolean hasilNotB = !b;
        System.out.println("!b = " + hasilNotB);
    }
}

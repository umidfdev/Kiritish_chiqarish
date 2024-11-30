// Umidov Alimardon.
import java.util.Scanner;
public class Main {
    // Kvadrat yuzini aniqlovchi dastur.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Obyekt.

        float a;
        final float S;

        System.out.print("Kvadrat tomonini kiriting:"); // Input savol.
        a = in.nextFloat(); // Input read.
        System.out.println("qabul qilindi☑️");

        S = (float) Math.pow(a,2); // Main expression

        System.out.println("Kub yuzasi: " +S);  // Output



    }
}
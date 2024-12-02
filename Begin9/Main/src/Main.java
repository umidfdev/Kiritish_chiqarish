import java.util.Scanner;
// Umidov Alimardon.
class Main {
    // Ikkita manfiy bo'lmagan son o'rta geometrigni topuvchi dastur.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);  // Scanner obyketi.

        float a,b ;
        final float geo ;

        System.out.print("1-sonni kiriting:");
        a = in.nextFloat();
        if (a<0) {
            System.out.println("mustab bo'lsin qaytdan!!!.");
            return;
        }

        System.out.print("2-sonni kiriting:");
        b = in.nextFloat();
        if (b<0) {
            System.out.println("mustab bo'lsin qaytdan!!!.");
            return;
        }

        geo = (float) Math.sqrt(a*b);         // Main expression.

        System.out.println("o'rta geometrik: "+geo);  // Output.




    }
}
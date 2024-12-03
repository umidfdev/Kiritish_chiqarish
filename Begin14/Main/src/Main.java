import java.util.Scanner;
//Umidov Alimardon.
class Main {
    // Aylana uzunligi va yuzasini topuvchi dastur.
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);  // Scanner obyekt.

    float R ;
    final float S,L,pi;
    pi = (float) Math.PI;

    System.out.print("R ni kiriting:");
    R = in.nextFloat();
    if (R < 0) {
        R = Math.abs(R);
    }
    System.out.println(R+" qabul qilindi!");


    L = 2*pi *R;         /* Asosiy epressionlar. */
    S = pi * (float) Math.pow(R,2);

    System.out.println("Uzunligi: "+L+ " Yuzasi: "+S);  // Output.



    }
}
import java.util.Scanner;
// Umidov Alimardon
class Main {
    // Aylana radiusini topuvchi dastur.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Scanner obyekti.

        float S;                  /* Describing variables. */
        final float R,L,pi;
        pi = (float) Math.PI;

        System.out.print("S:");          /* Iniput */
        S = in.nextFloat();

        R = (float)  Math.sqrt((S/pi)) ;      /* Main expressins. */
        L = 2*pi*R;


        System.out.println("Aylana radiusi: "+R);     /* Output. */
        System.out.println("Aylana uzunligi: "+L);

    }
}

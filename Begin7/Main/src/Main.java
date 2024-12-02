import java.util.Scanner;
// Umidov Alimardon.
class Main{
    // Doira uzunligi va yuzasini topuvchii dastur.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Scanner obyekt.

        float r;
        final float L,S,pi ;

        System.out.print("r ni kiriting:");     /* Question and input.*/
         r = in.nextFloat();


        pi = (float) Math.PI;        //     O'zgarmas PI.

        L = 2*pi*r;                         /* Asosiy formulalar. */
        S = pi*(float) Math.pow(r,2);

        System.out.println("uzunligi: " + L);    /* Output. */
        System.out.println("yuzasi: " + S);




    }
}
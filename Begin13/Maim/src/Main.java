import java.util.Scanner ;
class Main {
    //  S1,S2, S3=S1-S2  dasturi.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);  // Scanner obyekti.

        float R1, R2 ;
        final float S1,S2,S3,pi ;
        pi = (float) Math.PI;

        System.out.print("R1 ni kiriting:");
        R1 = in.nextFloat();


        System.out.print("R1 ni kiriting:");
        R2 = in.nextFloat();
        if (R1 <= R2) {
            System.out.println("R1>R2 bo'lishi kerak!!!, Qaytadan.");
            return;
        }

        S1 = pi * R1;       /* Asosiy expressionlar. */
        S2 = pi * R2;
        S3 = (S1 -S2);

        System.out.println("S1: "+S1);        /* Outputlar. */
        System.out.println("S2: "+S2);
        System.out.println("S3: "+S3);



    }
}
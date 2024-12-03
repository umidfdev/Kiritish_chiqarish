import java.util.Scanner;


// Umidov Alimardon
class Main {
    // Bu dastur sonlar oqida masofalarni topib beradi.
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        float A,B,C;
        final float AC,BC ;
        System.out.print("A ni kiritng:");
        A = in.nextFloat();
        System.out.print("B ni kiritng:");
        B = in.nextFloat();
        System.out.print("C ni kiritng:");
        C = in.nextFloat();

        if ( A<=0 || B <=0 || C<=0 ) {
            A = Math.abs(A);
            B = Math.abs(B);
            C = Math.abs(C);
        }

        AC =  Math.abs(A-C);
        BC =  Math.abs(B-C);

        System.out.println("AC: "+AC);
        System.out.println("BC: "+BC);
        System.out.println("uzunliklar yig'indisi: "+(AC+BC));



    }
}
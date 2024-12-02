// Umidov Alimardon
import java.util.Scanner;
class Main {
    // Paralelipiped hajmi va tsirti aniqlansin.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Scanner obyekti.

        float a,b,c ;
        final float V,S ;

        System.out.print("a ni kiriting:");   /*Questions and inputs*/
        a = in.nextFloat();
        System.out.print("b ni kiriting:");
        b = in.nextFloat();
        System.out.print("c ni kiriting:");
        c = in.nextFloat();

        V = a*b*c ;                   /* Main expressions.*/
        S = 2*(a*b+b*c+a*c);

        System.out.println("Paralelipiped hajmi: "+V);      /* Outputs.*/
        System.out.println("Paralelipiped to'la sirti: "+S);


    }
}
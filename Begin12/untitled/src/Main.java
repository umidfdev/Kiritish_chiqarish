// Umidov Alimardon
import java.util.Scanner;
class Main {
    // Gipotenza va perimetr topuvchi dastur.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float a,b,c ;
        final float P ;

        System.out.print("a ni kiriting:");
        a = in.nextFloat();
        if ( a<=0 ) {   
            a = (float) Math.abs(a);
        }
        System.out.println("olindi: "+a);
        System.out.print("b ni kiriting:");
        b = in.nextFloat();
        if ( b<=0 ) {
            b = (float) Math.abs(b);
        }
        System.out.println("olindi: "+b);

        c = (float) Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        P = a+b+c ;

        System.out.println("Gipotenuza: " +c);
        System.out.println("Perimetr: " +P);




    }
}
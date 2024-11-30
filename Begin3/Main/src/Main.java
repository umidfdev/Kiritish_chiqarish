// Umidov Alimardon
import java.util.Scanner;
public class Main {
    // To'g'ri uchburchakning yuzi va p-sini topuvchi dastur.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Obyekt.

        float a,b ;
        final float S,P ;

        System.out.print("1-tomonni kiriting:");
        a = in.nextFloat(); 
        System.out.print("2-tomonni kiriting:");
        b = in.nextFloat();

        S = a*b ;
        P = 2*(a+b);

        System.out.println("Yuza: " +S);
        System.out.println("Perimetr "+ P);
    }
}
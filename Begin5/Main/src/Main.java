// Umidov Alimadon
import java.util.Scanner;
public class Main {
    // Kub hajmi va to'la sirtini topuvchi dastur.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float a;
        final  float V,S;

        System.out.print("Kub tomonini kiriting!:");
        a = in.nextFloat();;

        V = (float) Math.pow(a,3);
        S = 6*a;

        System.out.println("Hajmi: "+V);
        System.out.println("TSirti: "+S);


    }
}
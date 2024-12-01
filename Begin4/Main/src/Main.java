// Umidov Alimardon
import java.util.Scanner;
class Main {
    // Aylana diametri orqali uning uzunligini topish.
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);  //Obyekt

        float d;
        final float L,pi ;
        pi = (float) Math.PI;

        System.out.print("diametrni kiriting:");
        d = in.nextFloat();

        L = d*pi ;

        System.out.printf("%.2f <== javob", L); //Format specifier ishlatildi!

    }
}

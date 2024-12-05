import java.util.Scanner;
// Umidov Alimardon.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float X,A;
        System.out.print("Nechi kg kanfet:");
        X = Math.abs(in.nextFloat());
        System.out.print("Kanfetnign 1kg narxi:");
        A = Math.abs(in.nextFloat());
       /* System.out.print("Y:");
        Y = in.nextFloat();*/

        System.out.println("Summa: "+(A*X));



    }
}
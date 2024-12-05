import java.util.Scanner;
// Umidov Alimardon.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float A,B,X ;

        while (true) {
            System.out.print("A:");
            A = in.nextFloat();
            if (A != 0) {
                break;
            }
            System.out.println("A 0 ga teng bo'lmasin!");
        }
        System.out.print("B:");
        B = in.nextFloat();

        X = -B/A ;

        System.out.println("Nomalum qiymat: "+X);

    }
}
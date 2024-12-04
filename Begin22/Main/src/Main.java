import java.util.Scanner;
// Umidov Alimardon.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);  // Scanner Object

        float A,B;

        System.out.print("A:");
        A = in.nextFloat();
        System.out.print("B:");
        B = in.nextFloat();

        A = B;        /* SWAP */
        B = A;

        System.out.println("A: "+A+" | B: "+B); // Output.

    }
}
import java.util.Scanner;
// Umidov Alimardon.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);  // Scanner Object

        float A,B,temp;

        System.out.print("A:");
        A = in.nextFloat();
        System.out.print("B:");
        B = in.nextFloat();

        temp = A;
        A = B;        /* SWAP */
        B = temp;

        System.out.println("A: "+A+" | B: "+B); // Output.

    }
}
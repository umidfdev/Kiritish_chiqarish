import java.util.Scanner;
// Umidov Alimardon.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float A,B,C,temp;


        System.out.print("A:");
        A = in.nextFloat();
        System.out.print("B:");
        B = in.nextFloat();
        System.out.print("C:");
        C = in.nextFloat();

        temp = A;
        A = C;
        C = B;
        B = temp;

        System.out.println("A: "+A);
        System.out.println("B: "+B);
        System.out.println("C: "+C);


    }
}
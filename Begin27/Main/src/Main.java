import java.util.Scanner;
// Umidov Alimardon.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float A;
        System.out.print("Soni kiriting:");
        A = in.nextFloat();

        System.out.println("Apow2: "+(float)(Math.pow(A,2)));
        System.out.println("Apow4: "+(float)(Math.pow(A,8)));
        System.out.println("Apow8: "+(float)(Math.pow(A,8)));



    }
}
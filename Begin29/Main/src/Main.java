import java.util.Scanner;
// Umidov Alimardon.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float a,radianda;

        System.out.print("a:");
        a = (Math.abs(in.nextFloat()));

        radianda = (float) Math.toRadians(a);

        System.out.println(radianda);

    }
}
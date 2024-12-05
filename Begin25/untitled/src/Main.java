import java.util.Scanner;
// Umidov Alimardon.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float x;

        System.out.print("x-ni kiriting:");
        x = in.nextFloat();

        System.out.println("Natija: "+(float)(3* (Math.pow(x,6)) - 6* (Math.pow(x,2)) -7  ) );




    }
}
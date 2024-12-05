import java.util.Scanner;
// Umidov Alimardon
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float x;

        System.out.print("x-ni kiriting:");
        x = in.nextFloat();

        System.out.println("Natija: "+(4*(Math.pow(x-3,6)) -7*(Math.pow((x-3),3)) +2));




    }
}
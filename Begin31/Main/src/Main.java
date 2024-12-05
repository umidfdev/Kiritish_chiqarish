import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float Tf ;
        final float Tc;

        System.out.print("Qiymatni bering:");
        Tf = in.nextFloat();

        Tc = (Tf-32)*5/9;

        System.out.println("Tc da qiymat: "+Tc);


    }
}
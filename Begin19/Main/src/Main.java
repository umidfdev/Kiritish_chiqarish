import java.util.Scanner;
// Umidov Alimardon.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float x1,x2,y1,y2;
        final float boyi,eni;

        System.out.print("x1:");
        x1 = Math.abs(in.nextFloat());
        System.out.print("x2:");
        x2 = Math.abs(in.nextFloat());
        System.out.print("y1:");
        y1 = Math.abs(in.nextFloat());
        System.out.print("y2:");
        y2 = Math.abs(in.nextFloat());

        boyi = Math.abs(y2-y1);
        eni = Math.abs(x2-x1);

        System.out.println("Perimetri: "+2*(boyi+eni));
        System.out.println("Yuzi: "+(boyi*eni));

    }
}
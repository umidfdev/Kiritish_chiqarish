import java.util.Scanner;
// Umidov Alimardon.
public class Main {
    // Tekislikdagi ikkita nuqta orasidagi masofani topuvchi dastur.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float x1,x2,y1,y2,masofa;

        System.out.print("x1:");
        x1 = Math.abs(in.nextFloat());
        System.out.print("x2:");
        x2 = Math.abs(in.nextFloat());
        System.out.print("y1:");
        y1 = Math.abs(in.nextFloat());
        System.out.print("y2:");
        y2 = Math.abs(in.nextFloat());

        masofa = (float) Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));

        System.out.println("Masofa: "+masofa);

    }
}
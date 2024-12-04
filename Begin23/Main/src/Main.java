import java.util.Scanner;
// Umidov Alimardon.
public class Main {
    // A,B,C larning qoymatini almashtiruvchi dastur.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float A,B,C,temp;

        System.out.print("A:");         /* Questions and input */
        A = in.nextFloat();
        System.out.print("B:");
        B = in.nextFloat();
        System.out.print("C:");
        C = in.nextFloat();

        temp = A;             /* Temp->> A-ni xotiraga olib qoyadi. */
        A = B;   // Endi A yoq!!
        B = C;
        C = temp;

        System.out.println("A: "+A);        /* Output */
        System.out.println("B: "+B);
        System.out.println("C: "+C);


    }
}
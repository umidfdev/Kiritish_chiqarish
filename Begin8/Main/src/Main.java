import java.util.Scanner;
// Umidov Alimardon.
class Main {
    // Berilgan ikkita sonnig o'rta arifmetigini topish.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Scanner obyekt.

        float a,b ;
        final float Arif;

        System.out.print("1-sonni kiriting:");  /* Savol va inputlar */
        a = in.nextFloat();
        System.out.print("2-sonni kiriting:");
        b = in.nextFloat();

        Arif = (a+b)/2;  // main expression.

        System.out.println("O'rta arifmetik: " + Arif); //Output.

    }
}
import java.util.Scanner;
// Umidov Alimardon.
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float A,B,C;                /* Declaratsiyalar.*/
        final float AC,BC;

        System.out.print("A:");        /* Question & Input.*/
        A = in.nextFloat();
        System.out.print("B:");
        B = in.nextFloat();
        System.out.print("C:");
        C = in.nextFloat();

        if (A>=B || B<=C || A>=C ) {           /* Conditional statement. */
            System.out.println("Xato =>> A kichik, B katta, C o'rtacha bo'lsin! ");
            return;
        }

        AC = Math.abs(A-C);                 /* Asosiy expressionlar. */
        BC = Math.abs(B-C);

        System.out.println("Uzunliklar ko'paytmasi: "+(AC*BC));     /* Output. */

    }
}
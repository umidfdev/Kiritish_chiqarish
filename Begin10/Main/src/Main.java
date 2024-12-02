import java.util.Scanner;

// Umidov Alimardon.
class Main {
    // sonlar !=0 ular yig'indisi,ko'paytmasi va har biri kvsi.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Scanner obyekti.

        float a, b;


        System.out.print("1-sonni kiriting:");
        a = in.nextFloat();
        if (a == 0) {
            System.out.println("0 ga teng bolmasin.");
            return;
        }
        System.out.print("2-sonni kiriting:");
        b = in.nextFloat();
        if (b == 0) {
            System.out.println("0 ga teng bolmasin.");
            return;
        }


        System.out.println("yig'indi: " + (a + b)); // Yig'indisi.
        System.out.println("ayirma: " + (Math.abs(a - b))); // Ayirmasi.
        System.out.println("1-son kvsi: " + Math.pow(a, 2)); // 1-kvadrati.
        System.out.println("2-son kvsi: " + Math.pow(b, 2)); // 2-kvadrati.


    }
}
import java.util.Scanner;

// Umidov Alimaron
class Main {
    // 2 ta son berilgan ular yig'indisi,ko'paytmasi va moduli.
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in); // Scanner obyekti

        float a, b;

        System.out.print("1-son:");
        a = in.nextFloat();
        if (a == 0) {
            System.out.println("0 dan tashqari son kiriting!");
            return;
        }
        System.out.print("2-son:");
        b = in.nextFloat();
        if (b == 0) {
            System.out.println("0 dan tashqari son kiriting!");
            return;
        }

        System.out.println("Sum: " + (a + b));  // Their sum
        System.out.println("Product: " + (a * b));  // Their product
        System.out.println("1-chi moduli: " + Math.abs(a));  // 1th's module
        System.out.println("2-moduli: " + Math.abs(b));  // 2th's module


    }
}
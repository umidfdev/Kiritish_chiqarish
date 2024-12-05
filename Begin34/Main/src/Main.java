import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float A,X,Y,B ; // A,X - shokalad,B,Y-kanfet.
        System.out.print("Shokalad miqdori:");
        X = in.nextFloat();
        System.out.print("Shokalad 1kg summasi:");
        A = in.nextFloat();
        System.out.println("Qabul qilindi☑️");
        System.out.print("Kanfet miqdori:");
        Y = in.nextFloat();
        System.out.print("Kanfet 1kg summasi:");
        B = in.nextFloat();

        if (A<=B) {
            System.out.println("Xato Shokaladning kg/sum si kanfetnikidan qimmat bolishi kerak!");
            return;
        }


        System.out.println("Shokalad kanfetdan "+( A-B )+ " so'm ga qimmat!") ;



    }
}
import java.util.Scanner;
// Umidov Alimardon.
class Main{
    // Absissa o'qida masofani topish.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float x1,x2 ;

        System.out.print("x1:");
        x1 = in.nextFloat();
        System.out.print("x2:");
        x2 = in.nextFloat();

        System.out.println("uznlik: "+ (Math.abs(x1-x2)));



    }
}
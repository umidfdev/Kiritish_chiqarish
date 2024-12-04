import java.util.Scanner;
// Umidov Alimardon
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float x1,x2,x3,y1,y2,y3;
        final float S,p,a,b,c;

        System.out.print("x1:");
        x1 = Math.abs(in.nextFloat());
        System.out.print("x2:");
        x2 = Math.abs(in.nextFloat());
        System.out.print("x3:");
        x3 = Math.abs(in.nextFloat());
        System.out.print("y1:");
        y1 = Math.abs(in.nextFloat());
        System.out.print("y2:");
        y2 = Math.abs(in.nextFloat());
        System.out.print("y3:");
        y3 = Math.abs(in.nextFloat());


        a = (float) Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
        b = (float) Math.sqrt(Math.pow((x3-x1),2) + Math.pow((y3-y1),2));
        c = (float) Math.sqrt(Math.pow((x3-x2),2) + Math.pow((y3-y2),2));

        p = (a+b+c)/2;
        S = (float)  Math.sqrt(p*(p-a)*(p-b)*(p-c));

        System.out.println("P: "+p);
        System.out.println("S: "+S);


    }
}
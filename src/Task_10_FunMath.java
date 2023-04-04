import java.util.Scanner;

public class Task_10_FunMath {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        double x = scan.nextDouble();
        double x = 4.78;
        double z = 2 * Math.pow(Math.sin(3 * Math.PI - 2 * x), 2) * Math.pow(Math.cos(5 * Math.PI + 2 * x), 2);
        double y = 0.25 - 0.25 * Math.sin(5.0 / 2 * Math.PI - 8 * x);
//        double y = 4*4;
        System.out.printf("%1.5f %1.5f", z, y);
//        System.out.println(y);
    }


}

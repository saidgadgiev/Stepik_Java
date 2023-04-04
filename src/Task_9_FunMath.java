import java.util.Scanner;

/* Задание на скриншоте*/
public class Task_9_FunMath {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();
        double res = Math.log(x + 7 * Math.sqrt(Math.pow(x, 4) + Math.PI));
        System.out.printf("%6.4f", res);

    }
}

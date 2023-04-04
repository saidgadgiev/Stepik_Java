import java.util.Scanner;

/*Найти минимальное из пяти целых чисел, введенных пользователем.*/
public class Task_14_Vetvlenie_min {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();//4
        int num2 = scan.nextInt();//7
        int num3 = scan.nextInt();//3
        int num4 = scan.nextInt();//1
        int num5 = scan.nextInt();//8
        int min = 0;
        if(num1 < num2) min = num1;
        if(num1 > num2) min = num2;
        if(min > num3) min = num3;
        if(min > num4) min = num4;
        if(min > num5) min = num5;
        System.out.println(min);

    }
}

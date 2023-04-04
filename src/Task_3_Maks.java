import java.util.Locale;
import java.util.Scanner;

/*
* Ввести два вещественных числа. Найти максимальное из них*/
public class Task_3_Maks {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); // если по умолчанию дробная часть отделяеться запятой
        Scanner scan = new Scanner(System.in);
        double number1 = scan.nextDouble();
        double number2 = scan.nextDouble();

        System.out.println(number1>number2 ? number1:number2);
    }
}

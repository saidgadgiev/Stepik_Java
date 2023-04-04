/*На вход программы подается размер интервала времени в секундах.
 Переведите это в часы, минуты и секунды и выведите согласно примеру теста.

Тестовые данные
Sample Input:

20367
Sample Output:

5 часов 39 минут 27 секунд*/

import java.util.Scanner;

public class Task_7_ClockConvert {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//20367
        int num = scan.nextInt();
        int hour = num / 3600;
        int min = num % 3600 / 60;
        int sek = num % 3600 % 60;
        System.out.printf("%d часов %d минут %d секунд", hour, min, sek);


    }
}

/*Пользователь вводит целое трехзначное число. Вывести сумму его нечетных цифр.
Если число не является трехзначным, вывести "ERROR".
Если нечетных цифр нет, то вывести "NO".
Номер теста	Входные данные	Выходные данные
1	            367	            10
2	            -351	        9
3	            268	            NO
4	            116	            2
5	            -246	        NO
6	            4786	        ERROR
7	            -362	        3*/

import java.util.Scanner;

public class Task_12_Vetvlenie {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int res = 0;
        int num = Math.abs(scan.nextInt());
        if (num < 100 | num > 999){
            System.out.print("ERROR");
            return;
        }
        int num1 = num /100;
        int num2 = num / 10 % 10;
        int num3 = num % 10;
//        System.out.println(num3);
        if (num1 % 2 != 0) res = res + num1;
        if(num2 % 2 != 0) res = res + num2;
        if (num3 % 2 != 0) res = res +num3;
        if (res == 0) {
            System.out.print("NO");
            return;
        }
        System.out.println(res);

    }
}

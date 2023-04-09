package cikl;

import java.util.Scanner;

/*Пользователь вводит произвольное целое число (оно может быть отрицательным).
Найдите количество цифр в числе и сумму цифр.

Выведите через пробел сначала количество, а потом сумму цифр.
Номер теста	Входные данные	Выходные данные
1	            4579	        4 25
2	            0	            1 0
3	            1234567	        7 28
4	            22	            2 4
5	            -128	        3 11
*/
public class Task_7_doWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        int summ = 0;
        int x = Math.abs(scan.nextInt());
        do {
            count += 1;
            summ = x % 10 + summ;
            x = x/10;
        }
        while (x != 0);
        System.out.printf(count + " " +summ);

    }
}

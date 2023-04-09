package cikl;

import java.util.Scanner;

/*Выполните задачу с использованием цикла do-while.

Пользователь вводит целое число (контрольное число). А затем вводится
произвольное количество положительных целых чисел. Признаком конца
ввода является любое отрицательное число.

Подсчитать во вводимой последовательности количество положительных делителей контрольного числа.
Номер теста	Входные данные      	        Выходные данные
1	            78
            5 6 4 1 26 28 -5	                3
2	            56
            9 2 1 78 28 13 14 4 -9	            5
3	            17
            2 3 4 9 -1	                        0
4	            33
            1 33 4 3 11 7 6 -2	                4*/
public class Task_6_doWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int count = 0;
        int b;
        do {
            b = scan.nextInt();
            if (a % b == 0 & b > 0) count += 1;
        }
        while (b > 0);
        System.out.println(count);
    }
}

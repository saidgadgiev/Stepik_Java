package cikl;

import java.util.Scanner;

/*Выполните задачу с использованием цикла for.

Найти минимальное число в последовательности целых чисел.

Пользователь вводит количество целых чисел, а затем сами числа через пробел.
Номер теста	Входные данные	                        Выходные данные
1	            6
            2 8 -1 4 0 9	                            -1
2	            10
            -22 -3 -5 -4 -8 -9 -35 -7 -15 -28	        -35
3	            8
            5 8 9 3 2 7 18 33	                        2
4	            3
            0 0 0	                                    0
5	            2
            -4 -4	                                    -4
6	            3
            5 5 5	                                    5*/
public class Task_2_for {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int min = 9999;
        for (int i = 0; i < a; i++){
            int b = scan.nextInt();
            if (min > b) min = b;
        }
        System.out.println(min);
    }
}

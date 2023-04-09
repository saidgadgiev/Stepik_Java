package cikl;

import java.util.Scanner;

/*Выполните задачу с использованием цикла for.

Найти сумму делителей целого положительного числа. Например, вводится число 12.
Сумма его делителей: 1+2+3+4+6+12=28.
Номер теста	Входные данные	Выходные данные
1	            12	            28
2	            56	            120
3	            6	            12
4	            78	            168*/
public class Task_3_far {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int summ = 0;
        int x = scan.nextInt();
        for (int i = 1; i <= x; i++){
//            System.out.println(i);
//            System.out.println(x%i);
            if (x%i == 0) summ = summ + i;
        }
        System.out.println(summ);

    }
}

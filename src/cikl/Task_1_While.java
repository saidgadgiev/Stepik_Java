package cikl;

import java.util.Scanner;

/*Выполните задачу с использованием цикла while.

Пользователь вводит 10 оценок ученика (в 10-балльной системе). Нужно подсчитать,
сколько среди них неудовлетворительных оценок (менее 4 баллов)
Номер теста	Входные данные	        Выходные данные
1	        6 7 3 2 9 5 4 1 7 8	            3
2	        5 7 8 9 9 10 7 4 9 8	        0
3	        1 2 3 1 2 3 1 2 3 4	            9
4	        6 7 4 4 4 2 3 8 6 7	            2*/
public class Task_1_While {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int neud  = 0;
        int i = 0;
        while (i < 10){
            int ocenka = scan.nextInt();
            if (ocenka < 4) neud +=1;
            i++;
        }
        System.out.println(neud);
    }
}

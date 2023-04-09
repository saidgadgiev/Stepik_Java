/*Выполните задачу с использованием цикла while.

Пользователь вводит 10 оценок ученика (в 10-балльной системе). Нужно подсчитать,
сколько среди них неудовлетворительных оценок (менее 4 баллов)*/
import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int neud = 0;
        int i = 0;
        while (i < 10){
            int ocenka = scan.nextInt();
//            System.out.println(ocenka);
            if (ocenka < 4) neud = neud + 1;
            i++;
        }
        System.out.println(neud);
    }
}

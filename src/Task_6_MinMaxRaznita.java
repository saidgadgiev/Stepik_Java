/*В отделе работают 3 сотрудника, которые получают заработную плату
в рублях. Требуется определить, на сколько зарплата самого
высокооплачиваемого из них отличается от самого низкооплачиваемого.
Пользователь вводит три целых числа (три зарплаты в рублях).
Программа выводит разность зарплат в рублях.

Используйте тернарную операцию!

Тестовые данные
Sample Input:

6000 12000 10500
Sample Output:

6000*/

import java.util.Scanner;

public class Task_6_MinMaxRaznita {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        if (num1 > num2 & num1>num3) {
            if (num2 < num3)
                System.out.println(num1 - num2);
            else
                System.out.println(num1 - num3);
        }
        if(num2>num1 & num2>num3){
            if (num1<num3)
                System.out.println(num2 - num1);
            else System.out.println(num2 - num3);
        }
        if (num3>num1 & num3>num2) {
            if (num1 < num2)
                System.out.println(num3 - num1);
            else System.out.println(num3 - num2);
        }


// второй способ
//        int one,two,three;
//        one=scan.nextInt();
//        two=scan.nextInt();
//        three=scan.nextInt();
//        int max=one>two?one:two;
//        max=three>max?three:max;
//        int min=one<two?one:two;
//        min=three<min?three:min;
//        System.out.println(max-min);






    }
}

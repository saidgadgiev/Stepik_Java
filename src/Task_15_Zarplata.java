/*Программа должна определить зарплату служащего компании. Пользователь
вводит количество отработанных часов (целое) и почасовой тариф
(вещественное). Компания платит обычный тариф за первые 20 часов
(включительно),  полуторный тариф за время, отработанное от 20 до 40 часов
(включительно), и двойной тариф за время свыше 40 часов.

Например, если служащий отработал 42 часа, а почасовой тариф 10.5 рублей, то он получит

20*10.5=210 рублей за первые 20 часов;

20*10.5*1.5=315 рублей за вторые 20 часов;

2*10.5*2=42 рубля за последние 2 часа.

Итого 210+315+42=567 рублей.

Вывести зарплату служащего, округлив ее до двух знаков после десятичной точки.
Если введено отрицательное значение количества часов или отрицательный тариф, вывести ERROR.

Номер теста	Входные данные	Выходные данные
1	        42  10.5	        567.00
2	        -12 34.2	        ERROR
3	        12  -3	            ERROR
4	        15  20.5	        307.50
5	        25  14.3	        393.25
6	        60  13.4	        1206.00*/

import java.util.Scanner;

public class Task_15_Zarplata {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int chas = scan.nextInt();
        double tarif = scan.nextDouble();
        double zarplata = 0;
        if (chas < 0 | tarif < 0){
            System.out.println("ERROR");
            return;
        }
        if (chas > 0) zarplata = obicnii(chas, tarif);
        if (chas > 20) zarplata = zarplata + polutorn(chas, tarif);
        if (chas > 40) zarplata = zarplata + dvoinoi(chas, tarif);
        System.out.printf("%4.2f", zarplata);
    }
    public static double obicnii(int a, double b){
        if (a >=20){
            double res = 20 * b;
            return res;
        }
        double res = a * b;
        return res;
    }
    public static double polutorn(int a, double b){
        if (a >= 40) {
            double res = 20 * b * 1.5;
            return res;
        }
        double res = (a-20) * b*1.5;
        return  res;
    }
    public  static  double dvoinoi(int a, double b){
        double res = (a-40) * b * 2;
        return res;
    }
}

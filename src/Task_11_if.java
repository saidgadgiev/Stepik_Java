/*Пользователь вводит координаты двух точек на плоскости (в первой строке через пробел -
координата X и координата Y первой точки, затем во второй строке также через пробел
координаты второй точки). Нужно определить, какая из точек ближе к началу координат.

Выводится одно из сообщений: "Первая точка ближе", "Вторая точка ближе", "Точки на равных расстояниях".

Подсказка: расстояние до начала координат находится по формуле:
Тестовые данные
Sample Input 1:

3.5 -1.5
2 4.8
Sample Output 1:

Первая точка ближе
Sample Input 2:

2.2 -4.1
4.1 2.2
Sample Output 2:

Точки на равных расстояниях*/


import java.util.Scanner;

public class Task_11_if {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x1 = scan.nextDouble();
        double y1 = scan.nextDouble();
        double x2 = scan.nextDouble();
        double y2 = scan.nextDouble();
        double d1 = Math.sqrt(Math.pow(x1,2) + Math.pow(y1, 2));
        double d2 = Math.sqrt(Math.pow(x2,2) + Math.pow(y2, 2));
        System.out.println(d1);
        System.out.println(d2);
        if (d1<d2) System.out.println("Первая точка ближе");
        if (d1>d2) System.out.println("Вторая точка ближе");
        if (d1==d2) System.out.println("Точки на равных расстояниях");

    }
}

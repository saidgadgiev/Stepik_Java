import java.util.Scanner;

/* Грузовой самолет должен пролететь с грузом из пункта А в пункт С через
пункт В. Емкость бака для топлива у самолета – 300 литров. Потребление
топлива на 1 км в зависимости от веса груза у самолета следующее:

          - до 500 кг  (включительно) :    1 литров / км

          - до 1000 кг (включительно):   4 литров / км

          - до 1500 кг (включительно):   7 литров / км

          - до 2000 кг (включительно):   9 литров / км.

          - более 2000 кг – самолет не поднимает.

Пользователь вводит расстояние между пунктами А и В,  расстояние между
пунктами В и С, а также вес груза. Программа должна рассчитать какое
минимальное количество топлива необходимо для дозаправки самолету в
пункте В, чтобы долететь из пункта А в пункт С. В случае невозможности
преодолеть любое из расстояний – программа должна вывести ERROR.

Числовой результат работы программы округляется до двух знаков после десятичной точки.
Номер теста	Входные данные	Выходные данные
1	        200 200 300	        100.00
2	        136 268 600	        ERROR
3	        136 268 400	        104.00
4	        136 150 400	        0.00
5	        150 120 2500	    ERROR
6	        150 400 200	        ERROR
7	        400 150 200	        ERROR
8	        200 150 500	        50.00
9	        20 60 600	        20.00
10	        80 60 600	        ERROR*/
public class Task_16_Zapravka {
    public static void main(String[] args) { // объем бака 300 литров
        Scanner scan = new Scanner(System.in);
        int a_b = scan.nextInt();//136 км
        int b_c = scan.nextInt();//150 ки
        int vesGruza = scan.nextInt();
        if (a_b>300 | b_c>300){
            System.out.println("ERROR");
            return;
        }
        if (vesGruza <= 500){ //1 литр на киллометр
            double rez = a_b + b_c - 300; //400 литр
            if (rez < 0){
                System.out.printf("%4.2f", 0.00);
                return;
            }
            System.out.printf("%4.2f", rez);
            return;
        }
        if (vesGruza <= 1000){// 4 литр на кил
            if ((a_b*4)>300 | (b_c*4)>300){
                System.out.println("ERROR");
                return;
            }
            double rez = (a_b + b_c) * 4 - 300;
            System.out.printf("%4.2f", rez);
            return;
        }
        if (vesGruza <= 1500){ // 7 лит на кил
            if ((a_b*7)>300 | (b_c*7)>300){
                System.out.println("ERROR");
                return;
            }
            double rez = (a_b + b_c) * 7 - 300;
            System.out.printf("%4.2f", rez);
            return;
        }
        if(vesGruza <=2000 ) { // 9 лит на кил
            if ((a_b * 9) > 300 | (b_c * 9) > 300) {
                System.out.println("ERROR");
                return;
            }
            double rez = (a_b + b_c) * 9 - 300;
            System.out.printf("%4.2f", rez);
            return;
        }
        if (vesGruza > 2001) System.out.println("самолет не поднимает");
    }
}

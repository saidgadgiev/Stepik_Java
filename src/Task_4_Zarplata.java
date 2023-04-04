import java.util.Scanner;

/*
* Зарплата менеджера состовляет 100$ плюс 5% от продаж. Пользователь
* вводит общую сумму сделок менеджера за месяц (в доллорах).
* Определить итоговую зарплату менеджера*/
public class Task_4_Zarplata {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int summ = scan.nextInt();
        final int BASA = 100;
        final int PROCENT = 5;

        int zarplata = BASA + summ *PROCENT /100;
        System.out.println(zarplata);
    }
}

import java.util.Scanner;
/*Пользователь вводит номер месяца. Нужно вывести название месяца на русском языке.

Если номер неверный, то нужно вывести "Ошибка".*/
public class Task_13_Vetvlenie {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        String[] arr = {"Январь",
                "Февраль", "Март",
                "Апрель", "Май",
                "Июнь", "Июль",
                "Август", "Сентябрь",
                "Октябрь", "Ноябрь",
                "Декабрь"
        };

        if (num < 12 & num > 0) System.out.println(arr[num-1]);
        else System.out.println("Ошибка");


    }
}

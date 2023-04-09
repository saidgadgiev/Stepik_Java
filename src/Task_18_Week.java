import java.util.Scanner;

/*Пользователь вводит целое число - номер дня недели. Нужно вывести  "Working day",
если это рабочий день,  "Saturday" - если суббота, и "Sunday" - если воскресенье.
При неправильном номере дня недели  выводится "ERROR".

Используйте оператор switch. Нумерация дней недели  - с понедельника (номер 1).
Номер теста	Входные данные	Выходные данные
1	            3	        Working day
2	            6	        Saturday
3	            7	        Sunday
4	            1	        Working day
5	            5	        Working day
6	            -3	        ERROR
7	            8	        ERROR*/
public class Task_18_Week {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int week = scan.nextInt();
        switch (week){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Working day");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("ERROR");
        }
    }
}

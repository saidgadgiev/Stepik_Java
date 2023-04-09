import java.util.Scanner;

/*Напишите программу- переводчик. Пользователь вводит название дня недели на русском языке,
а программа выводит это название на английском. При этом на русском можно вводить название
как с большой буквы, так и с маленькой. А на английском день недели - имя собственное,
поэтому выводится с большой буквы.

Если  название дня недели введено неверно, то программа выводит "ERROR".

Используйте оператор switch.
Номер теста	Входные данные	Выходные данные
1	        Понедельник	        Monday
2	        понедельник	        Monday
3	        Воскресенье	        Sunday
4	        воскресенье	        Sunday
5	        март	            ERROR
6	        Четверг	            Thursday
7	        среда	            Wednesday
8	        Вторник	            Tuesday
9	        пятница	            Friday
10	        суббота	            Saturday
11	        Суббота	            Saturday
12	        Saturday	        ERROR*/
public class Task_17_Perevodchik {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String week = scan.next();
        week = week.toLowerCase();
        switch (week) {
            case "понедельник":
                System.out.println("Monday");
                break;
            case "вторник":
                System.out.println("Tuesday");
                break;
            case "среда":
                System.out.println("Wednesday");
                break;
            case "четверг":
                System.out.println("Thursday");
                break;
            case "пятница":
                System.out.println("Friday");
                break;
            case "суббота":
                System.out.println("Saturday");
                break;
            case "воскресенье":
                System.out.println("Sunday");
                break;
            default:
                System.out.println("ERROR");
        }
    }
}

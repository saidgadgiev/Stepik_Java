import java.util.Scanner;

/*Пользователь вводит с клавиатуры денежную сумму в рублях и копейках
(рубли и копейки вводятся в разные переменные). Программа должна
откорректировать введенную сумму в правильную форму. Например, если
пользователь ввел 22 и 978 , то программа должна вывести 31 р. 78 к.
Sample Input:
22 978
Sample Output:
31 р. 78 к.*/
public class Task_5_vivid_rub_kop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = 22;
        int num2 = 978;
        int rub = num2/100+num1;
        int kop = num2%100;
        System.out.printf("%d р. %d к.", rub, kop);

    }
}

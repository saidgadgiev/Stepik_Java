package cikl;
import java.util.Scanner;
/*Ввести целое число (количество цифр заранее неизвестно). Вывести цифры этого числа в обратном порядке.*/
public class Task_5_doWhile {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int number=scan.nextInt();
        do{
            int cyf=number%10;
            System.out.print(cyf+" ");
            number/=10;
        }while(number!=0);
    }
}

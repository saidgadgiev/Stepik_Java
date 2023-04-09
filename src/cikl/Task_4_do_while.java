package cikl;
import java.util.Scanner;
/*Вводить целые числа до тех пор, пока пользователь не введет 0. Подсчитать количество нечетных чисел. */
public class Task_4_do_while {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int x; //вводимое число
        int number=0;//количество нечетных чисел
        do{
            x=scan.nextInt();
            if(x%2!=0){
                number++;
            }
        }while(x!=0);
        System.out.println(number);
    }
}

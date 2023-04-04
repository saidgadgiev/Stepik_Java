/*
* ВВести двухзначное положительное число. Ввывести его последнюю и первую цифры
*/

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        int lasnDigit = number % 10; // посл цифра
        int firstDigit = number / 10; // первая цифра поск число двухзначное
        System.out.println(lasnDigit);
        System.out.println(firstDigit);
    }
}

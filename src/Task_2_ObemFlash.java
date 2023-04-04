import java.io.File;
import java.util.Scanner;

/*
* Пользовател вводит с клавиаьтуры обьем флешки в гигабайтах. Подсчитать,
* сколько на нее поместиться фильмов со средним размером 760 Мб и
* музыкальных клипов обьемом 95 мб. При этом сначала на флешку записываються
* фильмы, пока для них есть место. Когда фильм уже не помешаеться(но место еще осталось),
* далее записываються клипы. Также поджсчитать, какой объем в мб останеться в конце
*/
public class Task_2_ObemFlash {
    public static void main(String[] args) {
        final int FILM = 760;
        final int CLIP = 95;
        Scanner scan = new Scanner(System.in);
        int volume = scan.nextInt();
        volume *= 1024; // переводим в мегобайты

        int films = volume / FILM; // количество фильмов: деление нацело на объем одного фильма
        volume %= FILM; // остаеться после записи фильмов
        int clips = volume / CLIP; // Количество клипов
        int remain = volume % CLIP; // останеться после записи клипов

        System.out.println(films);
        System.out.println(clips);
        System.out.println(remain);
    }

}

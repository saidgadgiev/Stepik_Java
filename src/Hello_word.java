import java.util.Scanner;
public class Hello_word {

    public static void main(String[] args) {
//        System.out.print("Hello world ");
//        System.out.println("Hello world");
//        System.out.println("Mother" + " Son " + "Father");
        int i=70;
        int j=5000;

//        System.out.println("i="+i); //вывод i=7
//        System.out.println("i+j="+i+j); //вывод i+j=75
//        System.out.println("i+j="+(i+j)); //вывод i+j=12
//        System.out.println(i+j); //вывод 12
        System.out.printf("i=%d fgd j=%d\n",i,j);
//        System.out.printf("i=%-5d k=%5d\n",i,j);//i выравнивается влево в 5 позициях, k - вправо
//        int rub=3,kop=0;
//        System.out.printf("%03d руб. %04d коп.",rub,kop);//выводится: 03 руб. 00 коп.
//        double x=3.123456;
//        System.out.printf("x=%6.3f\n",x);//число выводится в 8 позициях
//и округляется до 2 знаков после запятой
        // Ввод с консоли
//        String name;
        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter yor name and click Enter: ");
//        name = scan.next();// Read line befor the gap
//        System.out.println("Hello, "+name);
//        int age;
//        System.out.println("Enter you age: ");
//        age = scan.nextInt();// Read line befor the gap and convert int
//        System.out.println("Your age - "+ age);

//hasNextInt() позволяет проверить,
// что следующий элемент потока ввода
// может быть преобразован в целое число.
        int age;
        System.out.println("Введите свой возраст: ");
        if(scan.hasNextInt()) {//проверка того, что далее в потоке целое число
            age = scan.nextInt(); //Читает строку до пробела и преобразует в int
            System.out.println("Ваш возраст - " + age);
        }else{
            System.out.println("Неверные данные о возрасте!");
        }
    }
}

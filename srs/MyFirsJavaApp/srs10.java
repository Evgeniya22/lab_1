package MyFirsJavaApp;
import java.util.Scanner;


public class srs10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int m1 = in.nextInt();
        System.out.println("Введите второе число число: ");
        int m2 = in.nextInt();
        System.out.println("Сумма ="+(m2+m1));
        System.out.println("Разность ="+(m2-m1));
        in.close();    }
}
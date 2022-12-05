package lab2;


import java.util.Scanner;
public class example3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число");
        int x = in.nextInt();

        if (x > 10) {
            System.out.println("Введенное число ,больше 10");
        }

        if (x % 4 == 0 ) {
            System.out.println("Введенное число число делится на 4");
        }
        else {

            System.out.println("Введенное число не удовлетворяет критериям");
        }

    }
}

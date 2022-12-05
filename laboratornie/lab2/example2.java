package lab2;

import java.util.Scanner;
public class example2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число");
        int x = in.nextInt();

        if (x % 5  == 2 ) {
            System.out.println("Введенное число делится на 5  с остатком 2");
        }

            if (x % 7  == 1 ) {
                System.out.println("Введенное число делится на 7  с остатком 1");
            }
                       else {

            System.out.println("Введенное число не удовлетворяет критериям");
        }

    }
}





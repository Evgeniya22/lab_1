package lab2;


import java.util.Scanner;
public class example5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int a = in.nextInt();
        int b = a / 1000;
        int c = b % 10;
        System.out.println("Колличесвто тысяч в числе = " + c);
    }
}
package laba1;

import java.util.Scanner;
public class srs4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите название месяца");
        String Month = in.nextLine();
        System.out.println("Введите число");
        int day = in.nextInt();
        if (day > 31) {
            System.out.println("В " + Month + " число должно быть меньше 31 ");
            in.close();
        } else {
            System.out.println("В " + Month + " " + day + " дней");
            in.close();
        }
    }
}
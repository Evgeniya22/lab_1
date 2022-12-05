package lab1;

import java.util.Scanner;

public class srs3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите название месяца: ");
        String getDate = in.nextLine();
        System.out.println("Введите число: ");
        String date = in.nextLine();

        System.out.println(getDate + " " + date );
        in.close();
    }
}
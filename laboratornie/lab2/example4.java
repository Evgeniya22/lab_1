package lab2;


import java.util.Scanner;
public class example4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число");
        int num = in.nextInt();

        if(num>=5 && num<=10)
        {
            System.out.println("Введенное число попадает в диапозон");
        }
        else
        {
            System.out.println("Введенное число не попадает в диапозон");
        }
        in.close(); }
    }
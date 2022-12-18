package timus3;
 import  java.io.PrintWriter;
 import java.util.Scanner;

public class task_1409 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();
        int b = in.nextInt();

        int number0fCans = a + b - 1;

        int harry = number0fCans - a;
        int larry = number0fCans - b;

        out.println(harry + " " + larry);
        out.flush();

    }
}

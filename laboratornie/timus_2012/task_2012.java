package timus_2012;

import  java.io.PrintWriter;
        import  java.util.Scanner;

public class task_2012 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int number0fTasks = in.nextInt();

        int difference = 12 - number0fTasks;
        int time = difference * 45;
        String result = time <=240 ? "YES" : "NO";

        out.println(result);
        out.flush();

    }
}

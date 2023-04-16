package timus_2semak;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task_1924 {
    public static void main(String[] args) throws IOException {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(consoleReader.readLine());
        consoleReader.close();

        if ((n * (n + 1) / 2) % 2 == 0)
            System.out.println("black");
        else
            System.out.println("grimy");
    }
}
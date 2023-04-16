package timus_2semak;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static java.lang.System.*;

public class task_1777 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        List<Long> list = new ArrayList<>();

        list.add(in.nextLong());
        list.add(in.nextLong());
        list.add(in.nextLong());

        in.close();

        int x = 0;
        while (true) {
            ++x;
            long minDiff = Long.MAX_VALUE;

            for (int i = 1; i < list.size(); i++)
                for (int j = 0; j < i; j++)
                    minDiff = Math.min(minDiff, Math.abs(list.get(i) - list.get(j)));

            if (minDiff == 0) {
                out.println(x);
                break;
            }

            list.add(minDiff);
        }
    }
}
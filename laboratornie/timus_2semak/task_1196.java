package timus_2semak;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class task_1196 {
    public class Task_1196 {

        public static void main(String[] str) throws IOException {
            BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));

            int n = Integer.parseInt(consoleReader.readLine());
            Map<Integer, Boolean> map = new HashMap<>(n);

            for (int i = 0; i < n; i++)
                map.put(Integer.parseInt(consoleReader.readLine()), true);

            int matched = 0;
            int m = Integer.parseInt(consoleReader.readLine());

            for (int i = 0; i < m; i++)
                if (map.get(Integer.parseInt(consoleReader.readLine())) != null) matched++;

            consoleReader.close();
            System.out.println(matched);
        }
    }
}
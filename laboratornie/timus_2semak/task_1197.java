package timus_2semak;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class task_1197 {
    public class Task_1197 {

        public static void main(String str[]) throws Exception {
            BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));

            int size = 8;
            int[] dx = {-2, -2, 2, 2, -1, 1, -1, 1};
            int[] dy = {1, -1, 1, -1, 2, 2, -2, -2};

            int n = Integer.parseInt(consoleReader.readLine());
            List<String> tests = new ArrayList<>(n);

            for (int i = 0; i < n; i++)
                tests.add(consoleReader.readLine().toLowerCase());


            for (String s : tests) {
                int column = s.charAt(0) - 'a';
                int row = s.charAt(1) - '1';

                int currentX, currentY, positionCount = 0;
                for (int i = 0; i < size; i++) {
                    currentX = column + dx[i];
                    currentY = row + dy[i];
                    if (currentX >= 0 && currentX < size && currentY >= 0 && currentY < size)
                        positionCount++;
                }
                System.out.println(positionCount);
            }
        }
    }
}
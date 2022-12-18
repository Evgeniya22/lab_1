package timus_2100;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task_2100 {

    public static void main(String[] args) {

        String inputFileName = "laboratornie/timus_2100/input.txt";
        boolean oj = System.getProperty("ONLINE_JUDGE") != null;
        int marshalAndLilly = 2;
        try
        {
            BufferedReader bufferedReader =
                    oj ? new BufferedReader(new InputStreamReader(System.in)) :
                            new BufferedReader(new FileReader(inputFileName));
            String readLine = "";
            int number0fFriends = 0;
            int number0fPairs = 0;
            while ((readLine = bufferedReader.readLine()) != null) {
                if (number0fFriends == 0){
                    number0fFriends = Integer.parseInt(readLine);
                    continue;
                }
                if (readLine.contains("+")){
                    number0fPairs++;
                }
            }
            int result;
            int guests = (marshalAndLilly + number0fFriends + number0fPairs);
            if (guests == 13){
                result = (guests * 100)+100;
            } else {
                result = guests * 100;
            }

            System.out.println(result);
        }
        catch (IOException exception){
            exception.printStackTrace();
        }
    }
}

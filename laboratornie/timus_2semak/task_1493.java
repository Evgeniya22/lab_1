package timus_2semak;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class task_1493 {

private static int getSum(int n) {
        int h = n / 100;
        return (n - ((h << 6) + (h << 5) + (h << 2))) / 10 + h;
        }

public static void main(String str[]) throws Exception {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        String numberLine = consoleReader.readLine();
        consoleReader.close();

        int firstNumber = Character.getNumericValue(numberLine.charAt(0))
        + Character.getNumericValue(numberLine.charAt(1))
        + Character.getNumericValue(numberLine.charAt(2));

        int secondNumber = Integer.parseInt(numberLine.substring(3));

        int last = Character.getNumericValue(numberLine.charAt(5));
        int increment = getSum(secondNumber + 1);
        int decrement = getSum(secondNumber - 1);
        if (last != 9)
        increment += last + 1;
        if (last == 0)
        decrement += 9;
        else
        decrement += last - 1;
        if (firstNumber == increment || firstNumber == decrement)
        System.out.println("Yes");
        else
        System.out.println("No");
        }
        }
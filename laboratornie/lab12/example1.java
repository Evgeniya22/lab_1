package lab12;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class example1 {

    public static List<Integer> getEvenNumbers(int[] input) {
        List<Integer> evenNumbers = new ArrayList<>();
        for (int number : input) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }
        return evenNumbers;
    }

    public static void main(String[] args) {
        int[] nums = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println(getEvenNumbers(nums));
    }
}

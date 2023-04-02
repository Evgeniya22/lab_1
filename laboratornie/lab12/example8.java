package lab12;

import java.util.ArrayList;
import java.util.List;

public class example8 {
    public static List<Integer> getGreaterNumbers(List<Integer> input, int minValue) {
        List<Integer> result = new ArrayList<>();
        for (int number : input) {
            if (number > minValue) {
                result.add(number);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<Integer>();;
        int index = 0;
        for (int i = 1; i <=10; i++) {
            arr1.add(index, i);
            index++;
        }
        System.out.println(getGreaterNumbers(arr1, 7));
    }
}

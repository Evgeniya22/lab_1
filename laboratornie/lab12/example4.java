package lab12;

import java.util.ArrayList;
import java.util.List;

public class example4 {
    public static List<Integer> getSquares(List<Integer> input) {
        List<Integer> squares = new ArrayList<>();
        for (int number : input) {
            squares.add(number * number);
        }
        return squares;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<Integer>();;
        int index = 0;
        for (int i = 1; i <=10; i++) {
            arr1.add(index, i);
            index++;
        }
        System.out.println(getSquares(arr1));
    }
}

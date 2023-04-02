package lab12;
import java.util.ArrayList;
import java.util.List;
public class example6 {
    public static List<Integer> getDivisibleNumbers(List<Integer> input) {
        List<Integer> result = new ArrayList<>();
        for (int number : input) {
            if (number % 2 == 0) {
                result.add(number);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        int index = 0;

        //Добавление
        for (int i = 1; i <= 10; i++) {
            arr1.add(index, i);
            index++;
        }
        System.out.println(getDivisibleNumbers(arr1));
    }
}

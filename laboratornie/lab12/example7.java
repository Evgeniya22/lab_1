package lab12;


import java.util.ArrayList;
import java.util.List;
public class example7 {
    public static List<String> getLongerStrings(List<String> input, int minLength) {
        List<String> result = new ArrayList<>();
        for (String s : input) {
            if (s.length() > minLength) {
                result.add(s);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        ArrayList<String> arr1 = new ArrayList<String>();
        arr1.add(1, "Мышь");
        arr1.add(2, "утка");
        System.out.println( getLongerStrings(arr1, 3));
    }
}

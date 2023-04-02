package lab12;
import java.util.ArrayList;
import java.util.List;
public class example5 {
    public static List<String> getStringsContaining(List<String> input, String substring) {
        List<String> result = new ArrayList<>();
        for (String s : input) {
            if (s.contains(substring)) {
                result.add(s);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<String> arr1 = new ArrayList<String>();
        arr1.add(1, "Мышь");
        arr1.add(2, "утка");
        System.out.println( getStringsContaining(arr1, "Мышь"));
    }
}

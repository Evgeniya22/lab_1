package lab12;
import java.util.ArrayList;
import java.util.List;

public class example3 {
    public static List<String> getCapitalizedStrings(List<String> input) {
        List<String> capitalizedStrings = new ArrayList<>();
        for (String s : input) {
            if (!s.isEmpty() && Character.isUpperCase(s.charAt(0))) {
                capitalizedStrings.add(s);
            }
        }
        return capitalizedStrings;
    }

    public static void main(String[] args) {
        ArrayList<String> arr1 = new ArrayList<String>();
        arr1.add(1, "Мышь");
        arr1.add(2, "утка");
        System.out.println(getCapitalizedStrings(arr1));
    }
}

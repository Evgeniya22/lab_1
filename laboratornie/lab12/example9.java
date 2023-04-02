package lab12;

import java.util.ArrayList;
import java.util.List;

public class example9 {

    public static List<String> getAlphaStrings(List<String> input) {
        List<String> result = new ArrayList<>();
        for (String s : input) {
            if (s.chars().allMatch(Character::isLetter)) {
                result.add(s);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<String> arr1 = new ArrayList<String>();
        arr1.add(1, "Мышь");
        arr1.add(2, "утка");
        System.out.println( getAlphaStrings(arr1));
    }
}

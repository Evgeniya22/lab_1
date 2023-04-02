package lab12;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class example2 {
    public static List<Integer> getIntersection(int[] array1, int[] array2) {
        List<Integer> intersection = new ArrayList<>();
        Arrays.sort(array2);
        for (int number : array1) {
            if (Arrays.binarySearch(array2, number) >= 0) {
                intersection.add(number);
            }
        }
        return intersection;
    }
    public static void main(String[] args) {
        int[] nums1 = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] nums2 = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println(getIntersection(nums1, nums2));
    }
}

package lab6;
import java.util.Arrays;

public class example10_MinMax {
    static int[] arrMM (int ...arr) {
        int[] a = new int[2];
        Arrays.sort(arr);
        a[0] = arr[0];
        a[1] = arr[arr.length - 1];
        return a;
    }
}

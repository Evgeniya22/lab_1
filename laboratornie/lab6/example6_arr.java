package lab6;

public class example6_arr {
    static int[] arrRet (int[] arr, int value) {
        int c;
        int[] ar;
        if(value>arr.length) {
            ar = new int[arr.length];
            c = arr.length;
        } else {
            ar = new int[value];
            c = value;
        }
        System.arraycopy(arr, 0, ar, 0, c);

        return ar;
    }
}

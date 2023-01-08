package lab6;

public class example8_sr {
    static double getSr(int[] arr) {
        double sum = 0;
        for (int a : arr) {
            sum += a;
        }
        return sum / arr.length;
    }
}

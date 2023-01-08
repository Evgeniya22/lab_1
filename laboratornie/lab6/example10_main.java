package lab6;
import java.util.Arrays;
import java.util.Scanner;

public class example10_main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int size = input.nextInt();
        int a[] = new int[size];
        System.out.println("Введите числа массива: ");
        for (int i = 0; i < size; i++) {
            a[i] = input.nextInt();
        }
        System.out.println("Min и Max значение:\n" + Arrays.toString(example10_MinMax.arrMM(a)));
    }
}

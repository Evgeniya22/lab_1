package lr11_zadanie3;
import java.util.*;
import java.util.Scanner;

public class example3 {

    public static void vv1(int x, ArrayList<Integer> arr){
        if (x != 0){
            arr.add(x);
            vv1(x - 1, arr);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Scanner id1 = new Scanner(System.in);
        System.out.println("Сколько чисел хотите добавить?");
        int x1 = id1.nextInt();
        vv1(x1, arr);
        Collections.sort(arr);
        System.out.println("Array:" + arr);
    }
}
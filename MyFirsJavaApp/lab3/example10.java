package lab3;
import java.util.Random;
import java.util.Scanner;
public class example10 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int Size = id.nextInt();
        System.out.println("Размер массива равен "+ Size);
        int[] nums = new int[Size];
        Random random = new Random();
        for (int i = 0 ; i < nums.length ; i++ ){
            nums[i] = random.nextInt(200);
            System.out.println("Элемент массива ["+i+"] = " + nums[i]);
        }
        for(int i = nums.length ; i >= 0 ; i--) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[j + 1]) {
                    int tmp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = tmp;
                }
            }
        }
        System.out.println("Произведена сортировка массива");
        for (int i = 0 ; i < nums.length ; i++ ){
            System.out.println("Элемент массива ["+i+"] после сортировки =" + nums[i]);
        }
    }
}
package timus_1082;
import java.util.Scanner;

public class task_1082 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextInt();
        for (int i = 0; i < a; i++){
            System.out.print(i);
            if (i != a){
                System.out.print(" ");
            }
        }
    }
}

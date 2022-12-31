package timus_1068;
import java.util.Scanner;
public class task_68 {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int a = in.nextInt();
            if (a >= 1){
                System.out.print((a*(a+1))/2);
            }
            else {
                System.out.println(-((-a)*(1-a))/2+1);
            }
        }
    }

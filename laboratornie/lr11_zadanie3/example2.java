package lr11_zadanie3;
import java.util.Scanner;
public class example2 {

        public static void dv(int x){
            StringBuffer strBuffer = new StringBuffer();
            if (x != 0){
                strBuffer.append(x % 2);
                dv(x / 2);
            }
            System.out.print(strBuffer.reverse());
        }

        public static void main(String[] args) {
            Scanner id = new Scanner(System.in);
            System.out.println("Введите число для перевода в двоичную систему счисления");
            int x = id.nextInt();
            dv(x);
        }
    }
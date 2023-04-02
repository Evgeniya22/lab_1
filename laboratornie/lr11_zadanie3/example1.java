package lr11_zadanie3;
import java.util.Scanner;
public class example1 {
    private static int step = 0;
    public static void m1(int x){
        System.out.println("x= " + x);
        if ((2 * x + 1) < 20){
            m1(2 * x + 1);
        }
    }

    public static void m2(int x){
        if ((2 * x + 1) < 20){
            m2(2 * x + 1);
        }
        System.out.println("x= " + x);
    }

    public static void m3(int x){
        space();
        System.out.println(" " + x + " ->");
        step++;
    }

    public static void m31(int x){
        space();
        System.out.println(" " + x + " <-");
    }

    public static int fact(int n){
        int result;
        if (n == 1) return 1;
        else {
            result = fact(n - 1) * n;
            return result;
        }
    }

    public static int fib(int n){
        System.out.println("n = " + n);
        if(n == 0){
            return 0;
        } else if (n == 1){
            return 1;
        } else {
            return fib(n - 2) + fib(n - 1);
        }
    }

    public static void space( ){
        for (int i = 0; i < step; i++){
            System.out.println(" ");
        }
    }
    public static void main(String[] args){
        Scanner id1 = new Scanner(System.in);
        System.out.println("Номер варианта, который вам интересен:\n" +
                "1. Для заданного параметра x вывести последовательность значений элементов числового ряда\n" +
                " в соответствии со следующими требованиями: x = 2 * x + 1; 0 <= x <= 20.\n" +
                "2. Вывести последовательность, представленную в 1 варианте, в обратном порядке.\n" +
                "3. Вычислить факториал числа n.\n" +
                "4. Вывести число Фибоначи, заданное его номером в последовательности.\n");
        int f = id1.nextInt();
        switch(f) {
            case 1:
                Scanner id2 = new Scanner(System.in);
                System.out.println("Введите x");
                int x1 = id2.nextInt();
                m1(x1);
                break;
            case 2:
                Scanner id3 = new Scanner(System.in);
                System.out.println("Введите x");
                int x2 = id3.nextInt();
                m2(x2);
                break;
            case 3:
                Scanner id4 = new Scanner(System.in);
                System.out.println("Введите n");
                int x3 = id4.nextInt();
                System.out.println(fact(x3));
            case 4:
                Scanner id5 = new Scanner(System.in);
                System.out.println("Введите n");
                int x4 = id5.nextInt();
                System.out.println(fib(x4));
            default:
                System.out.println("Такого выбора у вас нет");
                break;
        }
    }
}